package com.example.project_listfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.awkitsune.fragmentdemonstration2.DetailFragment
import com.awkitsune.fragmentdemonstration2.ListFragment


class MainActivity : AppCompatActivity(),
    ListFragment.OnFragmentSendDataListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onSendData(selectedItem: String?) {
        val fragment = supportFragmentManager
            .findFragmentById(R.id.detailFragment) as DetailFragment?
        if (fragment != null && fragment.isVisible){
            fragment.setSelectedItem(selectedItem)
        }
        else{
            val intent = Intent(applicationContext,
                DetailActivity::class.java)
            intent.putExtra(DetailActivity.SELECTED_ITEM, selectedItem)
            startActivity(intent)
        }
        fragment?.setSelectedItem(selectedItem)
    }
}