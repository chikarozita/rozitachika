package com.rozita.smklepi


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_movie.view.*

/**
 * A simple [Fragment] subclass.
 */
class MovieFragment : Fragment() {
    lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_movie, container, false)

        val list =
            Movie.listMovie as ArrayList<MovieModel>
        var layoutManager =
            LinearLayoutManager(activity)
        val adapter =
            MovieAdapter(list,activity!!.applicationContext)

        rootView.rv_movie.apply {
            layoutManager = layoutManager
            setAdapter(adapter)
        }

        return rootView

    }


}
