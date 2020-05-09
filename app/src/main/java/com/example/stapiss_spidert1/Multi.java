package com.example.stapiss_spidert1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Multi extends AppCompatActivity {
Button d;
EditText no,n1,n2;
    public static final String EXTRA_P="com.example.STAPISS.SpiderT1.EXTRA_P";
    public static final String EXTRA_P1="com.example.STAPISS.SpiderT1.EXTRA_P1";
    public static final String EXTRA_P2="com.example.STAPISS.SpiderT1.EXTRA_P2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);

        no=(EditText)findViewById(R.id.no);
        n1=(EditText)findViewById(R.id.name1);
        n2=(EditText)findViewById(R.id.name2);
        d=(Button)findViewById(R.id.done);





        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (no.getText().toString().matches("")) {
                    Toast.makeText(Multi.this, "You did not enter a number", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (no.getText().toString().matches("0")) {
                    Toast.makeText(Multi.this, "Enter a natural number", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (n1.getText().toString().matches("")|n2.getText().toString().matches("")) {
                    Toast.makeText(Multi.this, "Enter a name", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    int i=Integer.parseInt(no.getText().toString());
                    String s1=n1.getText().toString();
                    String s2=n2.getText().toString();
                    Intent intent = new Intent(Multi.this, Game.class);
                    intent.putExtra(EXTRA_P, i);
                    intent.putExtra(EXTRA_P1, s1);
                    intent.putExtra(EXTRA_P2, s2);
                    startActivity(intent);

                }
            }
        });






    }
}
