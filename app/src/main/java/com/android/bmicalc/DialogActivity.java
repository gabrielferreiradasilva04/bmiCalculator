package com.android.bmicalc;

import android.app.Dialog;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.android.bmicalc.R;
import com.android.bmicalc.entity.ClassWeight;
import com.android.bmicalc.entity.Person;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.List;

public class DialogActivity extends DialogFragment {

    TextView titleText;
    TextView possibleRisksText;
    TextView warningsText;
    TextView bmiText;
    TextView nameText;
    String warnings;
    String resultTitle;
    String possibleRisks;
    Double bmi;
    String nameString;

    public DialogActivity(Person person) {
        this.resultTitle = person.getClassWeight().getYourClassWeight();
        this.warnings = person.getClassWeight().getWarnings();
        this.possibleRisks = person.getClassWeight().getPossibleRisks();
        this.bmi = person.getBmi();
        this.nameString = person.getName();
    }



    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_dialog, container);
    }

    @Override
    public void onStart() {
        super.onStart();
        this.warningsText = this.getDialog().findViewById(R.id.warningsText);
        this.titleText = this.getDialog().findViewById(R.id.resultTitle);
        this.possibleRisksText = this.getDialog().findViewById(R.id.possibleRisks);
        this.bmiText = this.getDialog().findViewById(R.id.bmiText);
        this.nameText = this.getDialog().findViewById(R.id.nameText);

        this.titleText.setText(this.resultTitle);
        this.warningsText.setText(this.warnings);
        this.possibleRisksText.setText(this.possibleRisks);
        this.bmiText.setText("IMC: "+new DecimalFormat(".##").format(this.bmi));
        this.nameText.setText("Olá "+ this.nameString);
    }
}
