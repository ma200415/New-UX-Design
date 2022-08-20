package com.mcd.newuxdesign.ui.food_menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mcd.newuxdesign.databinding.FragmentFoodEditorBinding

class FoodEditorFragment : Fragment() {
    private var _binding: FragmentFoodEditorBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFoodEditorBinding.inflate(inflater, container, false)

        binding.orderActionLayout.orderNow.setOnClickListener {
            binding.specialOfficeMenuLayout.root.visibility = View.VISIBLE
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}