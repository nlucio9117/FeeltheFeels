package com.example.feelthefeelsmoodassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feelthefeelsmoodassessment.databinding.ActivityMoodResultBinding

class MoodResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMoodResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoodResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

    val intentValue = intent.getStringExtra("Summary")

        binding.editTextSummary.setText(intentValue)


    }
}