package com.mydomain.brooksrobison.datastorage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer count;

    public String COUNT_FILE = "CountFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences settings = getSharedPreferences(COUNT_FILE, 0);
        count = settings.getInt("count", 0);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Integer.toString(count));


    }

    public void onAdvanceClick(View view) {
        count++;
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Integer.toString(count));
    }

    public void onSaveCountClick(View view) {
        SharedPreferences settings = getSharedPreferences(COUNT_FILE, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("count", count);

        editor.commit();
    }
}
