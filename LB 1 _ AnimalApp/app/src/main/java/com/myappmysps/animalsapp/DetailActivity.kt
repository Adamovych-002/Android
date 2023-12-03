package com.myappmysps.animalsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myappmysps.animalsapp.data.model.AnimalClass
import com.myappmysps.animalsapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this@DetailActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    private var _binding: ActivityDetailBinding? = null
    private val binding get() = _binding!!
    private val duck= AnimalClass(name = "Duck",
        description = "Деякі види качок, переважно в помірних і арктичних широтах північної півкулі є перелітні,\n" +
                " тоді як інші, особливо в тропіках, ні. \n" +
                "Деякі качки, зокрема Австралії, де кількість опадів непостійна, шукають тимчасові озера й водойми, \n" +
                "що формуються після дощу. \n" +
                "Часто вони є об'єктом промислу людей \n" +
                "або розводяться у сільському господарстві.\n",R.mipmap.duck)
    private val walrus= AnimalClass(name = "Walrus",
        description = "Морж звичайний розповсюджений по всьому узбережжю Північного Льодовитого океану. \n" +
            "За розмірами тіла серед ластоногих моржі поступаються лише морським слонам. \n" +
            " У природі ареали цих видів не перетинаються.\n " +
            "Тому моржі є найбільшими ластоногими у своєму середовищі проживання. ",R.mipmap.walrus)
    private val hammerfish= AnimalClass(name = "Hammerfish",
        description = "До родини акул-молотів належать 2 роди із сімома видами. \n" +
                " Акули-молоти є родичами сірим акулам, але відрізняються від них, а також від всіх інших риб дуже своєрідною формою голови. \n" +
                " Вона сильно сплющена зверху вниз і має з боків два більших вирости,\n" +
                " на зовнішніх краях яких розташовані очі, а трохи попереду від них — більші ніздрі. ",R.mipmap.hammerfish)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        when (intent.getStringExtra("Animal")) {
            "walrus" -> {
                binding.textViewNameDetail.text = this.walrus.name
                binding.textViewDescriptions.text = this.walrus.description
                binding.imageViewDetail.setImageResource(this.walrus.image)

            }

            "duck" -> {
                binding.textViewNameDetail.text = this.duck.name
                binding.textViewDescriptions.text = this.duck.description
                binding.imageViewDetail.setImageResource(this.duck.image)
            }

            "hammerfish" -> {
                binding.textViewNameDetail.text = this.hammerfish.name
                binding.textViewDescriptions.text = this.hammerfish.description
                binding.imageViewDetail.setImageResource(this.hammerfish.image)
            }
        }
    }


}