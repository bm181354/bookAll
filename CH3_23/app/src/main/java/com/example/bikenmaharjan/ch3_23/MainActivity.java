package com.example.bikenmaharjan.ch3_23;

import android.graphics.Color;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;
    private int counter = 0;
    int w;
    int h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        buildGuiByCode();

    }


    private void buildGuiByCode() {


        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);

        w = size.x;
        h = size.y;

        GridLayout gl = new GridLayout(this);
        gl.setColumnCount(1);
        gl.setRowCount(2);
        defaultSet();
        gl.addView(btn,w,300);
        gl.addView(tv,w,size.y - 300);
        setContentView(gl);


        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                if(counter == 0){

                    tv.setBackgroundColor(Color.RED);
                    tv.setTextSize(40);
                    tv.setText("RED");
                    tv.setPadding(MainActivity.this.w/2 -140,0,0,0);
                    counter++;


                }
                else if(counter == 1){

                    tv.setBackgroundColor(Color.GREEN);
                    tv.setTextSize(40);
                    tv.setText("GREEN");
                    tv.setPadding(MainActivity.this.w/2 -140,0,0,0);
                    counter++;

                }
                else{

                    tv.setBackgroundColor(Color.YELLOW);
                    tv.setText("YELLOW");
                    tv.setTextSize(40);
                    tv.setPadding(MainActivity.this.w/2 -140,0,0,0);
                    counter = 0;

                }


            }
        });



    }

    public void defaultSet(){

        btn = new Button(this);
        btn.setText("Press Me");
        btn.setTextSize(20);

        tv = new TextView(this);
        tv.setText("RED");
        tv.setBackgroundColor(Color.RED);
        tv.setPadding((MainActivity.this.w/2) - 140,0,0,0);
        tv.setTextSize(40);
        counter = 1;

    }




}
