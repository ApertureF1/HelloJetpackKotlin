package com.example.navigation

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navigation.util.Request
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("test", "firstFragment onCreate()")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("test", "firstFragment onCreateView()")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("test", "firstFragment onViewCreated()")
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.button)
        button?.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
            doAsync {
                Request("https://samples.openweathermap.org/data/2.5/forecast?id=524901&appid=b1b15e88fa797225412429c1c50c122a1").run()
                uiThread { activity?.longToast("request performed!") }
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i("test", "firstFragment onActivityCreated()")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.i("test", "firstFragment onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.i("test", "firstFragment onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.i("test", "firstFragment onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.i("test", "firstFragment onStop()")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i("test", "firstFragment onDestroyView()")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("test", "firstFragment onDestroy()")
        super.onDestroy()
    }

    override fun onAttach(context: Context) {
        Log.i("test", "firstFragment onAttach()")
        super.onAttach(context)
    }

    override fun onDetach() {
        Log.i("test", "firstFragment onDetach()")
        super.onDetach()
    }

}
