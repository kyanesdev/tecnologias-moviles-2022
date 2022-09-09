package com.example.practico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.practico1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("State working: ","onCreate")

        Toast.makeText(baseContext , "App created" , Toast.LENGTH_LONG).show()

        setTitle("First Android-App")

        binding.button1.setOnClickListener{
            Toast.makeText(baseContext , "Binding Effect :D" , Toast.LENGTH_LONG).show()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("State","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("State","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("State", "onPause")
        Toast.makeText(baseContext , "App on pause" , Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("State", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("State", "onDestroy")
    }

}