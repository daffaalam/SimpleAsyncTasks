package com.daffaalam.example.simpleasynctasks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {

    private final Context context;
    private final ArrayList<String> stringArrayListTitle, stringArrayListSub, stringArrayListImage;

    MainAdapter(Context context, ArrayList<String> stringArrayListTitle, ArrayList<String> stringArrayListSub, ArrayList<String> stringArrayListImage) {
        this.context = context;
        this.stringArrayListTitle = stringArrayListTitle;
        this.stringArrayListSub = stringArrayListSub;
        this.stringArrayListImage = stringArrayListImage;
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainHolder(LayoutInflater.from(context).inflate(R.layout.item_main, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        holder.tvTitleItemMain.setText(stringArrayListTitle.get(position));
        holder.tvSubItemMain.setText(stringArrayListSub.get(position));
        Glide.with(context).load(stringArrayListImage.get(position)).into(holder.ivItemMain);
    }

    @Override
    public int getItemCount() {
        return stringArrayListTitle.size();
    }

    class MainHolder extends RecyclerView.ViewHolder {
        final TextView tvTitleItemMain, tvSubItemMain;
        final ImageView ivItemMain;

        MainHolder(View itemView) {
            super(itemView);
            tvTitleItemMain = itemView.findViewById(R.id.tvTitleItemMain);
            tvSubItemMain = itemView.findViewById(R.id.tvSubItemMain);
            ivItemMain = itemView.findViewById(R.id.ivItemMain);
        }
    }
}
