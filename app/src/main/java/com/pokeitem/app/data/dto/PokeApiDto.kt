package com.pokeitem.app.data.dto

data class ItemListResponseDto(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<ItemListItemDto>
)

data class ItemListItemDto(
    val name: String,
    val url: String
)

data class ItemDetailDto(
    val id: Int,
    val name: String,
    val cost: Int,
    val category: ItemCategoryDto?,
    val attributes: List<ItemAttributeRefDto>?,
    val effect_entries: List<ItemEffectEntryDto>?,
    val flavor_text_entries: List<ItemFlavorTextDto>?,
    val sprites: ItemSpritesDto?,
    val names: List<ItemNameDto>?
)

data class ItemCategoryDto(
    val name: String,
    val url: String
)

data class ItemAttributeRefDto(
    val name: String,
    val url: String
)

data class ItemEffectEntryDto(
    val effect: String?,
    val short_effect: String?,
    val language: ItemLanguageRefDto
)

data class ItemLanguageRefDto(
    val name: String,
    val url: String
)

data class ItemFlavorTextDto(
    val text: String,
    val language: ItemLanguageRefDto
)

data class ItemSpritesDto(
    val default: String?
)

data class ItemNameDto(
    val name: String,
    val language: ItemLanguageRefDto
)
