package br.com.efabreu.appcomsuporteaoutrosidiomas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resume: TextView = findViewById(R.id.resume)

        resume.movementMethod = ScrollingMovementMethod()
    }
}