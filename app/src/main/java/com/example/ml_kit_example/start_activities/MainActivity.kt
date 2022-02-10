package com.example.ml_kit_example.start_activities

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.ml_kit_example.databinding.ActivityMainBinding
import com.example.ml_kit_example.process_activities.PermissionsServices

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var context: Context
    private lateinit var permissionsServices: PermissionsServices

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        context = this

        initComponents()
        rpExecuteTime()

    }

    companion object {
        val TAG = "MainActivity"
    }

    private fun initComponents () {
        permissionsServices = PermissionsServices(context)
    }

    //Permission in execute time
    private fun rpExecuteTime () {
        permissionsServices.requestPermissionApp(this)
    }

}