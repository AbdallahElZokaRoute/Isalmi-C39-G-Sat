package com.route.islami_c39_gsat.islamiApp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_c39_gsat.databinding.FragmentTasbeehBinding
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class TasbeehFragment : Fragment() {
    lateinit var binding: FragmentTasbeehBinding
    private lateinit var sbeha: ImageView
    private lateinit var tasbeehButton: Button
    private lateinit var tasbeehCounter: TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTasbeehBinding.inflate(inflater)
        tasbeehCounter= binding.counterTasbeh
        sbeha = binding.bodySbeeh
        tasbeehButton = binding.tasbeh

        var count=0
        var counttext=0
        tasbeehButton.setOnClickListener {
            rotateImage()
            count++
            tasbeehCounter.text= count.toString()

            if (count==33){
                count=0
                counttext++
                tasbeehCounter.clearComposingText()
                changeTextTasbeh(counttext)

                if (counttext==3){
                    counttext=0
                    changeTextTasbeh(counttext)
                }
            }
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
    private fun rotateImage() {
        val currentRotation = sbeha.rotation
        val newRotation = currentRotation + 10.9f
        sbeha.animate().rotation(newRotation).start()
    }
    private fun changeTextTasbeh(counttext: Int) {
        when(counttext){
            0 -> tasbeehButton.text="سبحان الله"

            1 -> tasbeehButton.text="الحمد لله"

            2 -> tasbeehButton.text="الله أكبر"

            else -> {}
            }
        }
    }


