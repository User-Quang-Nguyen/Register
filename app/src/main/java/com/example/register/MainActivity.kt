package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.register.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegister.setOnClickListener {
            if (!checkForm()){
                val toast2 = Toast.makeText(this, "You have not filled in enough information", Toast.LENGTH_SHORT)
                toast2.show()

            }
        }

    }

    fun checkForm() : Boolean{
        val firstName : Boolean = binding.firstnameEdit.text.isNotEmpty()
        val lastName : Boolean = binding.lastnameEdit.text.isNotEmpty()
        val maleCheck : Boolean = binding.maleOption.isChecked
        val femaleCheck : Boolean = binding.femaleOption.isChecked
        val birthdayCheck  : Boolean = binding.birthdayEdit.text.isNotEmpty()
        val addressCheck : Boolean = binding.addressEdit.text.isNotEmpty()
        val emailCheck : Boolean = binding.emailEdit.text.isNotEmpty()
        val boxCheck : Boolean = binding.checkbox.isChecked
        var generCheck = maleCheck || femaleCheck
        return firstName && lastName && generCheck && birthdayCheck && addressCheck && emailCheck && boxCheck
    }
}
