package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void guessInProgress(View view){

    EditText guessedNumber = (EditText) findViewById(R.id.guessedNumber);

    Double finalGuessedNumber = Double.parseDouble(guessedNumber.getText().toString());

        int randomNumber = (int) (Math.random()+1)*2;

        if (finalGuessedNumber > randomNumber){
            System.out.println()
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
