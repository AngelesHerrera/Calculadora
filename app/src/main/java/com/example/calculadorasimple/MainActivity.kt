package com.example.calculadorasimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var edNum1Txt: EditText
    lateinit var edNum2Txt: EditText
    lateinit var res: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edNum1Txt = findViewById(R.id.edNum1)
        edNum2Txt = findViewById(R.id.edNum2)
        res=findViewById<TextView>(R.id.resul)
    }

    fun hacerOperacion(view: View)
    {
        val num1: Int  = edNum1Txt.text.toString().toInt()
        val num2 = edNum2Txt.text.toString().toInt()
        val suma = num1 + num2
        Toast.makeText(this,"El resultado es $suma",Toast.LENGTH_LONG).show()
        resul.setText("$suma")

    }
    fun restar (view: View)
    {
        val num1: Int  = edNum1Txt.text.toString().toInt()
        val num2 = edNum2Txt.text.toString().toInt()
        val resta = num1 - num2
        Toast.makeText(this,"El resultado es $resta",Toast.LENGTH_LONG).show()
        resul.setText("$resta")
    }
    fun multiplicar (view: View)
    {
        val num1: Int  = edNum1Txt.text.toString().toInt()
        val num2 = edNum2Txt.text.toString().toInt()
        val mult = num1 * num2
        Toast.makeText(this,"El resultado es $mult",Toast.LENGTH_LONG).show()
        resul.setText("$mult")
    }
    fun dividir (view: View)
    {
        val num1: Int  = edNum1Txt.text.toString().toInt()
        val num2 = edNum2Txt.text.toString().toInt()
        val dividir = num1 / num2
        Toast.makeText(this,"El resultado es $dividir",Toast.LENGTH_LONG).show()
        resul.setText("$dividir")
    }
}