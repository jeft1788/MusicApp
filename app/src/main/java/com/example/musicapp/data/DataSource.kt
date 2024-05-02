package com.example.musicapp.data

import com.example.musicapp.model.Album

class DataSource() {
    fun getAlbmes(): MutableList<Album>{
        var albumes: MutableList<Album> = mutableListOf()
        albumes.add(Album("Nerver Mind","1991","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0iyDuVOhL54VjBp9m1Wy4lAmsgSRvCp2k70FRvI5TQ&s"))
        albumes.add(Album("Album 1","1991","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0iyDuVOhL54VjBp9m1Wy4lAmsgSRvCp2k70FRvI5TQ&s"))
        albumes.add(Album("Album 2","1991","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0iyDuVOhL54VjBp9m1Wy4lAmsgSRvCp2k70FRvI5TQ&s"))
        albumes.add(Album("Album 3","1991","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0iyDuVOhL54VjBp9m1Wy4lAmsgSRvCp2k70FRvI5TQ&s"))
        albumes.add(Album("Album 4","1991","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0iyDuVOhL54VjBp9m1Wy4lAmsgSRvCp2k70FRvI5TQ&s"))
        albumes.add(Album("Nerver Mind","1991","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0iyDuVOhL54VjBp9m1Wy4lAmsgSRvCp2k70FRvI5TQ&s"))
        albumes.add(Album("Nerver Mind","1991","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0iyDuVOhL54VjBp9m1Wy4lAmsgSRvCp2k70FRvI5TQ&s"))
        albumes.add(Album("Nerver Mind","1991","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0iyDuVOhL54VjBp9m1Wy4lAmsgSRvCp2k70FRvI5TQ&s"))
        albumes.add(Album("Nerver Mind","1991","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0iyDuVOhL54VjBp9m1Wy4lAmsgSRvCp2k70FRvI5TQ&s"))
        albumes.add(Album("Nerver Mind","1991","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz0iyDuVOhL54VjBp9m1Wy4lAmsgSRvCp2k70FRvI5TQ&s"))

        return albumes
    }
}