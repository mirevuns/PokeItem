package com.pokeitem.app.data.api

import com.pokeitem.app.data.dto.ItemDetailDto
import com.pokeitem.app.data.dto.ItemListResponseDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("item")
    suspend fun getItemList(
        @Query("limit") limit: Int = 20,
        @Query("offset") offset: Int = 0
    ): ItemListResponseDto

    @GET("item/{idOrName}/")
    suspend fun getItemDetail(
        @Path("idOrName") idOrName: String
    ): ItemDetailDto
}
