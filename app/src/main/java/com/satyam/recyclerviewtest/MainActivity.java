package com.satyam.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EditText editText;
    Button button;
ArrayList<Model> data =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        data.add(new Model("satyam"));
        data.add(new Model("Java"));
        data.add(new Model("Android"));
        data.add(new Model("Developer"));
        ProgrammingAdapter adapter=new ProgrammingAdapter(data);
        recyclerView.setAdapter(adapter);


    }
}