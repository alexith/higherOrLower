package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Math.random;

public class MainActivity extends AppCompatActivity {

    public void guessInProgress(View view){

    EditText guessedNumber = findViewById(R.id.guessedNumber);

    Double finalGuessedNumber = Double.parseDouble(guessedNumber.getText().toString());

        Random rand = new Random();
        int randomNumber = rand.nextInt(20) + 1;

        if (finalGuessedNumber > randomNumber){
            Toast.makeText(MainActivity.this, "You guessed greater number", Toast.LENGTH_SHORT).show();
        } else if (finalGuessedNumber < randomNumber){
            Toast.makeText(MainActivity.this, "You guessed lesser number", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "You guessed it right! :)", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
