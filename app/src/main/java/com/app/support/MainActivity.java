package com.app.support;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToIntent(View view) {
        Button button = (Button) view;
        String clazz = button.getText().toString();
        Intent intent = new Intent();
        intent.setClassName(this.getPackageName(), clazz);
        startActivity(intent);
    }

}