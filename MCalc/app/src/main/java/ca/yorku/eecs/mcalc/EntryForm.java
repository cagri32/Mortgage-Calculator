package ca.yorku.eecs.mcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }

    private void setContentsOfTextView (int id, String newContents)
    {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    public void buttonClicked(View v){
        EditText amortizationView = (EditText) findViewById(R.id.inputAmortization);
        String amortization = amortizationView.getText().toString();

        EditText interestView = (EditText) findViewById(R.id.inputInterest);
        String interest = interestView.getText().toString();

        EditText principleView = (EditText) findViewById(R.id.inputPrinciple);
        String principle = principleView.getText().toString();



        MortgageModel newModel = new MortgageModel(principle, amortization, interest);
        String myModel = newModel.computePayment();
        setContentsOfTextView(R.id.labelResult, myModel.toString());


    }

    public void buttonOutstanding(View v){
        EditText amortizationView = (EditText) findViewById(R.id.inputAmortization);
        String amortization = amortizationView.getText().toString();

        EditText interestView = (EditText) findViewById(R.id.inputInterest);
        String interest = interestView.getText().toString();

        EditText principleView = (EditText) findViewById(R.id.inputPrinciple);
        String principle = principleView.getText().toString();

        MortgageModel newModel = new MortgageModel(principle, amortization, interest);
        String myModel = newModel.outstandingAfter(60);
        setContentsOfTextView(R.id.labelOutstanding, myModel.toString());
    }
}
