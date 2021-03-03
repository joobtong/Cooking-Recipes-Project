package com.example.cooking_recipes_project.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cooking_recipes_project.Fragment.homeFragment
import com.example.cooking_recipes_project.Fragment.itemPageFragment


class ViewPagerAdapter(fragmentActivity: homeFragment) :
    FragmentStateAdapter(fragmentActivity) {
    private var fragments : ArrayList<Fragment> = arrayListOf(
        itemPageFragment(),
        itemPageFragment(),
        itemPageFragment(),
        itemPageFragment(),
    )
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}