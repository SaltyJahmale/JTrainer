package com.example.djones.hikatrainer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by djones on 12/29/16.
 */

public class Hiragana extends Activity {

    ImageView hiraganaImage;
    ImageButton guessImageButton1;
    ImageButton guessImageButton2;
    ImageButton guessImageButton3;
    ImageButton guessImageButton4;
    ImageButton guessImageButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiragana);

        hiraganaImage = (ImageView) findViewById(R.id.hiragana_image);


        guessImageButton1 = (ImageButton) findViewById(R.id.randomImage1);


        guessImageButton2 = (ImageButton) findViewById(R.id.randomImage2);


        guessImageButton3 = (ImageButton) findViewById(R.id.randomImage3);


        guessImageButton4 = (ImageButton) findViewById(R.id.randomImage4);


        guessImageButton5 = (ImageButton) findViewById(R.id.randomImage5);


    }
}
