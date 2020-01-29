package com.example.kathe.hellokatherine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // grab the text that the user inputted
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                // put the text into our text view once the 'change text' button is clicked
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Katherine!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // reset the text color back to black
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));
                // reset the background color back to purple
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.purple));
                // reset the text back to "Hello from Katherine!"
                ((TextView) findViewById(R.id.textView)).setText("Hello from Katherine!");
            }
        });


    }
}
