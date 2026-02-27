package com.pokeitem.app.domain.model

data class ItemListUiModel(
    val id: String,
    val name: String,
    val displayName: String
)

data class ItemDetailUiModel(
    val id: String,
    val name: String,
    val displayName: String,
    val cost: String,
    val category: String,
    val description: String,
    val imageUrl: String?,
    val attributes: List<String>
)
