package com.mcd.newuxdesign.ui.order_history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mcd.newuxdesign.R
import com.mcd.newuxdesign.databinding.FragmentOrderHistoryBinding

class OrderHistoryFragment : Fragment() {
    private var _binding: FragmentOrderHistoryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOrderHistoryBinding.inflate(inflater, container, false)

        binding.orderActionLayout.orderNow.setOnClickListener { findNavController().navigate(R.id.action_OrderHistoryFragment_to_FoodEditorFragment) }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}