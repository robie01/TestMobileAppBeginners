package com.robiesun.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layout
        RelativeLayout layout = new RelativeLayout(this);
        layout.setBackgroundColor(Color.YELLOW);

        // button
        Button redButton = new Button(this);
        redButton.setText("Log in");
        redButton.setBackgroundColor(Color.GREEN);

        // Username input
        EditText username = new EditText(this);

        redButton.setId(1);
        username.setId(2);


        // making container for the button
        RelativeLayout.LayoutParams buttonDetails= new RelativeLayout.LayoutParams(
               RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT

        );

        RelativeLayout.LayoutParams usernameDetails= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT

        );

        //apply rules to position widgets
        usernameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,65);

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r = getResources();
        // convert DIP to PIXEL value
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                r.getDisplayMetrics()
                );

        username.setWidth(px);


        // add widget to layout(button is new child of layout)
        layout.addView(redButton, buttonDetails);
        layout.addView(username, usernameDetails);
        // set this activities content/display to this view
        setContentView(layout);

    }
}
