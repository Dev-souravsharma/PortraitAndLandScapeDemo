package com.example.potraitandlandscapedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
                    Toast.makeText(MainActivity.this, "Hello potrait", Toast.LENGTH_SHORT).show();
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
                    Toast.makeText(MainActivity.this, "Hello LandScape", Toast.LENGTH_SHORT).show();
            }
        });
    }
}