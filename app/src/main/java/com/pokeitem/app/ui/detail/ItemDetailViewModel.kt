package com.pokeitem.app.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pokeitem.app.data.repository.ItemRepository
import com.pokeitem.app.ui.DetailUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ItemDetailViewModel @Inject constructor(
    private val repository: ItemRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<DetailUiState>(DetailUiState.Loading)
    val uiState: StateFlow<DetailUiState> = _uiState.asStateFlow()

    fun loadItem(idOrName: String) {
        viewModelScope.launch {
            _uiState.update { DetailUiState.Loading }
            repository.getItemDetail(idOrName)
                .onSuccess { item ->
                    _uiState.update { DetailUiState.Content(item) }
                }
                .onFailure { e ->
                    _uiState.update {
                        DetailUiState.Error(e.message ?: "Неизвестная ошибка. Нажмите \"Повторить\".")
                    }
                }
        }
    }
}
