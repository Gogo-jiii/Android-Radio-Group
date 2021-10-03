package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioButtonA, radioButtonB, radioButtonChecked;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        radioButtonA = findViewById(R.id.radioButtonA);
        radioButtonB = findViewById(R.id.radioButtonB);

        radioButtonA.setOnClickListener(this);
        radioButtonB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int selectedID = radioGroup.getCheckedRadioButtonId();
        radioButtonChecked = findViewById(selectedID);

        Toast.makeText(MainActivity.this, radioButtonChecked.getText() + " checked.",
                Toast.LENGTH_LONG).show();
    }
}