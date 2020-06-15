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
                    txt_ListInfo = "흐아아아 테스트 테스트랍니다. 이게 뜨면 성공한거겠쬬. 성공성공"
                )

            )
            add(
                SecurityData(
                    txt_ListName = "SYN Flooding 탐지",
                    txt_ListInfo = "흐아아아 테스트 테스트랍니다. 이게 뜨면 성공한거겠쬬. 성공성공"
                )

            )
            add(
                SecurityData(
                    txt_ListName = "Dos/DDos 탐지",
                    txt_ListInfo = "흐아아아 테스트 테스트랍니다. 이게 뜨면 성공한거겠쬬. 성공성공"
                )

            )
            add(
                SecurityData(
                    txt_ListName = "DNS Spoofing 탐지",
                    txt_ListInfo = "흐아아아 테스트 테스트랍니다. 이게 뜨면 성공한거겠쬬. 성공성공"
                )

            )
            add(
                SecurityData(
                    txt_ListName = "관리자 승인 후 와이파이 연결",
                    txt_ListInfo = "흐아아아 테스트 테스트랍니다. 이게 뜨면 성공한거겠쬬. 성공성공"
                )

            )
            add(
                SecurityData(
                    txt_ListName = "해외 IP 접속 차단",
                    txt_ListInfo = "흐아아아 테스트 테스트랍니다. 이게 뜨면 성공한거겠쬬. 성공성공"
                )

            )
        }
        securityAdapter.datas = datas
        securityAdapter.notifyDataSetChanged()
    }
}

