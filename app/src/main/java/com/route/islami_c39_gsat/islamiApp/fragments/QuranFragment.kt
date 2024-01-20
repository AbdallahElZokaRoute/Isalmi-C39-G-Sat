package com.route.islami_c39_gsat.islamiApp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_c39_gsat.databinding.FragmentQuranBinding
import com.route.islami_c39_gsat.islamiApp.Constants
import com.route.islami_c39_gsat.islamiApp.SuraDetailsActivity
import com.route.islami_c39_gsat.islamiApp.adapters.SuraNameAdapter
import com.route.islami_c39_gsat.islamiApp.adapters.SuraNameIndex
import com.route.islami_c39_gsat.islamiApp.adapters.suraNamesList

class QuranFragment : Fragment() {
    lateinit var binding: FragmentQuranBinding
    lateinit var adapter: SuraNameAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuranBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val suraList = suraNamesList.mapIndexed { position, item ->
            SuraNameIndex(item, position + 1)
        }
        // mapping
        adapter = SuraNameAdapter(suraList)
        adapter.onSuraClickListener = object : SuraNameAdapter.OnSuraClickListener {
            override fun onSuraClick(item: SuraNameIndex, position: Int) {
                val intent = Intent(requireContext(), SuraDetailsActivity::class.java)
                intent.putExtra(Constants.EXTRA_SURA_NAME, item.name)
                intent.putExtra(Constants.EXTRA_SURA_POSITION, item.index)
                startActivity(intent)
            }
        }

        binding.suraNamesRecyclerView.adapter = adapter
    }

}
