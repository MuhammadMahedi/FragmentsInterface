package com.mun.fragmentsinterface

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mun.fragmentsinterface.databinding.FragmentTabOneBinding
import com.mun.fragmentsinterface.databinding.FragmentTabTwoBinding


class TabTwoFragment : BaseFragment<FragmentTabTwoBinding>(FragmentTabTwoBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        NextFragmentTextListener.instance.setTvTextChangeCallback(object :NextFragmentTextListener.TvTextChangeCallback{
            override fun onTvChangedText(text: String) {
                binding.tvFragmentTwo.text = text
            }

        })
    }

}