package com.hedroid.fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.hedroid.fragment.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {
 private lateinit var binding: FragmentBlank1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentBlank1Binding.inflate(inflater, container, false)
        binding.button.setOnClickListener{
            Toast.makeText(context,"hello",Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

    companion object
}