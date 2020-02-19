package com.everis.nbateams.view.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*
class LoginViewModel : ViewModel() {

    sealed class  ViewState{
        object Loading : ViewState()
        class ShowList(val login: List<Login>): ViewState()
        class Error(val error: String): ViewState()
    }

    private val _state = MutableLiveData<ViewState>()

    val state : LiveData<ViewState>
        get(){
            return _state
        }

    fun getLogin() {
        viewModelScope.launch {
            _state.value = ViewState.Loading
            delay(3000)
            val res = getLogin.invoke(true)
            res.fold(::handleError,::handleSuscces)

        }
    }

    private fun handleError(loginError: LoginError) {
        _state.value = ViewState.Error(loginError.error)
    }

    private fun handleSuscces(login: Login) {
        _state.value = ViewState.ShowList(login)
    }
}*/
