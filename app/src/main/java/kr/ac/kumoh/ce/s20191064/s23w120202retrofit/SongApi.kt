package kr.ac.kumoh.ce.s20191064.s23w120202retrofit

import retrofit2.http.GET

interface SongApi {
    @GET("song")
    suspend fun getSongs(): List<Song>
}