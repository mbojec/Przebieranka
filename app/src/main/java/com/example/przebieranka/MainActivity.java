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

        capView = (ImageView) findViewById(R.id.capID);
        jacketView = (ImageView) findViewById(R.id.jacketID);
        glovesView = (ImageView) findViewById(R.id.gloveID);
        shoesView = (ImageView) findViewById(R.id.shoesID);

        cR = (Button) findViewById(R.id.capRedButton);
        cR.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capView.setImageResource(R.drawable.cczerwona);
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
        jR = (Button) findViewById(R.id.jacketRedButton);
        jR.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jacketView.setImageResource(R.drawable.pczerwony);
            }
        }));
        jG = (Button) findViewById(R.id.jacketGreenButton);
        jG.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jacketView.setImageResource(R.drawable.pzielony);
            }
        }));
        jB = (Button) findViewById(R.id.jacketBlueButton);
        jB.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jacketView.setImageResource(R.drawable.pniebieski);
            }
        }));
        gR = (Button) findViewById(R.id.glovesRedButton);
        gR.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glovesView.setImageResource(R.drawable.rczerwona);
            }
        }));
        gG = (Button) findViewById(R.id.glovesGreenButton);
        gG.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glovesView.setImageResource(R.drawable.rzielona);
            }
        }));
        gB = (Button) findViewById(R.id.glovesBlueButton);
        gB.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glovesView.setImageResource(R.drawable.rniebieska);
            }
        }));
        sR = (Button) findViewById(R.id.shoesRedButton);
        sR.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shoesView.setImageResource(R.drawable.btczerwone);
            }
        }));
        sG = (Button) findViewById(R.id.shoesGreenButton);
        sG.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shoesView.setImageResource(R.drawable.btzielone);
            }
        }));
        sB = (Button) findViewById(R.id.shoesBlueButton);
        sB.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shoesView.setImageResource(R.drawable.btniebieskie);
            }
        }));



    }
}
