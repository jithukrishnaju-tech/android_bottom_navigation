package com.practice.bnvcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.practice.bnvcomponent.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        fragmentNavigation()
        return binding.root
    }

    private fun fragmentNavigation() {
        binding.btnDetail.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_orderDetails)
        }

    }

}