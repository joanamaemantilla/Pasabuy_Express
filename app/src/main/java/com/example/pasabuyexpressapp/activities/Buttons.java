package com.example.pasabuyexpressapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pasabuyexpressapp.R;

public class Buttons extends AppCompatActivity {
    private Button btnBuyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        btnBuyer=findViewById(R.id.move);
        btnBuyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Buttons.this, SignInActivity.class);
                startActivity(intent);

            }
        });

    }
}