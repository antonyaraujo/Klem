package com.apps.antony.klem;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Numbers2 extends AppCompatActivity {

    private int opcao, contador = 0;
    private Button btResponder;
    private ImageView selecao;

    @Override
    public void onBackPressed() {
        // método responsável por vetar a volta
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);


        // Invoca método que verifica a resposta
        btResponder = findViewById(R.id.responderbt);
        btResponder.setOnClickListener(verificarResposta);

        // Autoplay pergunta
        MediaPlayer opc = MediaPlayer.create(Numbers2.this, R.raw.numero_seven);
        opc.start();
    }


    // Excuta áudio da pergunta ao clicar no botão da pergunta
    public void Pergunta(View v) {
        MediaPlayer opc = MediaPlayer.create(Numbers2.this, R.raw.numero_seven);
        opc.start();
    }

    // Define ações da Opção 1
    public void Opcao1(View v) {
        MediaPlayer opc = MediaPlayer.create(Numbers2.this, R.raw.numero_um);
        opc.start();

        opcao = 1;
        btResponder.setEnabled(true);

        if (contador == 1) {
            selecao.setVisibility(View.INVISIBLE);
        }

        selecao = findViewById(R.id.Sopcao1);
        selecao.setVisibility(View.VISIBLE);
        contador = 1;


    }

    // Define ações da Opção 2
    public void Opcao2(View v) {
        MediaPlayer opc = MediaPlayer.create(Numbers2.this, R.raw.numero_dois);
        opc.start();

        opcao = 2;
        btResponder.setEnabled(true);


        if (contador == 1) {
            selecao.setVisibility(View.INVISIBLE);
        }

        selecao = findViewById(R.id.Sopcao2);
        selecao.setVisibility(View.VISIBLE);
        contador = 1;

    }

    // Define ações da Opção 3
    public void Opcao3(View v) {
        MediaPlayer opc = MediaPlayer.create(Numbers2.this, R.raw.numero_dez);
        opc.start();

        opcao = 3;
        btResponder.setEnabled(true);


        if (contador == 1) {
            selecao.setVisibility(View.INVISIBLE);
        }

        selecao = findViewById(R.id.Sopcao3);
        selecao.setVisibility(View.VISIBLE);
        contador = 1;


    }

    // Define ações da Opção 4
    public void Opcao4(View v) {
        MediaPlayer opc = MediaPlayer.create(Numbers2.this, R.raw.numero_sete);
        opc.start();

        opcao = 4;
        btResponder.setEnabled(true);


        if (contador == 1) {
            selecao.setVisibility(View.INVISIBLE);
        }

        selecao = findViewById(R.id.Sopcao4);
        selecao.setVisibility(View.VISIBLE);
        contador = 1;


    }

    // Ação botão de resposta
    View.OnClickListener verificarResposta = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (opcao == 4) {
                Intent intent = new Intent(Numbers2.this, activity_correto.class);
                intent.putExtra("tipo", "Numero");
                intent.putExtra("posicao", 2);
                startActivity(intent);
                finish();
            } else {
                Intent intent = new Intent(Numbers2.this, activity_errado.class);
                intent.putExtra("tipo", "Numero");
                intent.putExtra("posicao", 2);
                startActivity(intent);
                finish();
            }
        }
    };
}