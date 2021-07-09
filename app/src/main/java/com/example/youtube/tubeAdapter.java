package com.example.youtube;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class tubeAdapter extends RecyclerView.Adapter<tubeViewHolder> {
    private ArrayList<tubeModel> adapterList;
    private ItemClickListener itemClickListener;

    public tubeAdapter(ArrayList<tubeModel> adapterList,ItemClickListener itemClickListener){
        this.adapterList = adapterList;
        this.itemClickListener = itemClickListener;
    }
    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public tubeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new tubeViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull tubeViewHolder holder, int position) {
        tubeModel tubeModel = adapterList.get(position);
        holder.setData(tubeModel);
    }

    @Override
    public int getItemCount() {
        return adapterList.size();
    }
}
