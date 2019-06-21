package com.apps.antony.klem;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_splash_screen extends AppCompatActivity {

    String acao="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        int count=0;

        if (getIntent().getExtras() != null) {
            acao = getIntent().getExtras().getString("acao");
        }

            if (acao.equals("fechar")) {
                finish();
                System.exit(0);
            }

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mostrarMenu();
                    }
                }, 2000);
                count = 1;

    }

    private void mostrarMenu()
    {
        Intent intent = new Intent(activity_splash_screen.this, MainActivity.class);
        intent.putExtra("cont", 1);
        startActivity (intent);
        finish();
    }

}
