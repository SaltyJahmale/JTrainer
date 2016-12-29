package com.example.djones.hikatrainer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button button_hiragana;
    Button button_katakana;
    Button button_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_hiragana = (Button) findViewById(R.id.main_button_hiragana);
        button_hiragana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Hiragana.class);
                startActivity(intent);

            }
        });

        button_katakana = (Button) findViewById(R.id.main_button_katakana);
        button_katakana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Katakana.class);
                startActivity(intent);

            }
        });

        button_info = (Button) findViewById(R.id.main_button_info);
        button_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Info.class);
                startActivity(intent);
            }
        });


    }

}
