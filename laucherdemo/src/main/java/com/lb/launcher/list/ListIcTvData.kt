package com.lb.launcher.list

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import cn.lb.overrecycler.BaseHolder
import cn.lb.overrecycler.BaseHolderData
import com.lb.launcher.R
import kotlinx.android.synthetic.main.list_ic_text.view.*

/**
 * @author LiuBo
 * @date 2018-11-21
 */
class ListIcTvData : BaseHolderData() {
    var mDrawable : Drawable? = null
    var mText = ""

    override fun getLayoutId(): Int {
        return R.layout.list_ic_text
    }
    class ListIcTvHolder : BaseHolder<ListIcTvData> {

        var mTv : TextView
        var mIv : ImageView

        constructor(item: View) : super(item) {
            mIv = findViewById(R.id.iv_list_ic)
            mTv = findViewById(R.id.tv_list_txt)
        }

        override fun onBindView(data: ListIcTvData, position: Int) {
            super.onBindView(data, position)

            mIv.setImageDrawable(data.mDrawable)
            mTv.text = data.mText
        }
    }
}