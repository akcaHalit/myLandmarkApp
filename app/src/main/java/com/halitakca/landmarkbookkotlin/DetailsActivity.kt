package com.halitakca.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.halitakca.landmarkbookkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        val intent = intent
        // casting

        /* 1
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        binding.nameText.text = selectedLandmark!!.name
        binding.countryText.text = selectedLandmark!!.country
        binding.imageView.setImageResource(selectedLandmark!!.image)

        */

        /* 2
        val selectedLandmark = chosenLandmark

        selectedLandmark?.let {
            binding.nameText.text = selectedLandmark!!.name
            binding.countryText.text = selectedLandmark!!.country
            binding.imageView.setImageResource(selectedLandmark!!.image)
        }
        */

        // 3
        val selectedLandmark = MySingleton.chosenLandmark

        selectedLandmark.let {          // it => selectedLandmark
            binding.nameText.text = it!!.name
            binding.countryText.text = it!!.country
            binding.imageView.setImageResource(it!!.image)
        }



    }
}