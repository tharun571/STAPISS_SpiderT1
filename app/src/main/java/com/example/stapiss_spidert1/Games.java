package com.example.stapiss_spidert1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Games extends AppCompatActivity {
int p;
    TextView c1,c2,t;
    int a1;
    TextView ch1,ch2,ch3,ch4;
    public int a=0,b=0,x=0,y=0;
    int a11=0,b11=0;
    public int i=0;
    int x1=0,y1=0,z1=0;
    public static final String EXTRA_P3="com.example.STAPISS.SpiderT1.EXTRA_P3";
    public static final String EXTRA_P4="com.example.STAPISS.SpiderT1.EXTRA_P3";
    private static int SPLASH=200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();                                                            //
        p = intent.getIntExtra(Single.EXTRA_P, 0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        c1=(TextView)findViewById(R.id.s11);
        c2=(TextView)findViewById(R.id.s21);
        t=(TextView)findViewById(R.id.t1);
        ch1=(TextView) findViewById(R.id.ch11);
        ch2=(TextView) findViewById(R.id.ch21);
        ch3=(TextView) findViewById(R.id.ch31);
        ch4=(TextView) findViewById(R.id.ch41);


        call();

    }


    private void call(){
        if(i>=p){
            Intent intent= new Intent(Games.this,Scores.class);
            if(a>b){
                intent.putExtra(EXTRA_P3, a);
                intent.putExtra(EXTRA_P4, "YOU");
            }
            else if(b>a){


                intent.putExtra(EXTRA_P3, b);
                intent.putExtra(EXTRA_P3, "COMPUTER");
            }
            else{
                intent.putExtra(EXTRA_P3, 0);
                intent.putExtra(EXTRA_P3, "LOL");
            }
            startActivity(intent);

        }

        else {
            a11=0;
            b11=0;

            ch4.setText("ROUND : "+(i+1));
            if (x - y == 1 | x - y == -2) {
                a += 3;a11++;
            } else if ((x == y) && x != 0) {
                a++;a11++;
                b++;b11++;
            } else if (y - x == 1 | y - x == -2) {
                b += 3;b11++;
            }

            if(a11>b11){
                if(x1>0){
                ch1.setBackgroundResource(R.drawable.buttonr);
                }
            if(y1>0){
                ch2.setBackgroundResource(R.drawable.buttonr);
                }
            if(z1>0){
                ch3.setBackgroundResource(R.drawable.buttonr);
                }
            }
            else if(a11<b11){
                if(x1>0){
                ch1.setBackgroundResource(R.drawable.buttonw);
                }
            if(y1>0){
                ch2.setBackgroundResource(R.drawable.buttonw);
                }
            if(z1>0){
                ch3.setBackgroundResource(R.drawable.buttonw);
                }
            }
            if(a11==b11){
                if(x1>0){
                ch1.setBackgroundResource(R.drawable.buttond);
                }
            if(y1>0){
                ch2.setBackgroundResource(R.drawable.buttond);
                }
            if(z1>0){
                ch3.setBackgroundResource(R.drawable.buttond);
                }
            }

            c1.setText("Your score: " + a);
            c2.setText("Computer score: " + b);

            t.setText("Your turn");

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(x1>0){
                        ch1.setBackgroundResource(R.drawable.button);
                    }
                    if(y1>0){
                        ch2.setBackgroundResource(R.drawable.button);
                    }
                    if(z1>0){
                        ch3.setBackgroundResource(R.drawable.button);
                    }

                    function();



                }
            },SPLASH);


        }
    }


    private void function(){
        x=0;
        y=0;
        a1=0;
        x1=0;
        y1=0;
        z1=0;


        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    x=1;

                final int ra = new Random().nextInt(3)+1;
                y=ra;
                i++;
                x1++;
                call();







            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    x=2;

                final int ra = new Random().nextInt(3)+1;
                y=ra;
                i++;
                y1++;
                call();




            }
        });
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    x=3;

                final int ra = new Random().nextInt(3)+1;
                y=ra;
                i++;
                z1++;
                call();




            }
        });




    }

}
