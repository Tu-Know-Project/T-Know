package com.example.t_know.mainPage

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.t_know.databinding.TakoDialogBinding
import com.example.t_know.mapPage.MapActivity

class TakoDialogFragment : DialogFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isCancelable = true
    }

    private lateinit var binding: TakoDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TakoDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.modalCloseBtn.setOnClickListener {
            dismiss()
        }
        binding.detailTakoBtn.setOnClickListener {
            val intent = Intent(activity, TakoActivity::class.java)
            startActivity(intent)
            dismiss()
        }
    }
}
