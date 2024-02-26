package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var tv :TextView
    lateinit var lv:ListView
    lateinit var sv : ArrayList<SinhVien>
    lateinit var adapter :Adapter
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


    }
    fun addSv(){
        sv.add(SinhVien("Hoàn",21))
        sv.add(SinhVien("Huân",21))
        sv.add(SinhVien("Khang",21))
        sv.add(SinhVien("Thuần",21))

    }
}