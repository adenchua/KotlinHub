package com.example.aden.kotlintutor2000

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_revision1.*

class Revision : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_revision1)

        val adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Revision_Lesson1_Question1(), "No. 1")
        adapter.addFragment(Revision_Lesson1_Question2(), "No. 2")
        adapter.addFragment(Revision_Lesson1_Question3(), "No. 3")
        adapter.addFragment(Revision_Lesson1_Question4(), "No. 4")
        vp_revision1.adapter = adapter
        tl_revision1.setupWithViewPager(vp_revision1)
    }

    class MyViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

        private val fragmentList : MutableList<Fragment> = ArrayList()
        private val titleList : MutableList<String> = ArrayList()

        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }

        override fun getCount(): Int {
            return fragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            fragmentList.add(fragment)
            titleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }
    }
}
