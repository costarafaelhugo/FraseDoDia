package com.hugorafaelcosta.frasesdodia

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "O que é importante não é o que os outros pensam de você, mas como " +
        "você age perante a isso.\n-Nanatsu no Taizai",
        "Dor, tristeza e alegria... esses sentimentos permitem que você entenda os outros.\n -Naruto",
        "Às vezes as questões são complicadas e as respostas são simples.\n-Death Note\n",
        "Se você aceita tudo sem ao menos questionar, vai acabar perdendo a capacidade de pensar." +
                "\n-Pandora Hearts\n"


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById<TextView>(R.id.textoFrase)

    }

    fun gerarFrase(view: View) {

        val totalItensArray = frases.size
        val numeroAleatorio = Random().nextInt(totalItensArray)

        texto.setText(frases[numeroAleatorio])
    }

}