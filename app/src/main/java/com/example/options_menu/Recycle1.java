package com.example.options_menu;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

class Recycle1 extends RecyclerView.Adapter<Recycle1.Myholder> {
    @NonNull
    @Override
    public Recycle1.Myholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Recycle1.Myholder myholder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Myholder extends RecyclerView.ViewHolder {
        public Myholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
