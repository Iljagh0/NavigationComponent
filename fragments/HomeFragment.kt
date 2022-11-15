package com.example.myapplication33.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication33.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var editText: EditText
    private lateinit var button: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.editTextAmount)
        button = view.findViewById(R.id.button)

        button.setOnClickListener {
            val amount = editText.text.toString().toInt()
            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)

            findNavController().navigate(action)
        }


    }
}