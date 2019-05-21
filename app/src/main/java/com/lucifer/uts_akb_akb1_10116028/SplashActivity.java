package com.lucifer.uts_akb_akb1_10116028;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/* NIM : 10116028
   Nama : Fajar Nugraha
   Kelas : AKB-1
   Tanggal Pengerjaan : 21 Mei 2019
 */


public class SplashActivity extends AppCompatActivity {

    private ImageView logosplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logosplash = (ImageView) findViewById(R.id.splash_logo);
        Animation logoanim = AnimationUtils.loadAnimation(this, R.anim.splash_transition);
        logosplash.startAnimation(logoanim);

        final Intent i = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {

                    startActivity(i);
                    finish();

                }
            }
        };

        timer.start();
    }
}
