package com.practice.bnvcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.practice.bnvcomponent.databinding.FragmentOrderBinding


class OrderFragment : Fragment() {
    private lateinit var binding: FragmentOrderBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOrderBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}