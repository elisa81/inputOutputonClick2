package com.jmj.edu.inputoutputonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    String name, age, gender, job;
    TextView textViewResult;
    RadioButton radioButtonF, radioButtonM, radioButtonStudent, radioButtonEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        radioButtonM = (RadioButton) findViewById(R.id.radioButtonM);
        radioButtonF = (RadioButton) findViewById(R.id.radioButtonF);
        radioButtonStudent = (RadioButton) findViewById(R.id.radioButtonStudent);
        radioButtonEmployee = (RadioButton) findViewById(R.id.radioButtonEmployee);

        RadioGroup RadioGroupGender = (RadioGroup) findViewById(R.id.RadioGroupGender);
        RadioGroup RadioGroupJob = (RadioGroup) findViewById(R.id.RadioGroupJob);

        TextView textViewResult = (TextView)findViewById(R.id.textViewResult);

        name = ((EditText)findViewById(R.id.editTextName)).getText().toString();
        age = ((EditText)findViewById(R.id.editTextAge)).getText().toString();
        gender = ((RadioButton)findViewById(RadioGroupGender.getCheckedRadioButtonId())).getText().toString();
        job = ((RadioButton)findViewById(RadioGroupJob.getCheckedRadioButtonId())).getText().toString();

        textViewResult.setText("Name: " + name + " Age: " + age + " Gender: " + gender + " Occupation: " + job);
    }
}
