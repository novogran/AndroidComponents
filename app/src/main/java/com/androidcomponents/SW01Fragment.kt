package com.androidcomponents

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class SW01Fragment : Fragment() {

    companion object {
        fun newInstance() = SW01Fragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.ws01fragment, container, false)
        val startServiceButton = view.findViewById<Button>(R.id.start_service_button)
        val stopServiceButton = view.findViewById<Button>(R.id.stop_service_button)
        startServiceButton.setOnClickListener {
            val intent = Intent(context, WS01Service::class.java)
            context?.startService(intent)
        }
        stopServiceButton.setOnClickListener {
            val intent = Intent(context, WS01Service::class.java)
            context?.stopService(intent)
        }
        return view
    }
}