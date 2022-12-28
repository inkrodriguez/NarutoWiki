package com.example.NarutoWiki

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentFeed : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_feed, container, false)

        val cardNaruto = view.findViewById<CardView>(R.id.cardNaruto)

        cardNaruto.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentFeed_to_fragmentPerfil)

        }

        return view
    }

}



