package com.m.navigationsample1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            setUpListeners()
        }

        private fun setUpListeners() {
            btn_fragment_two?.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_fragment_two))

            btn_fragment_two_argument?.setOnClickListener {
                val direction = FragmentOneDirections.oneToTwo()
                direction.name = "Samule"
                direction.id = 113
                Navigation.findNavController(btn_fragment_two_argument).navigate(direction)
            }
        }

    }