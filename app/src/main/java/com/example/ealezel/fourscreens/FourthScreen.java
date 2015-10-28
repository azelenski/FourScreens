package com.example.ealezel.fourscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FourthScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_screen);
    }

    public void GoToFirstScreen(View view)
    {
        Intent goToFirstIntent = new Intent(this, FirstScreen.class);
        startActivity(goToFirstIntent);
    }
}
