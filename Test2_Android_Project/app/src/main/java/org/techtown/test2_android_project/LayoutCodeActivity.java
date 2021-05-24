package org.techtown.test2_android_project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LayoutCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this); // new 연산자로 리니어 레이아웃을 만들고 방향 설정
        // Context는 객체의 정보를 담고있는 객체를 의미하는 경우가 많음, 뷰의 생성자에 Context 객체를 전달해야 함
        // AppCompatActivity 클래스는 Context를 상속하므로 이 클래스 안에서는 this를 Context 객체로 사용할 수 있음
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params = // new 연산자로 레이아웃 안에 추가될 뷰들에 설정할 파라미터 생성
                new LinearLayout.LayoutParams( // 반드시 가로와 세로 속성 지정 필요
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        Button button1 = new Button(this); // 버튼에 파라미터 설정하고 레이아웃에 추가
        button1.setText("Button1");
        button1.setLayoutParams(params); // 레이아웃 설정
        mainLayout.addView(button1); // 레이아웃에 뷰를 추가

        setContentView(mainLayout); // 새로만든 레이아웃을 화면에 설정
    }

}