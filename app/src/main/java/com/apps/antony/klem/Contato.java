package com.apps.antony.klem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Contato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        TextView fontes = findViewById(R.id.arteDev);
        fontes.setMovementMethod(LinkMovementMethod.getInstance());

        TextView emails = findViewById(R.id.email);
        emails.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
