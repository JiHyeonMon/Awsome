package com.example.awsome.activity_admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.awsome.R
import kotlinx.android.synthetic.main.activity_admin.*

class AdminActivity : AppCompatActivity() {

    lateinit var adminAdapter: AdminAdapter
    val datas = mutableListOf<AdminData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        btn_back.setOnClickListener {
            finish()
        }

        adminAdapter = AdminAdapter(this)
        rv_admin.adapter = adminAdapter
        rv_admin.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        loadDatas()

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rv_admin)

    }

    fun loadDatas(){
        datas.apply {
            add(
                AdminData(
                    txt_AdminUser = "길동",
                    txt_AdminRating = "최고관리자"
                )
            )
            add(
                AdminData(
                    txt_AdminUser = "철수",
                    txt_AdminRating = "관리자"
                )
            )
            add(
                AdminData(
                    txt_AdminUser = "영희",
                    txt_AdminRating = "관리자"
                )
            )

        }
        adminAdapter.datas = datas
        adminAdapter.notifyDataSetChanged()
    }
}
