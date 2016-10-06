package com.example.andyb.testproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayMessageActivity extends AppCompatActivity {

    public final static String LOG_TAG = "DisplayMessageActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.v(LOG_TAG, "onstart");
    }
    @Override
    public void onResume() {
        super.onResume(); //Always call the super
        Log.i(LOG_TAG, "onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.e(LOG_TAG, "onResume");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.w(LOG_TAG, "onDestroy");
    }
}
