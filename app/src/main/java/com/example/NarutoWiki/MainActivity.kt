package com.example.NarutoWiki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.NarutoWiki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val login = login()



        binding.btnLogin.setOnClickListener {

            val editUser = binding.editUser.editableText.toString()
            val editPassword = binding.editPassword.editableText.toString()

            if (login.usuario == editUser && login.senha == editPassword){
                startActivity(Intent(this, HomeActivity::class.java))
            } else{
                Toast.makeText(this, "Erro", Toast.LENGTH_SHORT).show()
            }

        }

    }
}