package com.example.budgetingapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculationsActivity extends Activity {

    @Override
    public void onCreate (Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculations);
        TextView totalCostET = (TextView) findViewById(R.id.totalCost);
        TextView myBudgetET = (TextView) findViewById(R.id.myBudget);

        Intent intent = getIntent();
        String report;
        report = intent.getStringExtra("myBudget");

        String totalCost;
        totalCost = intent.getStringExtra("totalCost");
        totalCostET.setText(totalCost);
        myBudgetET.setText(report);
    }
    public void goDataEntry(View view){
        finish();
        
    }


}
