package com.robiesun.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layout
        RelativeLayout layout = new RelativeLayout(this);
        layout.setBackgroundColor(Color.YELLOW);


        // button
        Button redButton = new Button(this);
        redButton.setText("Click me");
        redButton.setBackgroundColor(Color.RED);

        // add widget to layout(button is new child of layout)
        layout.addView(redButton);
        // set this activities content/display to this view
        setContentView(layout);

    }
}
