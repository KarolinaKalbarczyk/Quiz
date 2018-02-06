package com.example.android.quiz;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score;
    EditText name;
    String user;
    RadioGroup radioGroup, q1_g, q3_g, q4_g, q5_g, q7_g, q8_g;
    CheckBox q2a1, q2a2, q2a3, q2a4, q6a1, q6a2, q6a3, q6a4;
    RadioButton q1a2, q3a4, q4a2, q5a3, q7a1, q8a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        name = (EditText) findViewById(R.id.name);
    }


    public void submit(View view) {
        score = 0;
        user = name.getText().toString();
        checkQuestionOne();
        checkQuestionTwo();
        checkQuestionThree();
        checkQuestionFour();
        checkQuestionFive();
        checkQuestionSix();
        checkQuestionSeven();
        checkQuestionEight();
        clearAnswer();
        checkCorrect();
        Toast.makeText(this, "Congratulation " + user + " !!" + "\nYour result is: " + score + "\n Check correct answear!", Toast.LENGTH_LONG).show();
    }

    public void clearAnswer(){


        q2a1 = (CheckBox) findViewById(R.id.q2a1);
        q2a2 = (CheckBox) findViewById(R.id.q2a2);
        q2a3 = (CheckBox) findViewById(R.id.q2a3);
        q2a4 = (CheckBox) findViewById(R.id.q2a4);
        q6a1 = (CheckBox) findViewById(R.id.q6a1);
        q6a2 = (CheckBox) findViewById(R.id.q6a2);
        q6a2 = (CheckBox) findViewById(R.id.q6a3);
        q6a4 = (CheckBox) findViewById(R.id.q6a4);
        q1_g = (RadioGroup) findViewById(R.id.q1_g);
        q3_g = (RadioGroup) findViewById(R.id.q3_g);
        q4_g = (RadioGroup) findViewById(R.id.q4_g);
        q5_g = (RadioGroup) findViewById(R.id.q5_g);
        q7_g = (RadioGroup) findViewById(R.id.q7_g);
        q8_g = (RadioGroup) findViewById(R.id.q8_g);

       name.getText().clear();
       q1_g.clearCheck();
       q3_g.clearCheck();
       q4_g.clearCheck();
       q5_g.clearCheck();
       q7_g.clearCheck();
       q8_g.clearCheck();

       q2a1.setChecked(false);
       q2a2.setChecked(false);
       q2a3.setChecked(false);
       q2a4.setChecked(false);
       q6a1.setChecked(false);
       q6a2.setChecked(false);
       q6a3.setChecked(false);
       q6a4.setChecked(false);
    }

    public void checkCorrect(){

        name = (EditText) findViewById(R.id.name);
        q1a2 = (RadioButton) findViewById(R.id.q1a2);
        q2a1 = (CheckBox) findViewById(R.id.q2a1);
        q2a2 = (CheckBox) findViewById(R.id.q2a2);
        q2a4 = (CheckBox) findViewById(R.id.q2a4);
        q3a4 = (RadioButton) findViewById(R.id.q3a4);
        q4a2 = (RadioButton) findViewById(R.id.q4a2);
        q5a3 = (RadioButton) findViewById(R.id.q5a3);
        q6a1 = (CheckBox) findViewById(R.id.q6a1);
        q6a2 = (CheckBox) findViewById(R.id.q6a2);
        q6a3 = (CheckBox) findViewById(R.id.q6a3);
        q6a4 = (CheckBox) findViewById(R.id.q6a4);
        q7a1 = (RadioButton) findViewById(R.id.q7a1);
        q8a3 = (RadioButton) findViewById(R.id.q8a3);

        q1a2.setChecked(true);
        q2a1.setChecked(true);
        q2a2.setChecked(true);
        q2a4.setChecked(true);
        q3a4.setChecked(true);
        q4a2.setChecked(true);
        q5a3.setChecked(true);
        q6a1.setChecked(true);
        q6a2.setChecked(true);
        q6a3.setChecked(true);
        q6a4.setChecked(true);
        q7a1.setChecked(true);
        q8a3.setChecked(true);
    }

    private void checkQuestionOne() {
        radioGroup = findViewById(R.id.q1_g);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();


        if (radioButtonId == R.id.q1a2)
            score++;
    }

    private void checkQuestionTwo() {
        q2a1 = findViewById(R.id.q2a1);
        q2a2 = findViewById(R.id.q2a2);
        q2a4 = findViewById(R.id.q2a4);

        if (q2a1.isChecked()) {
            score++;
        }
        if (q2a2.isChecked()) {
            score++;
        }
        if (q2a4.isChecked()) {
            score++;
        }
    }

    private void checkQuestionThree() {
        radioGroup = findViewById(R.id.q3_g);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId == R.id.q3a4)
            score++;
    }

    private void checkQuestionFour() {
        radioGroup = findViewById(R.id.q4_g);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId == R.id.q4a2)
            score++;
    }

    private void checkQuestionFive() {
        radioGroup = findViewById(R.id.q5_g);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId == R.id.q5a3)
            score++;
    }

    private void checkQuestionSix() {
        q6a1 = findViewById(R.id.q6a1);
        q6a2 = findViewById(R.id.q6a2);
        q6a3 = findViewById(R.id.q6a3);
        q6a4 = findViewById(R.id.q6a4);

        if (q6a1.isChecked()) {
            score++;
        }
        if (q6a2.isChecked()) {
            score++;
        }
        if (q6a3.isChecked()) {
            score++;
        }
        if (q6a4.isChecked()) {
            score++;
        }
    }

    private void checkQuestionSeven() {
        radioGroup = findViewById(R.id.q7_g);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId == R.id.q7a1)
            score++;
    }

    private void checkQuestionEight() {
        radioGroup = findViewById(R.id.q8_g);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId == R.id.q8a3)
            score++;
    }


}

