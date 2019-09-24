package com.lecslt.basics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PercentageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);

        Button calculateBtn = findViewById(R.id.percentage_calc);
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView resultp = findViewById(R.id.resultp_text);
                EditText percentage = findViewById(R.id.percentage_text);
                EditText number = findViewById(R.id.number_text);

                Float numberFloat = Float.parseFloat(number.getText().toString());
                Float percentageFloat = Float.parseFloat(percentage.getText().toString());
                Float decimalPercentage = percentageFloat / 100;
                Float endValue = numberFloat * decimalPercentage;
                resultp.setText(Float.toString(endValue));
            }
        });

    }

}
