package com.satyam.recyclerviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {
ArrayList<Model> data;

    public ProgrammingAdapter(ArrayList<Model> data) {
        this.data = data;
    }

    public ProgrammingAdapter() {
    }

    @Override
    public ProgrammingViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ProgrammingAdapter.ProgrammingViewHolder holder, int position) {
     holder.name.setText(data.get(position).name);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ProgrammingViewHolder extends RecyclerView.ViewHolder{
TextView name;
        public ProgrammingViewHolder( View itemView) {
            super(itemView);
            name =itemView.findViewById(R.id.name);
        }
    }
 
}
