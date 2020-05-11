package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import static java.lang.Math.random;

public class MainActivity extends AppCompatActivity {

    public void guessInProgress(View view){

    EditText guessedNumber = findViewById(R.id.guessedNumber);

    Double finalGuessedNumber = Double.parseDouble(guessedNumber.getText().toString());

        double randomNumber = (random()*(20-1)+1)+1;

        int roundRandomNumber = (int) Math.round(randomNumber);

        if (finalGuessedNumber > roundRandomNumber){
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
