package com.example.user.hansamustada_1202144142_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
        //Todo: Bikin Toast Pas Masuk Take Away
        Toast.makeText(getApplicationContext(),"Take Away",Toast.LENGTH_LONG).show();
    }

    //Todo: Bikin intent pas mencet tombol pesan
    public void takePesan(View view) {
        Intent intentpesan = new Intent(TakeAway.this, DaftarMenu.class);
        startActivity(intentpesan);
    }
}
