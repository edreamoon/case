package com.moji.redleaves.fragment

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ware.R
import com.ware.systip.recyclerview.LeafFragment
import com.ware.systip.recyclerview.TouchedAdapter
import kotlinx.android.synthetic.main.fragment_cn_leaf.*
import java.util.*


class CnLeafFragment : LeafFragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mRecyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context, androidx.recyclerview.widget.LinearLayoutManager.VERTICAL, false)
        val strings = ArrayList<String>()
        for (i in 0..31) {
            strings.add("pos: $i")
        }
        mRecyclerView.adapter = TouchedAdapter(strings)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_cn_leaf, container, false)
    }

}
