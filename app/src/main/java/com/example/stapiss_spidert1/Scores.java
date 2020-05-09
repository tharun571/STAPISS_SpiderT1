package com.example.stapiss_spidert1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Scores extends AppCompatActivity {
int p;
String s;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();                                                            //
        p = intent.getIntExtra(Games.EXTRA_P3, 120000);
        s = intent.getStringExtra(Games.EXTRA_P4);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        t=(TextView)findViewById(R.id.t1);


        if(p==0){
            t.setText("DRAW MATCH");
        }
        else{
            t.setText(s+" are the winner");
        }

    }
}
