package com.example.andyb.testproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.testProj.MESSAGE";

    private final static String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void sendMessage(View v) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
