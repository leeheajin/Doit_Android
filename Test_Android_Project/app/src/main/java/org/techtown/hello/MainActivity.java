package org.techtown.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // setContentView : 화면에 무엇을 보여줄지 결정하는 함수
        // R.layout.activity_main : 화면에 보여줄 대상이 되는 XML의 위치를 지정 (/app/res/layout/activity_main.xml
    }

    public void onButton1Clicked(View v) {
        Toast.makeText(this, "확인1 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
        // Toast : 작고 간단한 메세지를 잠깐 보여줌
    }

    public void onButton2Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.op.gg"));
        startActivity(myIntent);
        // Intent : 내가 하고자하는 행위
        // Intent를 사용하면 애플리케이션 구성 요소 간에 데이터를 전달하거나 실행하려는 기능이 무엇인지 안드로이드 플랫폼에 전달 가능
    }

    public void onButton3Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
        startActivity(myIntent);
    }
}