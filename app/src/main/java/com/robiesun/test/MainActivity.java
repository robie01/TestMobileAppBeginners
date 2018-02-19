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

        // adding the position of the button
        RelativeLayout.LayoutParams buttonDetails= new RelativeLayout.LayoutParams(
               RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT

        );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        // button
        Button redButton = new Button(this);
        redButton.setText("Log in");
        redButton.setBackgroundColor(Color.GREEN);

        // add widget to layout(button is new child of layout)
        layout.addView(redButton, buttonDetails);
        // set this activities content/display to this view
        setContentView(layout);

    }
}
