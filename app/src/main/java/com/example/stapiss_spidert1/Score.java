package com.example.stapiss_spidert1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {
int p;
String s;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();                                                            //
        p = intent.getIntExtra(Game.EXTRA_P3, 120000);
        s = intent.getStringExtra(Game.EXTRA_P4);



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        t=(TextView)findViewById(R.id.t);



        if(p==0){
            t.setText("DRAW MATCH");
        }
        else{
            t.setText(s+" is the winner");
        }


    }
}
