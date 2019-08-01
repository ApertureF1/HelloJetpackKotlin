package com.example.navigation

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.navigation.adapter.CityAdapter
import com.example.navigation.viewmodel.CityViewModel
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * A simple [Fragment] subclass.
 */

class SecondFragment : Fragment() {

    @Suppress("UNCHECKED_CAST")
    private val viewModel by lazy(LazyThreadSafetyMode.NONE) {
        ViewModelProviders.of(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T = CityViewModel(requireActivity().application) as T
        }).get(CityViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("test", "secondFragment onCreate()")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("test", "secondFragment onCreateView()")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("test", "secondFragment onViewCreated()")
        val adapter = CityAdapter()
        recyclerView.adapter = adapter
        viewModel.allCities.observe(this, Observer { adapter.submitList(it) })
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i("test", "secondFragment onActivityCreated()")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.i("test", "secondFragment onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.i("test", "secondFragment onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.i("test", "secondFragment onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.i("test", "secondFragment onStop()")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("test", "secondFragment onDestroyView()")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("test", "secondFragment onDestroy()")
        super.onDestroy()
    }

    override fun onAttach(context: Context) {
        Log.i("test", "secondFragment onAttach()")
        super.onAttach(context)
    }

    override fun onDetach() {
        Log.i("test", "secondFragment onDetach()")
        super.onDetach()
    }
}
