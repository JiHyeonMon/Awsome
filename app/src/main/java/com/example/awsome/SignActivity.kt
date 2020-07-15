package com.example.awsome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.awsome.activity_host.HostActivity
import kotlinx.android.synthetic.main.activity_sign.*

class SignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        btn_create.setOnClickListener {
            val intent = Intent(this, CreateActivity::class.java)
            startActivity(intent)
       }
    }
}
