package com.example.sairamchowdary.golfscorecard;

import android.app.ListActivity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Sairam Chowdary on 12/29/2017.
 */

public class ListAdapter extends BaseAdapter {


    private final Context mContext;
    private final Hole[] mHoles;

    public ListAdapter(Context context, Hole[] holes) {
        mContext = context;
        mHoles = holes;
    }

    @Override
    public int getCount() {
        return mHoles.length;
    }

    @Override
    public Object getItem(int position) {
        return mHoles[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
