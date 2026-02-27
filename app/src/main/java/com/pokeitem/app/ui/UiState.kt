package com.pokeitem.app.ui

import com.pokeitem.app.domain.model.ItemDetailUiModel
import com.pokeitem.app.domain.model.ItemListUiModel

sealed class ListUiState {
    data object Loading : ListUiState()
    data class Content(val items: List<ItemListUiModel>) : ListUiState()
    data class Error(val message: String) : ListUiState()
}

data class ScrollPosition(
    val index: Int = 0,
    val offset: Int = 0
)

sealed class DetailUiState {
    data object Loading : DetailUiState()
    data class Content(val item: ItemDetailUiModel) : DetailUiState()
    data class Error(val message: String) : DetailUiState()
}
