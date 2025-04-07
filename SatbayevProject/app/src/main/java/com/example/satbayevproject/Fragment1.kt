package com.example.satbayevproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        // Кнопка для перехода на второй фрагмент
        view.findViewById<Button>(R.id.btn_fragment).setOnClickListener {
            findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }
        return view
    }
}