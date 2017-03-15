package com.sunflower.idemotemplate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sunflower.idemotemplate.MainActivity;

import java.util.List;


/**
 * Created by yunlala-web on 2016/11/24.
 */

public class ListAdapter extends BaseAdapter {

    private List<MainActivity.ActivityInfo> list;
    private Context mContext;

    public ListAdapter(Context context, List<MainActivity.ActivityInfo> list) {
        this.list = list;
        this.mContext = context;
    }


    @Override
    public int getCount() {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(android.R.layout.simple_list_item_1, null);
            viewHolder.title = (TextView) view.findViewById(android.R.id.text1);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.title.setText(list.get(i).getTitle());

        return view;
    }

    public static class ViewHolder {
        TextView title;
    }
}
