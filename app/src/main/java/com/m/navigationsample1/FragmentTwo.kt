package com.m.navigationsample1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_two.*

class FragmentTwo : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setValues()
    }

    private fun setValues() {
        val args : FragmentTwoArgs? = arguments?.let{
            FragmentTwoArgs.fromBundle(it)
        }
        args?.let {
            var text_to_show = tv_fragment_two.text
            text_to_show = "$text_to_show \nname : ${it.name} \nid : ${it.id}"
            tv_fragment_two?.text = text_to_show
        }
    }

}