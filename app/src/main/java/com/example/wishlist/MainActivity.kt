package com.example.wishlist

import Wish
import WishFetcher
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var wishes: List<Wish>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val button= findViewById<Button>(R.id.button)
//        val nameEdit=findViewById<EditText>(R.id.naming_simple)
//        val urlEdit=findViewById<EditText>(R.id.url)
//        val priceEdit=findViewById<EditText>(R.id.Price)


        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener(){
            val name=findViewById<EditText>(R.id.naming_simple).text.toString()
            val url=findViewById<EditText>(R.id.url).text.toString()
            val price=findViewById<EditText>(R.id.Price).text.toString()
            Log.v("My activity",name)
            Log.v("My activity",url)
            Log.v("My activity",price)
            val wishRev=findViewById<RecyclerView>(R.id.wishrev)
            WishFetcher.addWishes(name, url, price)
            wishes=WishFetcher.getWishes()
            Log.v("My Activities As a whole", wishes.toString())


            val adapter=WishAdapter(wishes)
            wishRev.adapter= adapter
            wishRev.layoutManager=LinearLayoutManager(this)
        }
    }
}



//
//            WishFetcher.addWishes(name, url, price)