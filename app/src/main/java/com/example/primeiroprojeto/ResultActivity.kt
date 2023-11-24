package com.example.primeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvresultado = findViewById<TextView>(R.id.textview_resultado)
        val tvClassificacao=findViewById<TextView>(R.id.textview_classificacao)
       val resultado =  intent.getFloatExtra("extra_resultado", 0.1f)
        tvresultado.text=resultado.toString()
        var classificacao=""
        if(resultado<18.5f){
            classificacao="Abaixo do peso"
        }else if (resultado>=18.5f && resultado<=24.9f){
            classificacao="Normal"
        }else if(resultado>=25f && resultado<=29.9f){
            classificacao= "Sobrepeso"
        }else if(resultado>=30f && resultado<=39.9f){
            classificacao="Obesidade"
        }else{
            classificacao="Obesidade grave"
        }
        tvClassificacao.text= getString(R.string.message_classificacao, classificacao)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}