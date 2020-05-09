package com.example.stapiss_spidert1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game extends AppCompatActivity {
String st1,st2;
int p;
TextView c1,c2,t;
int a1;
TextView ch1,ch2,ch3,ch4;
public int a=0,b=0,x=0,y=0;
public int i=0;
    private static final String TAG="MyActivity";
    public static final String EXTRA_P3="com.example.STAPISS.SpiderT1.EXTRA_P3";
    public static final String EXTRA_P4="com.example.STAPISS.SpiderT1.EXTRA_P3";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();                                                            //
        p = intent.getIntExtra(Multi.EXTRA_P, 0);
        st1 = intent.getStringExtra(Multi.EXTRA_P1);
        st2 = intent.getStringExtra(Multi.EXTRA_P2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);



        c1=(TextView)findViewById(R.id.s1);
        c2=(TextView)findViewById(R.id.s2);
        t=(TextView)findViewById(R.id.t);
        ch1=(TextView) findViewById(R.id.ch1);
        ch2=(TextView) findViewById(R.id.ch2);
        ch3=(TextView) findViewById(R.id.ch3);
        ch4=(TextView) findViewById(R.id.ch4);




        call();
    }

private void call(){
        if(i>=p){
            Intent intent= new Intent(Game.this,Score.class);
            if(a>b){
                intent.putExtra(EXTRA_P3, a);
                intent.putExtra(EXTRA_P4, st1);
            }
            else if(b>a){

                Log.w(TAG,"LOOP 1234");
                intent.putExtra(EXTRA_P3, b);
                intent.putExtra(EXTRA_P3, st2);
            }
            else{
                intent.putExtra(EXTRA_P3, 0);
                intent.putExtra(EXTRA_P3, st2);
            }
            startActivity(intent);

        }

        else {

            ch4.setText("ROUND : "+(i+1));
            if (x - y == 1 | x - y == -2) {
                a += 3;
            } else if ((x == y) && x != 0) {
                a++;
                b++;
            } else if (y - x == 1 | y - x == -2) {
                b += 3;
            }

            c1.setText(st1 + "'s score: " + a);
            c2.setText(st2 + "'s score: " + b);

            t.setText(st1 + "'s turn");

            function();

        }
    }


private void function(){
        x=0;
        y=0;
        a1=0;


        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a1==0){
                x=1;
                a1++;
                t.setText(st2+"'s turn");

                }
                else{
                    y=1;
                    i++;
                    call();
                }

            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a1==0){
                    x=2;
                    a1++;
                    t.setText(st2+"'s turn");

                }
                else{
                    y=2;
                    i++;
                    call();
                }
            }
        });
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a1==0){
                    x=3;
                    a1++;
                    t.setText(st2+"'s turn");

                }
                else{
                    y=3;
                    i++;
                    call();
                }
            }
        });










    }






}
