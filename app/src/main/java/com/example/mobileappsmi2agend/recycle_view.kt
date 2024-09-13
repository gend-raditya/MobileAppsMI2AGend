package com.example.mobileappsmi2agend

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileappsmi2agend.adapter.buku_adapter
import com.example.mobileappsmi2agend.model.model_buku

class recycle_view : AppCompatActivity() {

    private lateinit var rv_data : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)

        rv_data = findViewById(R.id.rv_data)

        val listBuku = listOf(
            model_buku(judul = "Buku Android Kotlin 2024", penerbit = "Alkindi"),
            model_buku(judul = "Buku Android Kotlin2 2024", penerbit = "Gendri Raditia"),
            model_buku(judul = "Buku Android Kotlin3 2024", penerbit = "Alkindi"),
            model_buku(judul = "Buku Android Kotlin4 2024", penerbit = "Gendri Raditia"),
            model_buku(judul = "Buku Android Kotlin5 2024", penerbit = "Alkindi"),
        )

        val nBukuAdapter = buku_adapter(listBuku)
        rv_data.apply {
            layoutManager = LinearLayoutManager(this@recycle_view)
            adapter = nBukuAdapter
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}