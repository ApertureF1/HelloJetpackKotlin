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


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("test", "firstFragment onCreate()")
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
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
        button?.setOnClickListener { findNavController().navigate(R.id.action_firstFragment_to_secondFragment) }
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

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}
