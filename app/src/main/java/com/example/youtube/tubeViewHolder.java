package com.example.youtube;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class tubeViewHolder extends RecyclerView.ViewHolder {

    private ImageView thumbnail;
    private ItemClickListener itemClickListener;
    private RelativeLayout relativeLayout;
    private TextView tvTitle;
    String link;

    public tubeViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        thumbnail = itemView.findViewById(R.id.ivThumbnail);
        tvTitle = itemView.findViewById(R.id.tvVideoTitle);

        relativeLayout = itemView.findViewById(R.id.cardView);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition());
            }
        });
    }

    public void setData(tubeModel tubeModel) {
        thumbnail.setImageResource(tubeModel.getmIvThumbnail());
        tvTitle.setText(tubeModel.getmTvVideoTitle());
    }
}
