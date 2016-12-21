package com.example.luizfilipeferreira.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Part5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part5);
        final MediaPlayer weare= MediaPlayer.create(Part5.this,R.raw.weare);


        Button butt9 = (Button) findViewById(R.id.Button10);
        Button butt10 = (Button) findViewById(R.id.Button11);
        Button butt11 = (Button) findViewById(R.id.Button12);
        Button butt12 = (Button) findViewById(R.id.Button13);

        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    weare.start();
            }
        });
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10=new Intent(Part5.this,Part3.class);
                startActivity(int10);
            }
        });
        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11=new Intent(Part5.this,Part3.class);
                startActivity(int11);
            }
        });
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12=new Intent(Part5.this,Part3.class);
                startActivity(int12);
            }
        });
    }
}
