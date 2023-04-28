package com.example.notifymed.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.notifymed.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MedicationFragment : Fragment() {

    private lateinit var dosage: EditText
    private lateinit var duration: EditText
    private lateinit var type: EditText
    private lateinit var fAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_medication, container, false)

        type = view.findViewById(R.id.Type)
        dosage = view.findViewById(R.id.dosage)
        duration = view.findViewById(R.id.Duration)
        fAuth = Firebase.auth

        return view
    }

}