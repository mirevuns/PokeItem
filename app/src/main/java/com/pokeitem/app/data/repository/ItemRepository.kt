package com.pokeitem.app.data.repository

import com.pokeitem.app.data.api.PokeApi
import com.pokeitem.app.data.mapper.*
import com.pokeitem.app.domain.model.ItemDetailUiModel
import com.pokeitem.app.domain.model.ItemListUiModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ItemRepository @Inject constructor(
    private val api: PokeApi
) {

    suspend fun getItemList(limit: Int = 20, offset: Int = 0): Result<List<ItemListUiModel>> =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getItemList(limit = limit, offset = offset)
                Result.success(response.results.map { it.toUiModel() })
            } catch (e: Exception) {
                Result.failure(e)
            }
        }

    suspend fun getItemDetail(idOrName: String): Result<ItemDetailUiModel> =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getItemDetail(idOrName)
                Result.success(response.toUiModel())
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
}
