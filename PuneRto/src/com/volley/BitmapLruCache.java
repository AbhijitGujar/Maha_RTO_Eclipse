package com.volley;

import com.android.volley.toolbox.ImageLoader.ImageCache;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

public class BitmapLruCache extends LruCache<String, Bitmap> implements ImageCache{
	public static int getMaxCacheMemory(){
		final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
		return maxMemory / 8;
	}
	
	public BitmapLruCache(){
		this(getMaxCacheMemory());
	}
			
	public BitmapLruCache(int maxSize) {
		super(maxSize);
	}
	
	@Override
	protected int sizeOf(String key, Bitmap value) {	
		return value.getRowBytes() * value.getHeight() / 1024;
	}

	@Override
	public Bitmap getBitmap(String url) {		 
		return get(url);
	}

	@Override
	public void putBitmap(String url, Bitmap bitmap) {
		put(url, bitmap);
	}
}
