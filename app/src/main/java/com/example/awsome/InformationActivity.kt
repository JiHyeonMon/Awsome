package com.example.awsome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_information.*
import kotlinx.android.synthetic.main.activity_revise.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_revise.btn_back

class InformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        btn_editpw.setOnClickListener {
            val intent = Intent(this, ReviseActivity::class.java)
            startActivity(intent)
        }

        btn_back.setOnClickListener {
            finish()
        }
    }
}
