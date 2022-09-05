package com.garonebusineslytips.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bakeysdietfood.app.BkFirstPageAdapter
import com.garonebusineslytips.app.databinding.ActivityMainBinding
import com.garonebusineslytips.app.garonebusutils.DietBkList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var adapter : BkFirstPageAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ofwfwef()
    }

    private fun ofwfwef() = with(binding){
        adapter = BkFirstPageAdapter(DietBkList.kdsfsdfsf,this@MainActivity)
        rcView.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        rcView.adapter = adapter

    }
}