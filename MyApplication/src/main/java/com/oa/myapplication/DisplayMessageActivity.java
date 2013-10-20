package com.oa.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import 	android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message);




        Intent intent = getIntent();
        String message = intent.getStringExtra("name");

        if (message != null)
        {
            TextView text = (TextView) findViewById(R.id.newname);
            text.setText(message);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.display_message, menu);
        return true;
    }



}
