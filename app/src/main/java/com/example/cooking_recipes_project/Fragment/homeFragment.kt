package com.example.cooking_recipes_project.Fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.example.cooking_recipes_project.Adapter.ViewPagerAdapter
import com.example.cooking_recipes_project.R
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class homeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter by lazy { ViewPagerAdapter(this) }
        view_pager.adapter = adapter
        var names:Array<String> = arrayOf("ต้ม ","ผัด","ทอด","อบ")
        TabLayoutMediator(tablayout,view_pager){tab, position ->
            tab.text = names[position]
        }.attach()
    }




}
