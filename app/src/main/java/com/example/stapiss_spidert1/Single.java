package com.example.stapiss_spidert1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Single extends AppCompatActivity {
EditText no1;
Button d;
    public static final String EXTRA_P="com.example.STAPISS.SpiderT1.EXTRA_P";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);



        no1=(EditText)findViewById(R.id.no1);
        d=(Button)findViewById(R.id.done1);


        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (no1.getText().toString().matches("")) {
                    Toast.makeText(Single.this, "You did not enter a number", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (no1.getText().toString().matches("0")) {
                    Toast.makeText(Single.this, "Enter a natural number", Toast.LENGTH_SHORT).show();
                    return;
                }

                else {
                    int i=Integer.parseInt(no1.getText().toString());

                    Intent intent = new Intent(Single.this, Games.class);
                    intent.putExtra(EXTRA_P, i);

                    startActivity(intent);

                }
            }
        });






    }
}
