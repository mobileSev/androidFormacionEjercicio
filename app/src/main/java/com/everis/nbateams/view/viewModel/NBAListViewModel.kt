package com.everis.nbateams.view.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*
class NBAListViewModel: ViewModel() {

    sealed class  ViewState{
        object Loading : ViewState()
        class ShowList(val teams: List<TeamModel>): ViewState()
        class Error(val error: String): ViewState()
    }

    private val _state = MutableLiveData<ViewState>()

    val state : LiveData<ViewState>
        get(){
            return _state
        }

    fun getTeamList() {
        viewModelScope.launch {
            _state.value = ViewState.Loading
            delay(3000)
            val res = getTeamList.invoke(true)
            res.fold(::handleError,::handleSuscces)

        }
    }

    private fun handleError(teamListError: TeamError) {
        _state.value = ViewState.Error(teamListError.error)
    }

    private fun handleSuscces(list: List<TeamModel>) {
        _state.value = ViewState.ShowList(list)
    }
}*/
