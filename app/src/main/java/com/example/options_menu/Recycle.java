package com.example.options_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Recycle extends AppCompatActivity {
 RecyclerView recyclerView;
    ArrayList<String> languages=new ArrayList<String>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        languages.add("Abd");
        languages.add("Abc");
        languages.add("Abe");
        languages.add("Asc");
        recyclerView =findViewById(R.id.list);

        Recycle1 recycle1=new Recycle1()
//        RecycleAdapter recycleAdapter=new RecycleAdapter(getApplicationContext(),languages);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
       recyclerView.setAdapter(recycleAdapter);

    }
}
