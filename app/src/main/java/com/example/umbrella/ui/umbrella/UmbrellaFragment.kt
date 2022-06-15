package com.example.umbrella.ui.umbrella

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.umbrella.R

class UmbrellaFragment : Fragment() {

    companion object {
        fun newInstance() = UmbrellaFragment()
    }

    private lateinit var viewModel: UmbrellaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_umbrella, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(UmbrellaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}