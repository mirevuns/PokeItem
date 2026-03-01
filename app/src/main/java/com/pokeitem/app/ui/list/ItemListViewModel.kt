package com.pokeitem.app.ui.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pokeitem.app.data.repository.ItemRepository
import com.pokeitem.app.ui.ListUiState
import com.pokeitem.app.ui.ScrollPosition
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ItemListViewModel @Inject constructor(
    private val repository: ItemRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<ListUiState>(ListUiState.Loading)
    val uiState: StateFlow<ListUiState> = _uiState.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _scrollPosition = MutableStateFlow(ScrollPosition())
    val scrollPosition: StateFlow<ScrollPosition> = _scrollPosition.asStateFlow()

    private var allItems: List<com.pokeitem.app.domain.model.ItemListUiModel> = emptyList()
    private var searchJob: Job? = null

    init {
        loadItems()
    }

    fun loadItems() {
        viewModelScope.launch {
            _uiState.update { ListUiState.Loading }
            repository.getItemList(limit = 20, offset = 0)
                .onSuccess { items ->
                    allItems = items
                    applySearchFilter()
                }
                .onFailure { e ->
                    _uiState.update {
                        ListUiState.Error(e.message ?: "Неизвестная ошибка. Нажмите \"Повторить\".")
                    }
                }
        }
    }

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
        searchJob?.cancel()
        searchJob = viewModelScope.launch {
            _uiState.update { ListUiState.Loading }
            delay(1000)
            applySearchFilter()
        }
    }

    private fun applySearchFilter() {
        val query = _searchQuery.value.trim().lowercase()
        val filtered = if (query.isEmpty()) {
            allItems
        } else {
            allItems.filter {
                it.name.contains(query) || it.displayName.lowercase().contains(query)
            }
        }
        _uiState.update { ListUiState.Content(filtered) }
    }

    fun saveScrollPosition(index: Int, offset: Int) {
        _scrollPosition.update { ScrollPosition(index = index, offset = offset) }
    }
}
