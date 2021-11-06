package com.satyam.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycleList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
       String[] language = {"java", "python", "Ruby", "HTML", "javaScript", "c Language", "c#", "objective C", "php", "Sql", "Swift", "Kotlin"};
       recyclerView.setAdapter(new ProgrammingAdapter(language,MainActivity.this));
        if(new ProgrammingAdapter(language,MainActivity.this).getItemCount()==0){
            String[] text={"no data Available"};
            recyclerView.setAdapter(new ProgrammingAdapter(text,MainActivity.this));
        }
    }
}