package com.example.explicit_implicit_intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnexplicit1= findViewById<Button>(R.id.button2)

        btnexplicit1.setOnClickListener {
            intent= Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
        val btnimplicit= findViewById<Button>(R.id.button3)
        btnimplicit.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://imena-wiki.ru/imya-ardak-proishozhdenie-i-znachenie-sudba-harakter/")
            startActivity(intent)

        }
        val btnexplicit2 =findViewById<Button>(R.id.button4)
        btnexplicit2.setOnClickListener {
            val intent1= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent1)
        }

    }
}