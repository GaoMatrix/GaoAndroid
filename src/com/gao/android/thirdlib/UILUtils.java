package com.gao.android.thirdlib;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.gao.android.util.LogUtils;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Android-Universal-Image-Loader Utils
 * 
 */
public class UILUtils {

    /**
     * ImageLoader的DisplayImageOptions
     */
    public static DisplayImageOptions DISPLAY_IMAGE_OPTIONS //
    = new DisplayImageOptions.Builder() //
            // .showImageOnLoading(R.drawable.logo)
            // .showImageOnFail(R.drawable.logo)
            // .showImageForEmptyUri(R.drawable.logo)
            .cacheInMemory(true) //
            .cacheOnDisk(true) //
            .bitmapConfig(Bitmap.Config.RGB_565) //
            .build();

    /**
     * 显示图片
     * 
     * @param uri
     *            图片URI
     * @param imageView
     *            ImageView
     */
    public static void displayImage(String uri, ImageView imageView) {
        LogUtils.d("uri: " + uri);
        ImageLoader.getInstance().displayImage(uri, imageView,
                DISPLAY_IMAGE_OPTIONS);
    }

    /**
     * 清除UniversalImageLoader的缓存
     */
    public static void clearUniversalImageLoaderCache() {
        LogUtils.d("clearUniversalImageLoaderCache");
        ImageLoader.getInstance().clearMemoryCache();
        ImageLoader.getInstance().clearDiscCache();
    }
}
