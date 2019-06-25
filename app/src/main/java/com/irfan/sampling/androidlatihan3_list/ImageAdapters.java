package com.irfan.sampling.androidlatihan3_list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


/**
 * created by Irfan Assidiq on 2019-05-16
 * email : assidiq.irfan@gmail.com
 **/
public class ImageAdapters extends BaseAdapter {

    public Context ctx;

    public Integer[] gambars = {
            R.drawable.id, R.drawable.jp, R.drawable.fr,
            R.drawable.ptgs, R.drawable.nth
    };

    public ImageAdapters(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return gambars.length;
    }

    @Override
    public Object getItem(int i) {
        return gambars[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgView = new ImageView(ctx);
        imgView.setImageResource(gambars[i]);
        imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgView.setLayoutParams(new GridView.LayoutParams(300, 300));
        return imgView;
    }
}
