package com.example.primeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btncalcular: Button= findViewById(R.id.btncalcular)
        val edtpeso: EditText = findViewById(R.id.edittext_peso)
        val edtaltura: EditText = findViewById(R.id.edittext_altura)


        btncalcular.setOnClickListener{
           val alturastr=edtaltura.text.toString()
            val pesostr=edtpeso.text.toString()
            if(alturastr.isNotEmpty() && pesostr.isNotEmpty()){
            val altura: Float = alturastr.toFloat()
            val peso: Float = pesostr.toFloat()

            val alturafinal: Float= altura * altura
            val resultado: Float= peso / alturafinal


            val intent = Intent(this,ResultActivity::class.java)
                .apply {
              putExtra("extra_resultado", resultado)}
            startActivity(intent)

        }
            else{
                Toast.makeText(this,"Preencha todos os cammpos.", Toast.LENGTH_LONG).show()

            }


    }
}}