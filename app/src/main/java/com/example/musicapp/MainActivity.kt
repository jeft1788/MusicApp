package com.example.musicapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.musicapp.adapter.RecyclerViewAdapter
import com.example.musicapp.data.DataSource
import com.example.musicapp.databinding.ActivityMainBinding
import com.example.musicapp.model.Album
import com.google.android.material.progressindicator.LinearProgressIndicator.IndeterminateAnimationType

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var miRecycler: RecyclerView
    val miAdapter: RecyclerViewAdapter = RecyclerViewAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cargarRecycler()
    }
    fun cargarRecycler(){
        miRecycler = binding.rcvAlbumes
        miRecycler.setHasFixedSize(true)
        miRecycler.layoutManager = LinearLayoutManager(this)
        miAdapter.RecyclerViewAdapter(DataSource().getAlbmes(),this)
        miRecycler.adapter = miAdapter
        miAdapter.setOnItemClickListener(object:
            RecyclerViewAdapter.onItemClickListener{
            override fun onItemClickListener(position: Int) {
                val intent = Intent(this@MainActivity,
                    DetalleActivity::class.java)
                intent.putExtra("imagen",DataSource().getAlbmes()[position].imagen)
                intent.putExtra("album",DataSource().getAlbmes()[position].nombre)
                intent.putExtra("fecha",DataSource().getAlbmes()[position].fecha)
                startActivity(intent)
                Log.d("Info album", DataSource().getAlbmes()[position].toString())


            }

        }
        )
    }
}