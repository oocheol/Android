package com.example.myapplication0520;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView tv_main;

    // 우리가 만든 어플을 실질적으로 실행시켜주는 역할
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Java의 Main 메소드!
        // 차이점 : Java는 main 메소드가 끝나면 프로그램이 끝나게 되지만
        // 안드로이드에서는 onCreate가 끝난다고 해서 프로그램이 종료되지 않음!
        super.onCreate(savedInstanceState);

        // xml 파일을 실질적으로 화면에 보여지게끔 만들어 줌!
        setContentView(R.layout.activity_main);

        // EditText --> PlainText
        editText = findViewById(R.id.editText);
        tv_main = findViewById(R.id.tv_main);

    }

    // 버튼이 클릭 되었을 때 "버튼클릭"을 출력하고 싶음
    // 1. 이벤트 적용시키는 방법!
    public void click(View view){
        // View : 뷰 객체를 받을꺼에요
        // --> 뷰에 대한 정보를 받아올껍니다!
        // Log.d --> System.out.println()
        // Log.d("Tag 안내문구", "출력시키고 싶은 내용")
        Log.d("출력문","버튼클릭!");

        // Plain Text에 입력한 내용을 출력하고 싶어요!
        // Plain Text를 객체로 가져와서 안에 있는 내용을 꺼내야 함!
        // getText() --> xml에서 인식 가능한 문자열타입
        String data = editText.getText().toString();
        Log.d("입력한 내용",data);

        // TextView에 입력한 내용 출력
        // tv_main = findViewById(R.id.tv_main);
        tv_main.setText(data);

    }

    public void click2(View view){
        // TextView에 내용을 --> '초기화 할꺼에요!' 출력!
        // tv_main = findViewById(R.id.tv_main);
        tv_main.setText("초기화 할꺼에요!");
    }

}