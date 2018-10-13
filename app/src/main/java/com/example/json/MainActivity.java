package com.example.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String srJson="\"Employee\":[{\"id\":\"01\",\"name\":\"ahmed\",\"salary\":\"30000\",},{\"id\":\"01\",\"name\":\"ahmed\",\"salary\":\"30000\",},{\"id\":\"01\",\"name\":\"ahmed\",\"salary\":\"30000\",}]}";
        try {
            JSONObject Object=new JSONObject(srJson);
            JSONArray Array=Object.getJSONArray("Employee");


            JSONObject ObjectInArray_0=Array.getJSONObject(0);
            int id_0=ObjectInArray_0.getInt("id");
            String name_0=ObjectInArray_0.getString("name");
            int salary_0=ObjectInArray_0.getInt("salary");


            JSONObject ObjectInArray_1=Array.getJSONObject(1);
            int id_1=ObjectInArray_1.getInt("id");
            String name_1=ObjectInArray_1.getString("name");
            int salary_1=ObjectInArray_1.getInt("salary");

            JSONObject ObjectInArray_2=Array.getJSONObject(2);
            int id_2=ObjectInArray_1.getInt("id");
            String name_2=ObjectInArray_1.getString("name");
            int salary_2=ObjectInArray_1.getInt("salary");

        } catch (JSONException ex) {
            ex.printStackTrace();
        }
    }
}
