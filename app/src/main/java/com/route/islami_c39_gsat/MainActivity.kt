package com.route.islami_c39_gsat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.route.islami_c39_gsat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // 3 Main Tabs -> Whatsapp
        // Chats -  Status - Calls
        // ()
        // Git & Github (Version Control Systems )
        // Git & Github
        // Individual ->
        // Bottom navigation View ->
        // Navigation Drawer

        //

        // 4 Developers -> App ->
        // Login
        // Home
        // Profile
        // Chat
        // Bad Approach

        // Gradle -> Depedencies
        // Git & Github
        // Company
        // Islami Project

        // git init -> git initialization
        //1-  Create Git Repository
        //         1- Untracked -> ->  red
        //         2- Ignored ->
        //         3- Tracked

        // Commit
        // Initial Commit

        binding.homeTab.setOnClickListener {
            // supportFragmentManager
            pushFragment(HomeFragment())
        }
        binding.profileTab.setOnClickListener {
            pushFragment(ProfileFragment())
        }
    }

    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(binding.fragmentContainer.id, fragment)
            .commit()
    }
}