package com.example.user.hansamustada_1202144142_modul2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //Todo:  Bikin SplashScreen
        Thread threadSplash = new Thread(){
          public void run(){
              try{
                  sleep(3000);
              } catch (InterruptedException e){
                  e.printStackTrace();
              } finally {
                  startActivity(new Intent(Splash.this, MainActivity.class));
                  finish();
              }
          }
        };
        threadSplash.start();
    }
}
