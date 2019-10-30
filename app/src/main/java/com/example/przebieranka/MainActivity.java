package com.example.przebieranka;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView capView;
    private ImageView jacketView;
    private ImageView glovesView;
    private ImageView shoesView;
    //cap buttons
    private Button cR;
    private Button cG;
    private Button cB;
    //jacket buttons
    private Button jR;
    private Button jG;
    private Button jB;
    //gloves buttons
    private Button gR;
    private Button gG;
    private Button gB;
    //shoes buttons
    private Button sR;
    private Button sG;
    private Button sB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

        cR = (Button) findViewById(R.id.capRedButton);
        cR.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capView.setBackgroundResource(R.drawable.cczerwona);
            }
        }));

        cG = (Button) findViewById(R.id.capGreenButton);
        cG.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capView.setImageResource(R.drawable.czielona);
            }
        }));

        cB = (Button) findViewById(R.id.capBlueButton);
        cB.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capView.setImageResource(R.drawable.cniebieska);
            }
        }));


    }
}
