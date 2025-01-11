package com.example.daryushina;

import static java.lang.Math.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void calculateCircleProperties(View v) {

        EditText inputFieldS = findViewById(R.id.inputFieldS);

        String inputS = inputFieldS.getText().toString();



        double S = Double.parseDouble(inputS);
        double D= sqrt(4*S/PI);
        double L=PI*D;


        TextView resultField = findViewById(R.id.resultField);
        resultField.setText(String.format("D = %.2f\nL = %.2f", D, L));



    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
