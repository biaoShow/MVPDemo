package com.benxiang.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.benxiang.mvpdemo.model.Person;

public class MainActivity extends AppCompatActivity {

    PresenterInterface presenterInterface;
    private TextView tv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person("li","男",25);

        tv_text = findViewById(R.id.tv_text);

        presenterInterface = new MainActivityPresenter();
        presenterInterface.view("P层完成Logcat输出...");
        String str = presenterInterface.text(person);

        tv_text.setText(str);

    }
}
