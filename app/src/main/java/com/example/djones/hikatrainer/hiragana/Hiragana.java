package com.example.djones.hikatrainer.hiragana;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.djones.hikatrainer.R;

import java.util.Random;

/**
 * Created by djones on 12/29/16.
 */

public class Hiragana extends Activity {

    ImageView hiraganaImage;
    ImageButton guessImageButton1, guessImageButton2, guessImageButton3, guessImageButton4, guessImageButton5;
    private final String correctGuess = "Correct";
    private final String wrongGuess = "Guess Again";
    SparseIntArray mapWithImages = new SparseIntArray();
    int generateRandomIndex;
    int shortToastDuration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiragana);

        mapWithImages.put(R.drawable.hi_i, R.drawable.hi_i_ant);
        mapWithImages.put(R.drawable.hi_ka, R.drawable.hi_ka_ant);
        mapWithImages.put(R.drawable.hi_n, R.drawable.hi_n_ant);
        mapWithImages.put(R.drawable.hi_o, R.drawable.hi_o_ant);
        mapWithImages.put(R.drawable.hi_ta, R.drawable.hi_ta_ant);

        generateRandomIndex = randomNumber(0, 4);

        hiraganaImage = (ImageView) findViewById(R.id.hiragana_image);
        hiraganaImage.setImageResource(mapWithImages.keyAt(generateRandomIndex));

        guessImageButton1 = (ImageButton) findViewById(R.id.randomImage1);
        Integer value = mapWithImages.get(R.drawable.hi_i);
        guessImageButton1.setImageResource(value);

        guessImageButton2 = (ImageButton) findViewById(R.id.randomImage2);
        Integer value2 = mapWithImages.get(R.drawable.hi_ka);
        guessImageButton2.setImageResource(value2);

        guessImageButton3 = (ImageButton) findViewById(R.id.randomImage3);
        Integer value3 = mapWithImages.get(R.drawable.hi_n);
        guessImageButton3.setImageResource(value3);

        guessImageButton4 = (ImageButton) findViewById(R.id.randomImage4);
        Integer value4 = mapWithImages.get(R.drawable.hi_o);
        guessImageButton4.setImageResource(value4);

        guessImageButton5 = (ImageButton) findViewById(R.id.randomImage5);
        Integer value5 = mapWithImages.get(R.drawable.hi_ta);
        guessImageButton5.setImageResource(value5);

    }

    public void onClick(View v) {

        int first_ans_button = 0;
        int second_ans_button = 1;
        int third_ans_button = 2;
        int forth_ans_button = 3;
        int fifth_ans_button = 4;

        switch (v.getId()) {
            case R.id.randomImage1:
                if (first_ans_button == generateRandomIndex) {

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, correctGuess, shortToastDuration);
                    toast.show();
                } else {

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, wrongGuess, shortToastDuration);
                    toast.show();
                }
                break;
            case R.id.randomImage2:
                if (second_ans_button == generateRandomIndex) {

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, correctGuess, shortToastDuration);
                    toast.show();
                } else {

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, wrongGuess, shortToastDuration);
                    toast.show();
                }
                break;
            case R.id.randomImage3:
                if (third_ans_button == generateRandomIndex) {

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, correctGuess, shortToastDuration);
                    toast.show();
                } else {

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, wrongGuess, shortToastDuration);
                    toast.show();
                }
                break;
            case R.id.randomImage4:
                if (forth_ans_button == generateRandomIndex) {

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, correctGuess, shortToastDuration);
                    toast.show();
                } else {

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, wrongGuess, shortToastDuration);
                    toast.show();
                }
                break;
            case R.id.randomImage5:
                if (fifth_ans_button == generateRandomIndex) {

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, correctGuess, shortToastDuration);
                    toast.show();
                } else {

                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, wrongGuess, shortToastDuration);
                    toast.show();
                }
                break;
        }
    }

    public int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1 ) - min;
    }

}
