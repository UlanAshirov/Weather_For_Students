package com.ulan.weatherapp_for_15_1j.ui.search

import android.content.Context
import android.util.Log
import com.ulan.weatherapp_for_15_1j.core.BaseBottomSheetFragment
import com.ulan.weatherapp_for_15_1j.databinding.FragmentSearchBottomSheetBinding
import dagger.hilt.android.AndroidEntryPoint
import java.lang.ClassCastException

@AndroidEntryPoint
class SearchBottomSheetFragment(
    private val searchByName: (cityName: String) -> Unit
) : BaseBottomSheetFragment<FragmentSearchBottomSheetBinding>() {
    override fun getViewBinding(): FragmentSearchBottomSheetBinding {
        return FragmentSearchBottomSheetBinding.inflate(layoutInflater)
    }

    override fun initialize() {
        binding.btnSearch.setOnClickListener {
            val cityName = binding.etSearch.text.toString()
            searchByName(cityName)
            dialog?.dismiss()
        }
    }
}