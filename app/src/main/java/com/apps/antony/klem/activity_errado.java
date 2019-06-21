package com.apps.antony.klem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class activity_errado extends AppCompatActivity {

    private ImageView imagemExibicao;
    private String tipo;
    private int posicao;

    @Override
    public void onBackPressed() {
        // método responsável por vetar a volta
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_errado);

        // Ação do btContato
        ImageView btContato = findViewById(R.id.contato);
        btContato.setOnClickListener(ContatoAcao);

        // Ação do btFechar
        ImageView btFechar = findViewById(R.id.fechar);
        btFechar.setOnClickListener(Fechar);

        // Cria botões
        Button Continuar = findViewById(R.id.ContinuarBt);
        Button tryagain = findViewById(R.id.tryagainBt);

        // Define ação dos botões
        Continuar.setOnClickListener(selecionarContinuacao);
        tryagain.setOnClickListener(tentarNovamente);

        // Define imagemExibicao em um variável  via ID
        imagemExibicao = findViewById(R.id.imagemExibicao);

        // Pega valor para saber de qual categoria a resposta correta veio
        if (getIntent().getExtras() != null) {
            tipo = getIntent().getExtras().getString("tipo");
            posicao = getIntent().getExtras().getInt("posicao"); // Recebe posicao da pergunta certa
        }

        // Define o gif que irá aparecer com base na categoria da pergunta/resposta
        if (tipo.equals("Animal")) {
            Glide.with(this).load(R.drawable.errado_animal).into(imagemExibicao);
            imagemExibicao.setVisibility(View.VISIBLE);
        }

        if (tipo.equals("Brinquedo")) {
            Glide.with(this).load(R.drawable.errado_brinquedo).into(imagemExibicao);
            imagemExibicao.setVisibility(View.VISIBLE);
        }

        if (tipo.equals("Fruta")) {
            Glide.with(this).load(R.drawable.errado_fruta).into(imagemExibicao);
            imagemExibicao.setVisibility(View.VISIBLE);
        }

        if (tipo.equals("Numero")) {
            Glide.with(this).load(R.drawable.errado_numero).into(imagemExibicao);
            imagemExibicao.setVisibility(View.VISIBLE);
        }

        if (tipo.equals("Roupa")) {
            Glide.with(this).load(R.drawable.errado_roupa).into(imagemExibicao);
            imagemExibicao.setVisibility(View.VISIBLE);
        }
    }

    // Ação botão contato
    View.OnClickListener ContatoAcao = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentContato = new Intent(activity_errado.this, Contato.class);
            startActivity(intentContato);
        }
    };

    // Ação botão fechar
    View.OnClickListener Fechar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentFechar = new Intent(activity_errado.this, MainActivity.class);
            startActivity(intentFechar);
            finish();
        }
    };

    View.OnClickListener selecionarContinuacao = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent voltarMenu = new Intent(activity_errado.this, MainActivity.class);

            if (tipo.equals("Animal")) {
                switch(posicao)
                {
                    case 1:
                        Intent intent1 = new Intent(activity_errado.this, Animals2.class);
                        startActivity(intent1);
                        finish();
                        break;

                    case 2:
                        Intent intent2 = new Intent(activity_errado.this, Animals3.class);
                        startActivity(intent2);
                        finish();
                        break;

                    case 3:
                        Intent intent3 = new Intent(activity_errado.this, Animals4.class);
                        startActivity(intent3);
                        finish();
                        break;

                    case 4:
                        Intent intent4 = new Intent(activity_errado.this, Animals5.class);
                        startActivity(intent4);
                        finish();
                        break;

                    case 5:
                        startActivity(voltarMenu);
                        finish();
                        break;
                }

            }

            if (tipo.equals("Brinquedo"))
            {
                switch(posicao)
                {
                    case 1:
                        Intent intentT1 = new Intent(activity_errado.this, Toys2.class);
                        startActivity(intentT1);
                        finish();
                        break;

                    case 2:
                        Intent intentT2 = new Intent(activity_errado.this, Toys3.class);
                        startActivity(intentT2);
                        finish();
                        break;

                    case 3:
                        Intent intentT3 = new Intent(activity_errado.this, Toys4.class);
                        startActivity(intentT3);
                        finish();
                        break;

                    case 4:
                        Intent intentT4 = new Intent(activity_errado.this, Toys5.class);
                        startActivity(intentT4);
                        finish();
                        break;

                    case 5:
                        startActivity(voltarMenu);
                        finish();
                        break;

                }
            }

            if (tipo.equals("Fruta"))
            {
                switch (posicao)
                {
                    case 1:
                        Intent intentF1 = new Intent(activity_errado.this, Fruits2.class);
                        startActivity(intentF1);
                        finish();
                        break;

                    case 2:
                        Intent intentF2 = new Intent(activity_errado.this, Fruits3.class);
                        startActivity(intentF2);
                        finish();
                        break;

                    case 3:
                        Intent intentF3 = new Intent(activity_errado.this, Fruits4.class);
                        startActivity(intentF3);
                        finish();
                        break;

                    case 4:
                        Intent intentF4 = new Intent(activity_errado.this, Fruits5.class);
                        startActivity(intentF4);
                        finish();
                        break;

                    case 5:
                        startActivity(voltarMenu);
                        finish();
                        break;

                }
            }

            if (tipo.equals("Numero"))
            {
                switch(posicao)
                {
                    case 1:
                        Intent intentN1 = new Intent(activity_errado.this, Numbers2.class);
                        startActivity(intentN1);
                        finish();
                        break;

                    case 2:
                        Intent intentN2 = new Intent(activity_errado.this, Numbers3.class);
                        startActivity(intentN2);
                        finish();
                        break;

                    case 3:
                        Intent intentN3 = new Intent(activity_errado.this, Numbers4.class);
                        startActivity(intentN3);
                        finish();
                        break;

                    case 4:
                        Intent intentN4 = new Intent(activity_errado.this, Numbers5.class);
                        startActivity(intentN4);
                        finish();
                        break;

                    case 5:
                        startActivity(voltarMenu);
                        finish();
                        break;
                }
            }

            if (tipo.equals("Roupa"))
            {
                switch(posicao)
                {
                    case 1:
                        Intent intentR1 = new Intent(activity_errado.this, Clothes2.class);
                        startActivity(intentR1);
                        finish();
                        break;

                    case 2:
                        Intent intentR2 = new Intent(activity_errado.this, Clothes3.class);
                        startActivity(intentR2);
                        finish();
                        break;

                    case 3:
                        Intent intentR3= new Intent(activity_errado.this, Clothes4.class);
                        startActivity(intentR3);
                        finish();
                        break;

                    case 4:
                        Intent intentR4 = new Intent(activity_errado.this, Clothes5.class);
                        startActivity(intentR4);
                        finish();
                        break;

                    case 5:
                        startActivity(voltarMenu);
                        finish();
                        break;
                }
            }

        }
    };

    View.OnClickListener tentarNovamente = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (tipo.equals("Animal"))
            {
                switch(posicao)
                {
                    case 1:
                        Intent intentVolta1 = new Intent(activity_errado.this, Animals1.class);
                        startActivity(intentVolta1);
                        finish();
                        break;

                    case 2:
                        Intent intentVolta2 = new Intent(activity_errado.this, Animals2.class);
                        startActivity(intentVolta2);
                        finish();
                        break;

                    case 3:
                        Intent intentVolta3 = new Intent(activity_errado.this, Animals3.class);
                        startActivity(intentVolta3);
                        finish();
                        break;

                    case 4:
                            Intent intentVolta4 = new Intent(activity_errado.this, Animals4.class);
                            startActivity(intentVolta4);
                            finish();
                        break;

                    case 5:
                        Intent intentVolta5 = new Intent(activity_errado.this, Animals5.class);
                        startActivity(intentVolta5);
                        finish();
                        break;
                }


            }

            if (tipo.equals("Brinquedo"))
            {
                switch(posicao)
                {
                    case 1:
                        Intent intentT1 = new Intent(activity_errado.this, Toys1.class);
                        startActivity(intentT1);
                        finish();
                        break;

                    case 2:
                        Intent intentT2 = new Intent(activity_errado.this, Toys2.class);
                        startActivity(intentT2);
                        finish();
                        break;

                    case 3:
                        Intent intentT3 = new Intent(activity_errado.this, Toys3.class);
                        startActivity(intentT3);
                        finish();
                        break;

                    case 4:
                        Intent intentT4 = new Intent(activity_errado.this, Toys4.class);
                        startActivity(intentT4);
                        finish();
                        break;

                    case 5:
                        Intent intentT5 = new Intent(activity_errado.this, Toys5.class);
                        startActivity(intentT5);
                        finish();
                        break;

                }
            }

            if (tipo.equals("Fruta"))
            {
                switch (posicao)
                {
                    case 1:
                        Intent intentF1 = new Intent(activity_errado.this, Fruits1.class);
                        startActivity(intentF1);
                        finish();
                        break;

                    case 2:
                        Intent intentF2 = new Intent(activity_errado.this, Fruits2.class);
                        startActivity(intentF2);
                        finish();
                        break;

                    case 3:
                        Intent intentF3 = new Intent(activity_errado.this, Fruits3.class);
                        startActivity(intentF3);
                        finish();
                        break;

                    case 4:
                        Intent intentF4 = new Intent(activity_errado.this, Fruits4.class);
                        startActivity(intentF4);
                        finish();
                        break;

                    case 5:
                        Intent intentF5 = new Intent(activity_errado.this, Fruits5.class);
                        startActivity(intentF5);
                        finish();
                        break;

                }
            }

            if (tipo.equals("Numero"))
            {
                switch(posicao)
                {
                    case 1:
                        Intent intentN1 = new Intent(activity_errado.this, Numbers1.class);
                        startActivity(intentN1);
                        finish();
                        break;

                    case 2:
                        Intent intentN2 = new Intent(activity_errado.this, Numbers2.class);
                        startActivity(intentN2);
                        finish();
                        break;

                    case 3:
                        Intent intentN3 = new Intent(activity_errado.this, Numbers3.class);
                        startActivity(intentN3);
                        finish();
                        break;

                    case 4:
                        Intent intentN4 = new Intent(activity_errado.this, Numbers4.class);
                        startActivity(intentN4);
                        finish();
                        break;

                    case 5:
                        Intent intentN5 = new Intent(activity_errado.this, Numbers5.class);
                        startActivity(intentN5);
                        finish();
                        break;
                }
            }

            if (tipo.equals("Roupa"))
            {
                switch(posicao)
                {
                    case 1:
                        Intent intentR1 = new Intent(activity_errado.this, Clothes1.class);
                        startActivity(intentR1);
                        finish();
                        break;

                    case 2:
                        Intent intentR2 = new Intent(activity_errado.this, Clothes2.class);
                        startActivity(intentR2);
                        finish();
                        break;

                    case 3:
                        Intent intentR3= new Intent(activity_errado.this, Clothes3.class);
                        startActivity(intentR3);
                        finish();
                        break;

                    case 4:
                        Intent intentR4 = new Intent(activity_errado.this, Clothes4.class);
                        startActivity(intentR4);
                        finish();
                        break;

                    case 5:
                        Intent intentR5 = new Intent(activity_errado.this, Clothes5.class);
                        startActivity(intentR5);
                        finish();
                        break;
                }
            }

        }
    };
}
