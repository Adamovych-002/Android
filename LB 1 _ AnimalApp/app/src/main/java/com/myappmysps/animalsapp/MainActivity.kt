package com.myappmysps.animalsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myappmysps.animalsapp.data.model.AnimalClass
import com.myappmysps.animalsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val duck= AnimalClass(name = "Duck", description = "Качки поширені \n"+
            "та популярні\n" +
            " по цілому світу",R.mipmap.duck)
    private val walrus= AnimalClass(name = "Walrus", description = "Морж звичайний \n" +
            "великий морський\n" +
            " ссавець групи \n" +
            "Ластоногих",R.mipmap.walrus)
    private val hammerfish= AnimalClass(name = "Hammerfish", description = "Акула-молоти\n"+
            " родина акул ряду \n" +
            " кархариноподібних. ",R.mipmap.hammerfish)

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewName.text=walrus.name
        binding.textViewDescription.text=walrus.description
        binding.imageView.setImageResource(walrus.image)
        binding.textViewNameTwo.text=duck.name
        binding.textViewDescriptionTwo.text=duck.description
        binding.imageViewTwo.setImageResource(duck.image)
        binding.textViewNameThree.text=hammerfish.name
        binding.textViewDescriptionThree.text=hammerfish.description
        binding.imageViewThree.setImageResource(hammerfish.image)
        binding.button.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("Animal", "walrus")
            startActivity(intent)
            finish()
        }
        binding.buttonTwo.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("Animal", "duck")
            startActivity(intent)
            finish()
        }
        binding.buttonThree.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("Animal", "hammerfish")
            startActivity(intent)
            finish()
        }
    }
}