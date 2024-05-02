package com.example.musicapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.adapter.RecyclerViewAdapter
import com.example.musicapp.data.DataSource
import com.example.musicapp.databinding.ActivityMainBinding
import com.example.musicapp.model.Album

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var miRecycler: RecyclerView
    val miAdapter: RecyclerViewAdapter = RecyclerViewAdapter(DataSource().getAlbmes())
    var miLista: MutableList<Album> = DataSource().getAlbmes()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cargarRecycler()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_search, menu)
        val searchItem = menu!!.findItem(R.id.action_search)
        val searchView: SearchView? = searchItem.actionView as SearchView
        searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                TODO("Not yet implemented")
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null){
                    val albumFiltrado = miLista.filter { album -> album.nombre.lowercase().contains(newText)  }
                    if (albumFiltrado.isEmpty()){
                        Toast.makeText(this@MainActivity,"No hay concidencias", Toast.LENGTH_SHORT).show()
                    }else{
                        miAdapter.actualizarLista(albumFiltrado.toMutableList())
                    }
                }
                return true
            }

        })
        return true
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