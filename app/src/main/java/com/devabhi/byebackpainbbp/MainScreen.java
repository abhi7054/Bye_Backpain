package com.devabhi.byebackpainbbp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.devabhi.byebackpainbbp.R.id.greenbutton;

public class MainScreen extends AppCompatActivity {
    public Button button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        button =  findViewById(greenbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_mainscreen2();
            }
        });
    }


    public void openactivity_mainscreen2() {
        Intent intent = new Intent(MainScreen.this, MainScreen2.class);

        startActivity(intent);
        finish();

    }

}