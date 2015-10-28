package com.example.ealezel.fourscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ThirdScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
    }

    public void GoToFourthScreen(View view)
    {
        Intent goToFourthIntent = new Intent(this, FourthScreen.class);
        startActivity(goToFourthIntent);
    }
}
