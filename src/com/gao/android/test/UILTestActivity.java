package com.gao.android.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.gao.android.thirdlib.UILUtils;
import com.nostra13.universalimageloader.core.ImageLoader;

public class UILTestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addView();
    }

    private void addView() {
        ImageView imageView = new ImageView(this);
        String url = "http://newcdn.tvall.cn/20151117170546/%E4%BD%BF%E5%91%BD%E5%8F%AC%E5%94%A4%20(1).png";
        UILUtils.displayImage(url, imageView);
        setContentView(imageView);
    }
}
