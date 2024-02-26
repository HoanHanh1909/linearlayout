package com.example.myapplication

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Adapter(val context:Activity,val layout:Int,val sinhVien:ArrayList<SinhVien>) : BaseAdapter() {


    override fun getCount(): Int {
        return sinhVien.size
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
    }
    class ViewHolder{
        lateinit var name:TextView
        lateinit var age : TextView
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var viewHolder :ViewHolder = ViewHolder()
        val view:View
        if (convertView==null){
            val inflater:LayoutInflater = context.layoutInflater
            view = inflater.inflate(layout,null)
            viewHolder.name = view.findViewById(R.id.name)
            viewHolder.age = view.findViewById(R.id.age)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        val sv = sinhVien[position]
        viewHolder.name.text = sv.name
        viewHolder.age.text = sv.age.toString()
        return view
    }
}