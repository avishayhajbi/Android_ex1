package com.oa.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import 	android.content.Intent;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText editText;
    //Bundle bun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bun = savedInstanceState;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void randImage(View view){
        ImageView imageL = (ImageView) findViewById(R.id.imageViewLeft);
        ImageView imageR = (ImageView) findViewById(R.id.imageViewRight);

        // 4 mode
        if (imageL.getVisibility() == View.INVISIBLE && imageR.getVisibility() == View.INVISIBLE){         //none
            imageL.setVisibility(View.VISIBLE);
            return;
        }
        else if(imageL.getVisibility() == View.VISIBLE && imageR.getVisibility() == View.INVISIBLE){     //just left
            imageR.setVisibility(View.VISIBLE);
            return;
        }
        else if(imageL.getVisibility() == View.VISIBLE && imageR.getVisibility() == View.VISIBLE){     //everyone
            imageL.setVisibility(View.INVISIBLE);
            return;
        }
        else if(imageL.getVisibility() == View.INVISIBLE && imageR.getVisibility() == View.VISIBLE){     //just right
            imageR.setVisibility(View.INVISIBLE);
            return;
        }
    }

    public void showText (View view){

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        editText = (EditText) findViewById(R.id.tfName);
        String str = editText.getText().toString();
        intent.putExtra("name",str);
        editText.setText("");
        //onCreate( bun);
        startActivity(intent);

    }


    
}
