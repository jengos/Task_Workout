package com.juannarvaez.taskworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var  olvideContrasena : TextView = findViewById(R.id.olvidemicontrasena)
    var  registar : TextView = findViewById(R.id.registar)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}

