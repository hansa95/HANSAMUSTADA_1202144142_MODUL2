package com.example.user.hansamustada_1202144142_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Todo: Bikin Toast Pas Masuk MainAcivity
        Toast.makeText(getApplicationContext(),"Hansa Mustada_1202144142",Toast.LENGTH_LONG).show();
    }

    public void dineIn(View view) {
        Intent dineIntent = new Intent(MainActivity.this, DineIn.class);
        startActivity(dineIntent);
    }

    public void takeAway(View view) {
        Intent takeIntent = new Intent(MainActivity.this, TakeAway.class);
        startActivity(takeIntent);
    }

}
