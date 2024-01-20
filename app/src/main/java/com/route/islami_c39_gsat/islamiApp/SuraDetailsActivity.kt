package com.route.islami_c39_gsat.islamiApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.islami_c39_gsat.R
import com.route.islami_c39_gsat.databinding.ActivitySuraDetailsBinding

class SuraDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivitySuraDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuraDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val title = intent.getStringExtra(Constants.EXTRA_SURA_NAME)
        val position = intent.getIntExtra(Constants.EXTRA_SURA_POSITION, -1)
        binding.backButton.setOnClickListener {
            finish()
        }
        binding.titleTextView.text = title
    }
}