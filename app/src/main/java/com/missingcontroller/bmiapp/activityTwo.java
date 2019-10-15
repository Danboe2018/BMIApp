package com.missingcontroller.bmiapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

    }

    public void calcBMI(View view){

        double height = 0;
        double weight = 0;
        double bmi = 0;
        String msg = "";

        EditText et1 = findViewById(R.id.editText1);
        EditText et2 = findViewById(R.id.editText2);

        Button b1 = findViewById(R.id.button2);

        TextView tv1 = findViewById(R.id.newView1);
        TextView tv2 = findViewById(R.id.newView2);

        weight = Double.parseDouble(et1.getText().toString());
        height = Double.parseDouble(et2.getText().toString());

        bmi = height * height;
        bmi = weight / bmi;

        tv1.setText(String.valueOf(bmi));

        if(bmi < 18.5) {
            msg = "Underweight";
        } else if (bmi > 18.5 && bmi < 25){
            msg = "Normal";
        } else if (bmi > 25){
            msg = "Overweight";
        }

        tv2.setText(msg);
    }

}
