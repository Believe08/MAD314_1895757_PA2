package com.example.mad314_1895757_pa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    public Activity2(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        RecyclerView rvStudent = findViewById(R.id.rvStudent);

        RecyclerView.LayoutManager LayoutManager  = new LinearLayoutManager(this);;
        rvStudent.setLayoutManager(LayoutManager);
    }
}
