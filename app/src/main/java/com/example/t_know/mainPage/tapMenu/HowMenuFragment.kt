package com.example.t_know.mainPage.tapMenu

import BaseFragment
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.t_know.R
import com.example.t_know.databinding.FragmentHowMenuBinding
import com.example.t_know.mainPage.how.comute.ComuteActivity
import com.example.t_know.mainPage.how.enrolment.EnrolmentMainActivity
import com.example.t_know.mainPage.how.lib.LibMainActivity
import com.example.t_know.mainPage.how.scholarship.ScholarshipMainActivity

class HowMenuFragment : BaseFragment<FragmentHowMenuBinding>(
    R.layout.fragment_how_menu,
    FragmentHowMenuBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickHowIcon()
    }

    private fun clickHowIcon(){
        binding.btnScholarship.setOnClickListener {
            startActivity(Intent(activity, ScholarshipMainActivity::class.java))
        }

        binding.btnLibrary.setOnClickListener {
            startActivity(Intent(activity, LibMainActivity::class.java))
        }
        binding.btnGoToSchool.setOnClickListener {
            startActivity(Intent(activity, ComuteActivity::class.java))
        }
        binding.btnOther.setOnClickListener {
            startActivity(Intent(activity, EnrolmentMainActivity::class.java))
        }
    }
}
