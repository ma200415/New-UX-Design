package com.mcd.newuxdesign.ui.food_menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mcd.newuxdesign.R
import com.mcd.newuxdesign.databinding.FragmentFoodMenuBinding

class FoodMenuFragment : Fragment() {
    private var _binding: FragmentFoodMenuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFoodMenuBinding.inflate(inflater, container, false)

        binding.newMenu.setOnClickListener { findNavController().navigate(R.id.action_FoodMenuFragment_to_NewMenuFragment) }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}