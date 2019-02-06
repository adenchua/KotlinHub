package com.example.aden.kotlintutor2000

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_revision3.*

class Revision3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_revision3)

        val adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Revision_Lesson3_Question1(), "No. 1")
        adapter.addFragment(Revision_Lesson3_Question2(), "No. 2")
        adapter.addFragment(Revision_Lesson3_Question3(), "No. 3")
        adapter.addFragment(Revision_Lesson3_Question4(), "No. 4")
        vp_revision3.adapter = adapter
        tl_revision3.setupWithViewPager(vp_revision3)
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
