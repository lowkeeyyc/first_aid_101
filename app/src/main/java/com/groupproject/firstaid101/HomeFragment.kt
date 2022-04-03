package com.groupproject.firstaid101

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.groupproject.firstaid101.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentHomeBinding.bind(view)

        binding.searchBtn.setOnClickListener {
            if (binding.searchEditTextLayout.editText?.text.toString().isNotEmpty()) {
                val action = R.id.action_homeFragment_to_resultsFragment
                //passing search String
                val searchString = binding.searchEditTextLayout.editText?.text.toString().trim()
                val bundle = bundleOf("search" to searchString)
                findNavController().navigate(action, bundle)
            } else {
                binding.searchEditTextLayout.error = "Field should not be empty"
            }

        }

        binding.searchEditTextLayout.editText!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //not needed
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                binding.searchEditTextLayout.error = null
            }

            override fun afterTextChanged(p0: Editable?) {
                //not needed
            }

        })
        binding.tipsFab.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTipsFragment()
            findNavController().navigate(action)
        }
        binding.tipsFab.setOnLongClickListener {
            binding.tipsFab.isExtended = !binding.tipsFab.isExtended
            return@setOnLongClickListener true
        }
    }
}
