package com.example.meuapp.TabsLayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.meuapp.databinding.FragmentTabsBinding

class TabsFragment : Fragment() {

    private var binding: FragmentTabsBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTabsBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentsList = listOf(Tab1Fragment(), Tab2Fragment(), Tab3Fragment())
        val fragmentsTitleList = listOf("Tab 1", "Tab 2", "Tab 3")

        activity?.let {
            val viewPagerAdapter = ViewPagerAdapter(
                fragmentManager = childFragmentManager,
                fragmentsList = fragmentsList,
                fragmentsTitleList = fragmentsTitleList
            )

            binding?.let {  bindingNonNull ->
                with(bindingNonNull) {
                    vpViewPageAdapter.adapter = viewPagerAdapter
                    tlTabs.setupWithViewPager(vpViewPageAdapter)
                }
            }
        }

//        binding?.tlPaymentTabs?.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                Log.i("tab - selected", tab?.text.toString())
//                when(tab?.position) {
//                    0 -> {
//                        goToFragment(Tab1Fragment())
//                    }
//                    1 -> {
//                        goToFragment(Tab2Fragment())
//                    }
//                    2 -> {
//                        goToFragment(Tab3Fragment())
//                    }
//                }
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//                Log.i("tab - unselected", tab?.text.toString())
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//                Log.i("tab - reselected", tab?.text.toString())
//            }
//        })
    }

//    fun goToFragment(fragment: Fragment) {
//        val fragmentTransaction = activity?.supportFragmentManager?.beginTransaction()
//        fragmentTransaction?.replace(R.id.container, fragment)
//        fragmentTransaction?.commit()
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}