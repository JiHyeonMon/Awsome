package com.example.awsome.fragment_log.active

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.awsome.R
import kotlinx.android.synthetic.main.fragment_active.*

class ActiveFragment : Fragment() {

    lateinit var activeAdapter: ActiveAdapter
    val datas = mutableListOf<ActiveData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_active, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activeAdapter = ActiveAdapter(view.context)
        rv_active.adapter = activeAdapter
        rv_active.setLayoutManager(LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        loadDatas()
    }

    fun loadDatas(){
        datas.apply {
            add(
                ActiveData(
                    txt_ActiveDate = "2020/11/11",
                    txt_ActiveTime = "12:12:12",
                    txt_ActiveContent = "ARP 스푸핑 탐지"
                )
            )
            add(
                ActiveData(
                    txt_ActiveDate = "2020/03/11",
                    txt_ActiveTime = "11:23:14",
                    txt_ActiveContent = "ARP Spoofing"
                )
            )
        }
        activeAdapter.datas = datas
        activeAdapter.notifyDataSetChanged()
    }

}
