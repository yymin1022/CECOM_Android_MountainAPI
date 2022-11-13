package com.cecom.mountain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenDetail = findViewById<Button>(R.id.main_btn_open_detail)
        val btnOpenList = findViewById<Button>(R.id.main_btn_open_list)
        btnOpenDetail.setOnClickListener(btnListener())
        btnOpenList.setOnClickListener(btnListener())
    }

    inner class btnListener: View.OnClickListener {
        override fun onClick(v: View?) {
            when(v?.id){
                R.id.main_btn_open_detail -> startActivity(Intent(applicationContext, MountainDetailActivity::class.java))
                R.id.main_btn_open_list -> startActivity(Intent(applicationContext, MountainListActivity::class.java))
            }
        }
    }
}