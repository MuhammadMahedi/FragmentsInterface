package com.mun.fragmentsinterface

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.mun.fragmentsinterface.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tabLayout = binding.tabLayout
        val viewPager =binding.viewPager

        val adapter = HomeAdapter(this)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "List 1"
                1 -> "List 2"
                else -> null
            }
        }.attach()

        TabTextListener.instance.setTextChangeCallback(object :TabTextListener.TextChangeCallback{
            override fun onChangedText(text: String) {
                setTabText(text)
            }

        })
    }

    @SuppressLint("ResourceType")
    private fun setTabText(text:String){
        binding.tabLayout.getTabAt(0)?.text = text
        binding.tabLayout.getTabAt(1)?.text = text
    }
}