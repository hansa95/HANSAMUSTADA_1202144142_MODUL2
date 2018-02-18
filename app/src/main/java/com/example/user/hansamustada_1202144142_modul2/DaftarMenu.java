package com.example.user.hansamustada_1202144142_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DaftarMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);


    }

    public void detail(View view) {
        Intent intentdetail = new Intent(DaftarMenu.this, DetailMenu.class);
        startActivities(intentdetail);
    }
}
