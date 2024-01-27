package com.route.islami_c39_gsat.islamiApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.islami.Fragments.SebhaFragment
import com.route.islami_c39_gsat.R
import com.route.islami_c39_gsat.databinding.ActivityHomeBinding
import com.route.islami_c39_gsat.databinding.ActivitySebhaaFragmentBinding
import com.route.islami_c39_gsat.islamiApp.fragments.HadethFragment
import com.route.islami_c39_gsat.islamiApp.fragments.QuranFragment
import com.route.islami_c39_gsat.islamiApp.fragments.RadioFragment

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.islamiBottomNavigationView.setOnItemSelectedListener {
//            java -> switch
//            kotlin -> when

            when (it.itemId) {
                R.id.navigation_quran -> {
                    // render Fragment Quran
                    pushFragment(QuranFragment())
                }

                R.id.navigation_hadeth -> {
                    pushFragment(HadethFragment())
                }

                R.id.navigation_tasbeeh -> {
                    pushFragment(SebhaFragment())
                }

                R.id.navigation_radio -> {
                    pushFragment(RadioFragment())
                }
            }

            return@setOnItemSelectedListener true
        }
        binding.islamiBottomNavigationView.selectedItemId = R.id.navigation_quran
    }

    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(
            binding.islamiFragmentContainer.id, fragment
        ).commit()
    }
}