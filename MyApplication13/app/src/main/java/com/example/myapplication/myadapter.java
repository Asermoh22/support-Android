package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myadapter.ViewHolder> {
    Context context;
    List<listitem>listiyems;

    public myadapter(Context context, List listitem) {
        this.context=context;
        this.listiyems=listitem;
    }

    @NonNull
    @Override
    public myadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myadapter.ViewHolder holder, int position) {
        listitem item=listiyems.get(position);
        holder.txt1.setText(item.getBrand());
        holder.txt2.setText(item.getModel());
        holder.txt3.setText(item.getSize());
        holder.txt4.setText(item.getDescription());


    }

    @Override
    public int getItemCount() {
        return listiyems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt1;
        TextView txt2;
        TextView txt3;
        TextView txt4;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.brand);
            txt2=itemView.findViewById(R.id.model);
            txt3=itemView.findViewById(R.id.size);
            txt4=itemView.findViewById(R.id.description);
        }
    }
}
