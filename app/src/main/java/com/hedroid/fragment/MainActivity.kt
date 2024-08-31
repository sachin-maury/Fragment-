package com.hedroid.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hedroid.fragment.databinding.ActivityMainBinding
import com.hedroid.fragment.fragments.BlankFragment1
import com.hedroid.fragment.fragments.BlankFragment2


class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)


        binding.button1.setOnClickListener{
            val manager = supportFragmentManager // Support of fm
            val tr= manager.beginTransaction()  // Start tr
            tr.replace(R.id .frame,BlankFragment1()) //What tr
            tr.commit()//final term
        }
        binding.button2.setOnClickListener{
            val manager = supportFragmentManager // Support of fm
            var tr= manager.beginTransaction()  // Start tr
            tr.replace(R.id .frame,BlankFragment2()) //What tr
            tr.commit()//final term
        }


    }
}