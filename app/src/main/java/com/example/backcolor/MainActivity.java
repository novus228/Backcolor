package com.example.backcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    RadioGroup rgb;
    ConstraintLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b);
        rgb=findViewById(R.id.rg);
        l1=findViewById(R.id.lay);
        b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                int id = rgb.getCheckedRadioButtonId();
                if(id==-1)//When no selection is made the app shouldn't crash that is why we use this if
                {
                    Toast.makeText(MainActivity.this,"Nothing Selected!!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    RadioButton r1=findViewById(id);
                    if(r1.getText().toString().equals("Red"))
                    {
                        l1.setBackgroundColor(Color.RED);
                    }
                    else if(r1.getText().toString().equals("Blue"))
                    {
                        l1.setBackgroundColor(Color.BLUE);
                    }
                    else if(r1.getText().toString().equals("Green"))
                    {
                        l1.setBackgroundColor(Color.GREEN);
                    }
                }

            }
        });
    }
}