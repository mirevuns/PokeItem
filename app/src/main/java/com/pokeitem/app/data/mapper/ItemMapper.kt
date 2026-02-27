package com.pokeitem.app.data.mapper

import com.pokeitem.app.data.dto.ItemDetailDto
import com.pokeitem.app.data.dto.ItemListItemDto
import com.pokeitem.app.domain.model.ItemDetailUiModel
import com.pokeitem.app.domain.model.ItemListUiModel

fun ItemListItemDto.toUiModel(): ItemListUiModel {
    val id = url.trimEnd('/').substringAfterLast('/')
    return ItemListUiModel(
        id = id,
        name = name,
        displayName = name.replace("-", " ").replaceFirstChar { it.uppercase() }
    )
}

fun ItemDetailDto.toUiModel(): ItemDetailUiModel {
    val shortEffectEn = effect_entries
        ?.firstOrNull { it.language.name == "en" }
        ?.short_effect
        ?: effect_entries?.firstOrNull()?.short_effect
        ?: ""

    val flavorTextEn = flavor_text_entries
        ?.firstOrNull { it.language.name == "en" }
        ?.text
        ?.replace("\n", " ")
        ?: ""

    val description = shortEffectEn.ifBlank { flavorTextEn }.ifBlank { "Нет описания" }

    return ItemDetailUiModel(
        id = id.toString(),
        name = name,
        displayName = name.replace("-", " ").replaceFirstChar { it.uppercase() },
        cost = if (cost > 0) "$cost ₽" else "Бесплатно",
        category = category?.name?.replace("-", " ")?.replaceFirstChar { it.uppercase() } ?: "—",
        description = description,
        imageUrl = sprites?.default,
        attributes = attributes?.map { it.name.replace("-", " ") } ?: emptyList()
    )
}
