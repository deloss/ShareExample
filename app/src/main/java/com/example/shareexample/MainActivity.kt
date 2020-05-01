package com.example.shareexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        compartirButton.setOnClickListener{
            val intent = Intent()
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "Estoy haciendo mi primer share button")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Mail enviado desde mi app")
            intent.action = Intent.ACTION_SEND
            val chooseIntent = Intent.createChooser(intent, "Elija una opcion")
            startActivity(chooseIntent)
        }
    }
}
