package com.example.nonflix

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FirstFragment : Fragment() {

    private val movies = listOf(
        Movie("The Shawshank Redemption", "A drama film written and directed by Frank Darabont and starring Tim Robbins and Morgan Freeman.", "https://upload.wikimedia.org/wikipedia/en/8/8f/The_Shawshank_Redemption_1994_poster.jpg"),
        Movie("The Godfather", "An American crime film trilogy directed by Francis Ford Coppola, who co-wrote the screenplay with Mario Puzo based on Puzo's 1969 novel of the same name.", "https://upload.wikimedia.org/wikipedia/en/a/a4/The_Godfather_1972_poster.jpg"),
        Movie("The Dark Knight", "A superhero film directed by Christopher Nolan and written by Nolan and Jonathan Nolan.", "https://upload.wikimedia.org/wikipedia/en/1/13/The_Dark_Knight_2008_poster.jpg")
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = MovieAdapter(movies)

        return view
    }
}
