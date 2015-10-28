package com.example.ealezel.fourscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    public void GoToSecondScreen(View view)
    {
        Intent goToSecondIntent = new Intent(this, SecondScreen.class);
        startActivity(goToSecondIntent);
    }
}
