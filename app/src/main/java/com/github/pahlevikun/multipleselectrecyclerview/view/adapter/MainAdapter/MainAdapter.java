/*
 * SelectLocationAdapter Created with ♥ by Farhan Yuda Pahlevi on 12/27/17 12:57 PM
 * Copyright (c) 2017. All Rights Reserved.
 *
 * Last Modified 12/22/17 11:28 PM
 */

package com.github.pahlevikun.multipleselectrecyclerview.view.adapter.MainAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.pahlevikun.multipleselectrecyclerview.R;
import com.github.pahlevikun.multipleselectrecyclerview.model.SampleModel;

import java.util.ArrayList;

/**
 * Created by farhan on 6/30/17.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    public ArrayList<SampleModel> listData;
    private Context context;

    public MainAdapter(Context context, ArrayList<SampleModel> listData) {
        this.listData = listData;
        this.context = context;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_list_main, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.textView.setText(listData.get(i).getNama());
        viewHolder.imageView.setOnClickListener(view -> {
            listData.remove(i);
            notifyDataSetChanged();
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textViewAdapter);
            imageView = view.findViewById(R.id.imageViewAdapter);
        }
    }

}

