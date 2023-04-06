package com.hcdc.caralos.traveeel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    private ImageButton image1;
    private ImageButton image2;
    private ImageButton image3;
    private ImageButton image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    image1= findViewById(R.id.dc_imagebutonmati);
    image2= findViewById(R.id.dc_imagebuttonboracay);
    image3= findViewById(R.id.dc_imagebuttonpalawan);
    image4= findViewById(R.id.dc_imagebuttonsamal);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity2.this, Mati.class);
                startActivity(a);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity2.this, Boracay.class);
                startActivity(b);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity2.this, Palawan.class);
                startActivity(c);
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity2.this, Samal.class);
                startActivity(d);
            }
        });


    }
}