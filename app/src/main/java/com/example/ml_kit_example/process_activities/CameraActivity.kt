package com.example.ml_kit_example.process_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ml_kit_example.R
import com.example.ml_kit_example.databinding.ActivityCameraBinding

class CameraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCameraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}