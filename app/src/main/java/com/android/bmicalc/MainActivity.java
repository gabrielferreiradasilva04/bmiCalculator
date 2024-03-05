package com.android.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.bmicalc.entity.ClassWeight;
import com.android.bmicalc.entity.Person;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buttonCalc;
    EditText textName; //nome
    EditText textWeight; // peso
    EditText textHeight; // altura
    double dWeight, dHeight;
    String nameString = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        this.buttonCalc = findViewById(R.id.buttonCalc);
        this.textWeight = findViewById(R.id.editTextWeight);
        this.textHeight = findViewById(R.id.editTextHeight);
        this.textName = findViewById(R.id.editTextName);


        this.buttonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doMagic();
            }
        });

    }

    private void doMagic() {
        if (!this.textName.getText().toString().isEmpty() && !this.textHeight.getText().toString().isEmpty() && !this.textWeight.getText().toString().isEmpty()) {
            nameString = textName.getText().toString();
            dWeight = Double.parseDouble(textWeight.getText().toString());
            dHeight = Double.parseDouble(textHeight.getText().toString());

            Person person = new Person(nameString, dHeight, dWeight);
            person.bmiCalculation();

            ClassWeight classWeight = new ClassWeight();
            classWeight.determineClassWeight(person.getBmi());

            person.setClassWeight(classWeight);

            DialogActivity dialog = new DialogActivity(person);
            dialog.show(getSupportFragmentManager(), dialog.getTag());
        }

    }
}