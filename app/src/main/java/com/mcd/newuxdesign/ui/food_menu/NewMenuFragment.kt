package com.mcd.newuxdesign.ui.food_menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mcd.newuxdesign.R
import com.mcd.newuxdesign.databinding.FragmentNewMenuBinding

class NewMenuFragment : Fragment() {
    private var _binding: FragmentNewMenuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewMenuBinding.inflate(inflater, container, false)

        binding.firstItem.setOnClickListener { findNavController().navigate(R.id.action_NewMenuFragment_to_FoodEditorFragment) }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}