package com.example.satbayevproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_2, container, false)

        // Кнопка для возврата на первый фрагмент
        view.findViewById<Button>(R.id.btn_back).setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment1)
        }
        return view
    }
}