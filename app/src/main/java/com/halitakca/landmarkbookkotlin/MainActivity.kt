package com.halitakca.landmarkbookkotlin

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.halitakca.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        landmarkList = ArrayList<Landmark>()
        //DATA

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val colosseum = Landmark("Colesseum","Italy",R.drawable.colosseum)
        val eiffel = Landmark("Eiffel","France",R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge","UK",R.drawable.londonbridge)

        //GEREK YOK ŞUAN AMA HER ZAMAN DA İNTENT KULLANAMAZSIN (BÜYÜK VERİLER)
        //val pisaBitmap = BitmapFactory.decodeResource(resources,R.drawable.pisa)


        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)



        // RECYCLER VİEW


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter =  LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter






        /*

                    LİST VİEW

        // ADAPTER =>  LAYOUT & DATA
        // + MAPPİNG


        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name  })
        binding.listView.adapter = adapter

        // LİSTE ELEMANLARINDA ONCLİCK METODU
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(MainActivity@this,DetailsActivity::class.java)
            //SERİALİZABLE YAPTIK BURDA HATA VERMEASİN DİYE
            intent.putExtra("landmark",landmarkList.get(position))

            startActivity(intent)
        }

        */
    }
}