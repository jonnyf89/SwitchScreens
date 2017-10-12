package com.ditkevinstreet.switchscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 09/10/2017.
 */

public class SecondScreen extends AppCompatActivity {
    private static final String TAG = "SecondScreen";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen_layout);
        Log.d(TAG, "onCreate: Starting.");

        Button btnNavToFirst = (Button) findViewById(R.id.btnGoToFirstScreen);

        btnNavToFirst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked btnNavToFirst.");
                Intent intent = new Intent(SecondScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
