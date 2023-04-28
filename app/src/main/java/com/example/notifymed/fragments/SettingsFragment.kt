package com.example.notifymed.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.notifymed.FragmentNavigation
import com.example.notifymed.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class SettingsFragment : Fragment() {


    private lateinit var calender: EditText
    private lateinit var snooze: EditText
    private lateinit var fAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       var view = inflater.inflate(R.layout.fragment_settings, container, false)

        calender = view.findViewById(R.id.Calender)
        snooze = view.findViewById(R.id.Snooze)
        fAuth = Firebase.auth
        return view
    }

}