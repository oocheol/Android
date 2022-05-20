package com.example.myapplication0520;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // 우리가 만든 어플을 실질적으로 실행시켜주는 역할
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Java의 Main 메소드!
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼이 클릭 되었을 때 "버튼클릭"을 출력하고 싶음

    }
    public void click(View view){
        // View : 뷰 객체를 받을꺼에요
        // --> 뷰에 대한 정보를 받아올껍니다!
        // Log.d --> System.out.println()
        // Log.d("Tag 안내문구", "출력시키고 싶은 내용")
        Log.d("출력문","버튼클릭!");
    }

}