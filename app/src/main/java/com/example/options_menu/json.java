package com.example.options_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.options_menu.R;

import org.json.JSONException;
import org.json.JSONObject;

public class json extends AppCompatActivity {
    public static final String JSON_STRING = "{\"employee\":{\"name\":Pooja Lokhande\",\"salary\":90000}}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
        TextView textView1 = findViewById(R.id.text_View1);
        try {
            JSONObject emp=(new JSONObject(JSON_STRING)).getJSONObject("employee");
            String empname=emp.getString("name");
            int empsalary=emp.getInt("salary");


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    }

