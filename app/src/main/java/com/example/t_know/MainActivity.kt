package com.example.t_know

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.t_know.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter by lazy {
        MainViewPager(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initTab()
        lifecycleScope.launch {
            while (isActive){
                delay(3000)
                val currentPage = binding.fragmentContainer.currentItem
                val totalPages = binding.fragmentContainer.adapter?.itemCount ?: 0
                val nextPage = (currentPage + 1) % totalPages
                binding.fragmentContainer.setCurrentItem(nextPage, true)
            }
        }

    }

    private fun initTab() {

        with(binding) {
            fragmentContainer.adapter = adapter
            TabLayoutMediator(storeFragmentTablayout, fragmentContainer) { tab, position ->
                tab.text = when (position) {
                    0 -> "어디있지?"
                    1 -> "뭐 먹지?"
                    2 -> "어떻게 해?"
                    3 -> "이건 뭐지?"
                    else -> ""
                }
            }.attach()
        }
    }
}