package com.example.t_know.mainPage.what.integrated.academic

import BaseFragment
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.t_know.R
import com.example.t_know.databinding.FragmentWhatIntegratedInformationAcademicAdministrationFourBinding
import com.example.t_know.mainPage.how.scholarship.ScholarshipMainActivity
import com.example.t_know.mainPage.what.integrated.IntegratedMainActivity
import com.example.t_know.mainPage.what.ucanplus.tipscholarship.TipScholarshipActivity

class FourAcademicFragment : BaseFragment<FragmentWhatIntegratedInformationAcademicAdministrationFourBinding>(
    R.layout.fragment_what_integrated_information_academic_administration_four,
    FragmentWhatIntegratedInformationAcademicAdministrationFourBinding::inflate
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        scholarshipListClick()
    }

    private fun scholarshipListClick() {
        binding.scholarshipList.setOnClickListener {
            startActivity(Intent(activity, ScholarshipMainActivity::class.java))
        }
    }


}