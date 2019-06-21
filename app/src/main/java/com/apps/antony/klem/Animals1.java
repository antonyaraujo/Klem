package com.apps.antony.klem;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Animals1 extends AppCompatActivity {


    private int opcao, contador=0;
    private Button btResponder;
    private ImageView selecao;

    @Override
    public void onBackPressed() {
        // método responsável por vetar a volta
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals1);

        //
        btResponder = findViewById(R.id.responderbt);
        btResponder.setOnClickListener(verificarResposta);

        // Autoplay pergunta
        MediaPlayer pergunta = MediaPlayer.create(Animals1.this, R.raw.animal_cachorro);
        pergunta.start();

        //textView = (TextView) findViewById(R.id.textinho);

        // Sem o if ocorre erro
        /*
        if (getIntent().getExtras() != null){
            textView.setText(getIntent().getExtras().getString("teste")); // Recebe e define valor passado
        }*/
    }


    // Excuta áudio da pergunta ao clicar no botão da pergunta
    public void Pergunta (View v){
       MediaPlayer pergunta = MediaPlayer.create(Animals1.this, R.raw.animal_cachorro);
       pergunta.start();
    }

    // Define ações do botão Urso
    public void Opcao1 (View v)
    {
        MediaPlayer opc = MediaPlayer.create(Animals1.this, R.raw.animal_bear);
        opc.start();
        opcao=1;
      btResponder.setEnabled(true);

        if (contador == 1)
        {
            selecao.setVisibility(View.INVISIBLE);
        }

      selecao = findViewById(R.id.Sopcao1);
      selecao.setVisibility(View.VISIBLE);
        contador=1;


    }

    // Define ações do botão  Gato
    public void Opcao2 (View v)
    {
        MediaPlayer opc = MediaPlayer.create(Animals1.this, R.raw.animal_cat);
        opc.start();
        opcao=2;
        btResponder.setEnabled(true);


        if (contador == 1)
        {
            selecao.setVisibility(View.INVISIBLE);
        }

        selecao = findViewById(R.id.Sopcao2);
        selecao.setVisibility(View.VISIBLE);
        contador = 1;

    }

    // Define ações do botão Macaco
    public void Opcao3 (View v)
    {
        MediaPlayer opc = MediaPlayer.create(Animals1.this, R.raw.animal_monkey);
        opc.start();
        opcao=3;
        btResponder.setEnabled(true);


        if (contador == 1)
        {
            selecao.setVisibility(View.INVISIBLE);
        }

        selecao = findViewById(R.id.Sopcao3);
        selecao.setVisibility(View.VISIBLE);
        contador = 1;


    }

    // Define ações do botão Cachorro
    public void Opcao4 (View v)
    {
        MediaPlayer opc = MediaPlayer.create(Animals1.this, R.raw.animal_dog);
        opc.start();
        opcao=4;
    btResponder.setEnabled(true);


        if (contador == 1)
        {
            selecao.setVisibility(View.INVISIBLE);
        }

        selecao = findViewById(R.id.Sopcao4);
        selecao.setVisibility(View.VISIBLE);
        contador = 1;
    }

    // Ação botão de resposta
    View.OnClickListener verificarResposta = new View.OnClickListener()
            {
                @Override
                public void onClick (View v)
                {

                    if (opcao == 4) {
                        Intent intent = new Intent(Animals1.this, activity_correto.class);
                        intent.putExtra("tipo", "Animal");
                        intent.putExtra("posicao", 1);
                        startActivity(intent);
                        finish();
                    } else
                        {
                            Intent intent = new Intent(Animals1.this, activity_errado.class);
                            intent.putExtra("tipo", "Animal");
                            intent.putExtra("posicao", 1);
                            startActivity(intent);
                            finish();
                        }
                }
            };
}
