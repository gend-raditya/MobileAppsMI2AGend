package com.example.mobileappsmi2agend

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class list_view : AppCompatActivity() {

    private lateinit var lv_listview : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)

        lv_listview = findViewById(R.id.lv_data)

        //array adapter
        val arrayAdapter: ArrayAdapter<*>
        val listHewan = arrayOf(
            "Semut",
            "Kucing",
            "Gajah",
            "Kelinci",
            "Ular",
            "Ikan",
            "Paus",
            "Panda",
        )

        //tampilkan ke dalam listview
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listHewan)
        lv_listview.adapter = arrayAdapter

        //untuk bisa klik item dari list
        lv_listview.setOnItemClickListener{
                parent, view, position, id ->
            //munculkan dalam toast
            Toast.makeText(this, "Anda Klik : ${listHewan[position]}",
                Toast.LENGTH_SHORT).show()

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}