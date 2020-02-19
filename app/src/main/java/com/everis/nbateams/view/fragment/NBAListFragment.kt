package com.everis.nbateams.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.everis.nbateams.R
//import com.everis.nbateams.view.viewModel.NBAListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class NBAListFragment : Fragment() {

    //private val viewModel by viewModel <NBAListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //setObservables()
    }


    /*private fun setObservables() {
        viewModel.state.observe(this, Observer (::updateList))7
        
    }

    fun updateList(state : NBAListViewModel.ViewState?) {
        when(state){
            is NBAListViewModel.ViewState.ShowList ->{
                // SHOW LIST
            }

            is NBAListViewModel.ViewState.Error ->{
                // ERROR
            }
        }
    }*/
}
