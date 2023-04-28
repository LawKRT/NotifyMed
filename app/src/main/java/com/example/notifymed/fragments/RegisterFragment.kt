package com.example.notifymed.fragments

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.content.res.AppCompatResources
import com.example.notifymed.FragmentNavigation
import com.example.notifymed.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class RegisterFragment : Fragment() {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var confirmPassword: EditText
    private lateinit var fAuth: FirebaseAuth



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_register, container, false)

        username = view.findViewById(R.id.reg_username)
        password = view.findViewById(R.id.reg_password)
        confirmPassword = view.findViewById(R.id.reg_confirmpassword)
        fAuth = Firebase.auth


        view.findViewById<Button>(R.id.btn_register).setOnClickListener {
            validateEmptyForm()
            firebasesignup()
        }
        return view
    }

    private fun firebasesignup(){
        fAuth.createUserWithEmailAndPassword(username.text.toString(),
            password.text.toString()).addOnCompleteListener {
        }
        var navHome = activity as FragmentNavigation
        navHome.navigateFrag(HomeFragment(), addToStack = true)

    }

    private fun validateEmptyForm (){
        val icon = AppCompatResources.getDrawable(requireContext(), R.drawable.baseline_warning_24)
        icon?.setBounds(0,0,icon.intrinsicWidth,icon.intrinsicHeight)
        when {
            TextUtils.isEmpty(username.text.toString().trim())->{
                username.setError("Please enter username", icon)
            }
            TextUtils.isEmpty(password.text.toString().trim())->{
                password.setError("Please enter password", icon)
            }

            TextUtils.isEmpty(confirmPassword.text.toString().trim())->{
                confirmPassword.setError("Please enter password again", icon)
            }


        }



    }


}