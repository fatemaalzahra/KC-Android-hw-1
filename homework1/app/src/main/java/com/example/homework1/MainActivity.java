package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



                EditText x = findViewById(R.id.na1);
                EditText q = findViewById(R.id.na2);
                EditText z = findViewById(R.id.na3);
                EditText P = findViewById(R.id.na4);
                TextView e = findViewById(R.id.tev1);
                TextView r = findViewById(R.id.tev2);
                Button o = findViewById(R.id.bu1);
                Button t = findViewById(R.id.bu2);

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x.setText("");
                q.setText("");
                z.setText("");
                P.setText("");
            }
        });
                o.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View  view){
                        int num1 = Integer.parseInt(x.getText().toString());
                        int num2 = Integer.parseInt(q.getText().toString());
                        int num3 = Integer.parseInt(z.getText().toString());
                        int num4 = Integer.parseInt(P.getText().toString());

                        int result = num1 + num2 + num3 + num4;

                        r.setText(String.valueOf(result));

                    }});




                }
            }
