package com.mun.fragmentsinterface

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mun.fragmentsinterface.databinding.FragmentTabOneBinding


class TabOneFragment : BaseFragment<FragmentTabOneBinding>(FragmentTabOneBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTabText.setOnClickListener{
            var text = binding.editTextTab.text.toString()

            TabTextListener.instance.setChangedText(text)
            binding.editTextTab.setText("")
        }

        binding.btnNextFragText.setOnClickListener{
            var text= binding.editText.text.toString()

            NextFragmentTextListener.instance.setTvChangedText(text)
            binding.editText.setText("")
        }
    }

}