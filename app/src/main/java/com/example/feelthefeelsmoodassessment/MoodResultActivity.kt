package com.example.feelthefeelsmoodassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feelthefeelsmoodassessment.databinding.ActivityMoodResultBinding

class MoodResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMoodResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoodResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}