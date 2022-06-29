package com.example.udacity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int scorea = 0, scoreb = 0, na = 0, nb = 0;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random myRandom = new Random();
        textview1 = findViewById(R.id.textView2);
        textview2 = findViewById(R.id.textView4);
        textview3 = findViewById(R.id.textView7);
        textview4 = findViewById(R.id.textView8);

        button1 = findViewById(R.id.button2);
        button2 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button4);
        button4 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = myRandom.nextInt(100);
                textview1.setText("" + x);
                scorea = scorea + x;
                na = na + 1;
                textview3.setText("" + scorea);
                if (na - nb == 2) {

                    Toast.makeText(MainActivity.this, "score deducted and attempt canceled right fingers chance skipped", Toast.LENGTH_SHORT).show();
                    na = na - 1;
                    scorea = scorea - x;
                    textview3.setText("" + scorea);

                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = myRandom.nextInt(100);
                textview2.setText("" + x);
                scoreb = scoreb + x;
                nb = nb + 1;
                textview4.setText("" + scoreb);
                if (nb - na == 1) {

                    Toast.makeText(MainActivity.this, "score deducted and attempt canceled as left fingers chance skipped", Toast.LENGTH_SHORT).show();
                    nb = nb - 1;
                    scoreb = scoreb - x;
                    textview4.setText("" + scoreb);

                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (na != nb) {
                    Toast.makeText(MainActivity.this, "left winger is winner! right finger forgot to attempt", Toast.LENGTH_LONG).show();

                } else {
                    if (scorea == scoreb)
                        Toast.makeText(MainActivity.this, "it is a tie", Toast.LENGTH_SHORT).show();
                    else if (scorea > scoreb)
                        Toast.makeText(MainActivity.this, "left finger is winner", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this, "right finger is winner", Toast.LENGTH_SHORT).show();

                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = myRandom.nextInt(100);
                textview1.setText("00");
                textview2.setText("00");
                textview3.setText("00");
                textview4.setText("00");
                scoreb = 0;
                scorea = 0;
                na = 0;
                nb = 0;


            }
        });
    }
}
