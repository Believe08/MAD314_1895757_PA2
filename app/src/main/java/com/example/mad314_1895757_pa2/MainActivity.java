package com.example.mad314_1895757_pa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView title = findViewById(R.id.title);
        final EditText etUsername = findViewById(R.id.username);
        final EditText etPassword = findViewById(R.id.password);
        final Button submitButton = findViewById(R.id.submit);

        //StudentAdapter mAdapter = new StudentAdapter(getApplicationContext());
        //rvStudent.setAdapter(mAdapter);



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etUsername.getText().toString();
                String pass = etPassword.getText().toString();

                Student student = new Student(){
                    student.name = name;
                    student.pass = pass;
                };

                





            }
        });


    }
}
