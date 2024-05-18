package com.example.t_know.mainPage.what.integrated.academic

import BaseFragment
import android.os.Bundle
import android.view.View
import com.example.t_know.R
import com.example.t_know.databinding.FragmentWhatIntegratedInformationAcademicAdministrationFiveBinding

class FiveAcademicFragment : BaseFragment<FragmentWhatIntegratedInformationAcademicAdministrationFiveBinding>(
    R.layout.fragment_what_integrated_information_academic_administration_five,
    FragmentWhatIntegratedInformationAcademicAdministrationFiveBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickBackButton()
    }
    
    private fun clickBackButton(){
        binding.maingogogo.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}