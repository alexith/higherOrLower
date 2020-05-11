package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void guessInProgress(View view){

    EditText guessedNumber = (EditText) findViewById(R.id.guessedNumber);

    Double finalGuessedNumber = Double.parseDouble(guessedNumber.getText().toString());

        int[] givenListOfNumbers = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 ,14 ,15 ,16 ,17 ,18 ,19 ,20};

        int randomNumber = (int) (Math.random();

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
