package com.example.pad_3d_list


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val  v =  LayoutInflater.from(p0?.context).inflate(R.layout.list_layout, p0, false)
        return  ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val user: User = userList[p1]

        p0?.textViewName?.text = user.name
        p0?.textViewAutor?.text = user.autor
    }

    class  ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById(R.id.textViewName) as TextView
        val textViewAutor = itemView.findViewById(R.id.Autor) as TextView
    }


}