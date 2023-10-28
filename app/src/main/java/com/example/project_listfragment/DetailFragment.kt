package com.awkitsune.fragmentdemonstration2

import androidx.fragment.app.Fragment
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.content.Context
import android.widget.ImageView
import com.example.project_listfragment.R

class DetailFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
        val imageView = view?.findViewById<ImageView>(R.id.imageView2)
    }
    // обновление текстового поля
    fun setSelectzdItem(selectedItem: String?) {
        val views = view?.findViewById<TextView>(R.id.detailsText)
        val imageView = view?.findViewById<ImageView>(R.id.imageView2)
        when(selectedItem){
            "Афганская борзая" -> {views?.text = context?.getString(R.string.afghan)
                imageView?.setImageResource(R.drawable.afghan_hound)}
            "Сибирский хаски" -> {views?.text = context?.getString(R.string.siberian)
                imageView?.setImageResource(R.drawable.siberian_husky)}
            "Золотистый ретривер" -> {views?.text = context?.getString(R.string.golden)
                imageView?.setImageResource(R.drawable.golden_retriever)}
            "Самоедская лайка" -> {views?.text = context?.getString(R.string.samoyed)
                imageView?.setImageResource(R.drawable.samoyed)}
            "Кламбер-спаниель" -> {views?.text = context?.getString(R.string.clumber)
                imageView?.setImageResource(R.drawable.clumber_spaniel)}
        }

    }
}