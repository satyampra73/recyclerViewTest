package com.satyam.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.programmingViewHolder> {
    String [] data;
    Context context;
    public ProgrammingAdapter(String [] data,Context context) {
        this.data=data;
        this.context=context;
    }

    @Override
    public programmingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.items,parent,false);
        return new programmingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(programmingViewHolder holder, int position) {
        String title=data[position];
        holder.textView.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class programmingViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        public programmingViewHolder(View itemView) {
            super(itemView);
            textView=(TextView) itemView.findViewById(R.id.textView);
            imageView=(ImageView) itemView.findViewById(R.id.imageView);

        }
    }

}
