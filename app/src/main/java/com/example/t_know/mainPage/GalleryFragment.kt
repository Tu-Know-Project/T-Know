package com.example.t_know.mainPage

import BaseFragment
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.t_know.R
import com.example.t_know.databinding.FragmentGalleryBinding

class GalleryFragment : BaseFragment<FragmentGalleryBinding>(
    R.layout.fragment_gallery,
    FragmentGalleryBinding::inflate
) {

    private lateinit var photoList: MutableList<String>
    private lateinit var adapter: GalleryAdapter
    private val PICK_IMAGE = 1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        photoList = mutableListOf()
        adapter = GalleryAdapter(photoList)

        binding.recyclerViewPhotos.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = this@GalleryFragment.adapter
        }

        binding.buttonAddPhoto.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(intent, PICK_IMAGE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE && resultCode == Activity.RESULT_OK && data != null) {
            val selectedImage: Uri? = data.data
            selectedImage?.let {
                photoList.add(it.toString())
                adapter.notifyDataSetChanged()
                binding.recyclerViewPhotos.smoothScrollToPosition(photoList.size - 1)
            }
        }
    }
}
