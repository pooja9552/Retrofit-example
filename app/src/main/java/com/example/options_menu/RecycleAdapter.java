package com.example.options_menu;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.Myholder> {


    Context context;
    ArrayList<String> list;

    public RecycleAdapter(Context applicationContext, ArrayList<String> languages) {
        this.context = applicationContext;
        this.list=languages;
    }

    @NonNull
    @Override
    public RecycleAdapter.Myholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.example_item, viewGroup, false);
        return new Myholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.Myholder myholder, int position) {
        String title = list.get(position);
        myholder.textTitle.setText(title);

    }


    @Override
    public int getItemCount() {
        return  list.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView textTitle;

        public Myholder(@NonNull View itemView) {

            super(itemView);
            imgIcon=itemView.findViewById(R.id.imgIcon);
            textTitle=itemView.findViewById(R.id.textTitle);


        }
    }
}