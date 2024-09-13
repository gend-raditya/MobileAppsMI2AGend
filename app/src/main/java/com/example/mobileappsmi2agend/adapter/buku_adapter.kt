package com.example.mobileappsmi2agend.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileappsmi2agend.R
import com.example.mobileappsmi2agend.model.model_buku

class buku_adapter(private val buku: List<model_buku>) :
    RecyclerView.Adapter<buku_adapter.BukuAdapterHolder>() {

    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtJudul: TextView = view.findViewById(R.id.txtJudul)
        val txtPenerbit: TextView = view.findViewById(R.id.txtPenerbit)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): buku_adapter.BukuAdapterHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_recycle_view, parent, false)
        return BukuAdapterHolder(view)
    }


    override fun onBindViewHolder(holder: buku_adapter.BukuAdapterHolder, position: Int) {
        holder.txtJudul.text = buku[position].judul
        holder.txtPenerbit.text = buku[position].penerbit
    }

    override fun getItemCount(): Int {
        return buku.size
    }

}

