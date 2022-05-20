package com.example.myapplication0520;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // 우리가 만든 어플을 실질적으로 실행시켜주는 역할
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Java의 Main 메소드!
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}