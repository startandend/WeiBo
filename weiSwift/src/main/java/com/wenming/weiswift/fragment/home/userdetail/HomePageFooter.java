package com.wenming.weiswift.fragment.home.userdetail;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.wenming.weiswift.R;


/**
 * Created by cundong on 2015/10/9.
 * <p/>
 * RecyclerView的FooterView，简单的展示一个TextView
 */
public class HomePageFooter extends RelativeLayout {

    public HomePageFooter(Context context) {
        super(context);
        init(context);
    }

    public HomePageFooter(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public HomePageFooter(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context) {

        inflate(context, R.layout.user_profile_layout_homepage_footerview, this);
    }
}