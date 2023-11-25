package com.example.nonflix

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide

class SecondFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val titleTextView = view.findViewById<TextView>(R.id.textViewTitle)
        val descriptionTextView = view.findViewById<TextView>(R.id.textViewDescription)
        val imageView = view.findViewById<ImageView>(R.id.imageView)

        val bundle = arguments
        val title = bundle?.getString("title")
        val description = bundle?.getString("description")
        val imageUrl = bundle?.getString("imageUrl")

        titleTextView.text = title
        descriptionTextView.text = description
        Glide.with(requireContext()).load(imageUrl).into(imageView)

        // Set up back button to return to the first fragment
        view.findViewById<Button>(R.id.buttonBack).setOnClickListener {
            findNavController().navigateUp()
        }

        return view
    }
}
