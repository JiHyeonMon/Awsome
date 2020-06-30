package com.example.awsome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.awsome.R
import com.example.awsome.activity_security.SecurityAdapter
import com.example.awsome.activity_security.SecurityData
import kotlinx.android.synthetic.main.activity_security.*

class SecurityActivity : AppCompatActivity() {

    lateinit var securityAdapter: SecurityAdapter
    val datas = mutableListOf<SecurityData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_security)

        btn_back.setOnClickListener {
            finish()
        }

        securityAdapter = SecurityAdapter(this)
        rv_secu.adapter = securityAdapter
        rv_secu.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        loadDatas()

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rv_secu)

    }

    fun loadDatas(){
        datas.apply {
            add(
                SecurityData(
                    txt_ListName = "ARP Spoofing 탐지",
                    txt_ListInfo = "전송하는 데이터 탈취 및 네트워크 문제 발생 탐지 기능"
                )

            )
            add(
                SecurityData(
                    txt_ListName = "SYN Flooding 탐지",
                    txt_ListInfo = "네트워크 문제 발생 탐지하여 정상적 접근을 도와주는 기능"
                )

            )
            add(
                SecurityData(
                    txt_ListName = "Dos/DDos 탐지",
                    txt_ListInfo = "네트워크 및 시스템 마비를 탐지하고 정상 운영을 도와주는 기능"
                )

            )
            add(
                SecurityData(
                    txt_ListName = "DNS Spoofing 탐지",
                    txt_ListInfo = "안전하지 못한 사이트 탐지 및 개인정보 등 탈취 예방 기능"
                )

            )
            add(
                SecurityData(
                    txt_ListName = "관리자 승인 후 와이파이 연결",
                    txt_ListInfo = "공유기  관리자가 승인한 기기 외의 불법적 접근 방지 기능 "
                )

            )
            add(
                SecurityData(
                    txt_ListName = "해외 IP 접속 차단",
                    txt_ListInfo = "해외에서 접속을 시도하는 IP를 탐지하여 불필요한 접근 통제 기능"
                )

            )
        }
        securityAdapter.datas = datas
        securityAdapter.notifyDataSetChanged()
    }
}

