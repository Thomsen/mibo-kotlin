package com.anyuaning.mibo.kotlin

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_mibo_main.*

/**
 * A placeholder fragment containing a simple view.
 */
class MiboMainActivityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                     savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mibo_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity.tv_hello.setText("Hello Kotlin extensions");
    }
}
