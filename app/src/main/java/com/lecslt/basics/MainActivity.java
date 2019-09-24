package com.lecslt.basics;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = findViewById(R.id.button);
        Button percentageCalc = findViewById(R.id.percentage_calc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textValue = findViewById(R.id.text_value); // on associe lobjet de la vue a une variable pour le stocker en memoire.
                TextView resultValue = findViewById(R.id.result_text);

                String stringValue = textValue.getText().toString(); // on caste la valeur de notre variable textValue en String
                int startValue = Integer.parseInt(stringValue); // on caste la valeur de notre variable String en int pour effectuer nos operations.
                int endValue = Multiplicateur.doubleValue(startValue); // on applique la methode doubleValue de la classe Multiplicateur pour avoir le double de notre valeur de depart quand on appui sur le bouton.
                resultValue.setText(Integer.toString(endValue)); // on caste la variable endValue(retour en arriere) en String pour pouvoir l'afficher.


                Snackbar.make(view, "Changed value " + startValue + " to " + endValue , Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        percentageCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PercentageActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //no inspection Simplifiable IfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
