package com.satyam.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FloatingActionButton btn_open_dialog;
    ProgrammingAdapter adapter;
    String str;
    ArrayList<Model> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_open_dialog = findViewById(R.id.btn_open_dialog);
        recyclerView = findViewById(R.id.recycleList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        data.add(new Model("satyam"));
        data.add(new Model("Java"));
        data.add(new Model("Android"));
        data.add(new Model("Developer"));
        data.add(new Model("Developer1"));
        data.add(new Model("Developer2"));
        data.add(new Model("Developer3"));
        adapter = new ProgrammingAdapter(data);
        recyclerView.setAdapter(adapter);
        btn_open_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_layout);
                EditText etName=dialog.findViewById(R.id.et_name);
                Button btnAdd=dialog.findViewById(R.id.btnAdd);
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        data.add(new Model(etName.getText().toString()));
                        dialog.dismiss();
                    }
                });
                dialog.show();


            }
        });
       


    }
}