package com.satyam.recyclerviewtest;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    ArrayList<Model> data;

    public ProgrammingAdapter(ArrayList<Model> data) {
        this.data = data;
    }


    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProgrammingAdapter.ProgrammingViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.name.setText(data.get(position).name);
        holder.btnImgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.remove(position);
                notifyItemRemoved(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView btnImgDelete;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            btnImgDelete=itemView.findViewById(R.id.btnImgDelete);

        }
    }

}
