package com.example.user.hansamustada_1202144142_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        //Todo: Bikin Toast Pas Masuk Dine In
        Toast.makeText(getApplicationContext(),"Dine In",Toast.LENGTH_LONG).show();
    }

    //Todo: Bikin intent pas mencet tombol pesan
    public void takePesan(View view) {
            Intent intentpesan = new Intent(DineIn.this, DaftarMenu.class);
            startActivity(intentpesan);
    }
}
