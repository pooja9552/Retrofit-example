package com.example.options_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofit extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        listView=findViewById(R.id.listView);
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api=retrofit.create(Api.class);
        Call<List<Heroes>>call=api.getHeroes();
        call.enqueue(new Callback<List<Heroes>>() {
            @Override
            public void onResponse(Call<List<Heroes>> call, Response<List<Heroes>> response) {
                List<Heroes>heroes=response.body();
                String[]heroNames=new String[heroes.size()];
                int i;
                for(i=0; i<heroes.size(); i++){
                    heroNames[i]=heroes.get(i).getName();
                    
                }
                listView.setAdapter(
                        new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,heroNames
                        )
                );
                }


            @Override
            public void onFailure(Call<List<Heroes>> call, Throwable t) {
                Toast.makeText(retrofit.this, "error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
