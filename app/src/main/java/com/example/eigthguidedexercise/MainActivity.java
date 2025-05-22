package com.example.eigthguidedexercise;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spnrNames;
    TextView tvResult;

    String[] names = {"Name Here", "Papsi", "Pol", "Che", "Tin", "Renz", "Lou", "Chan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnrNames = findViewById(R.id.spnrNamesGE8);
        tvResult = findViewById(R.id.tvResultGE8);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, names);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnrNames.setAdapter(adapter);

        spnrNames.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!names[position].equals("Name Here")) {
                    tvResult.setText("Name: " + names[position]);
                } else {
                    tvResult.setText("Name:");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                tvResult.setText("Name:");
            }
        });
    }
}
