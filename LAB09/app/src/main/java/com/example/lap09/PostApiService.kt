package com.example.lap09

import retrofit2.http.GET
import retrofit2.http.Path

interface PostApiService {

    interface PostApiService {
        @GET("posts")
        suspend fun getUserPosts(): List<PostModel>

        @GET("posts/{id}")
        suspend fun getUserPostById(@Path("id") id: Int): PostModel

    }


}