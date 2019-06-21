package com.apps.antony.klem;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Variáveis
    private ImageView setaDireita;
    private ImageView setaEsquerda;
    private ImageView Menu;
    private int Contador=1;
    private int verificador;

    @Override
    public void onBackPressed() {
        // método responsável por vetar a volta
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        final AlertDialog alerta;
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Olá, amiguinho! Seja bem-vindo ao KLEM");
        b.setMessage("Para avançar nesse jogo você precisa escolher as figuras correspondente às palavras perguntadas. Divirta-se!!");
        b.setPositiveButton("COMEÇAR", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        alerta = b.create();

        if (getIntent().getExtras() != null) verificador = getIntent().getExtras().getInt("cont");

        if (verificador == 1) {
            alerta.show();
            MediaPlayer opc = MediaPlayer.create(MainActivity.this, R.raw.boasvindas);
            opc.start();
            }

        // Ação do btContato
        ImageView btContato = findViewById(R.id.contato);
        btContato.setOnClickListener(ContatoAcao);

        // Ação do btFechar
        ImageView btFechar = findViewById(R.id.fechar);
        btFechar.setOnClickListener(Fechar);

        setaDireita = findViewById(R.id.setaDireita);
        setaDireita.setOnClickListener(AlterarImagemDireita);

        setaEsquerda = findViewById(R.id.setaEsquerda);
        setaEsquerda.setOnClickListener(AlterarImagemEsquerda);

        Menu = findViewById(R.id.menu);
        Menu.setOnClickListener(AcessActivity);

    }

    // Configuração botão Direito
    View.OnClickListener AlterarImagemDireita = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {



            switch (Contador) {
                case 1:
                    Menu.setImageResource(R.drawable.menu_opcao2);
                    Contador++;
                    break;

                case 2:
                    Menu.setImageResource(R.drawable.menu_opcao3);
                    Contador++;
                    break;

                case 3:
                    Menu.setImageResource(R.drawable.menu_opcao4);
                    Contador++;
                    break;

                case 4:
                    Menu.setImageResource(R.drawable.menu_opcao5);
                    Contador++;
                    break;

                case 5:
                    Menu.setImageResource(R.drawable.menu_opcao6);
                    Contador++;
                    break;

                case 6:
                    Menu.setImageResource(R.drawable.menu_opcao1);
                    Contador=1;
                    break;
            }


        }
    };

    // Configuração botão Esquerdo
    View.OnClickListener AlterarImagemEsquerda = new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {

            switch (Contador) {
                case 1:
                    Menu.setImageResource(R.drawable.menu_opcao6);
                    Contador=6;
                    break;

                case 2:
                    Menu.setImageResource(R.drawable.menu_opcao1);
                    Contador--;
                    break;

                case 3:
                    Menu.setImageResource(R.drawable.menu_opcao2);
                    Contador--;
                    break;

                case 4:
                    Menu.setImageResource(R.drawable.menu_opcao3);
                    Contador--;
                    break;

                case 5:
                    Menu.setImageResource(R.drawable.menu_opcao4);
                    Contador--;
                    break;

                case 6:
                    Menu.setImageResource(R.drawable.menu_opcao5);
                    Contador--;
                    break;
            }
        }

    };

    // Configuração do Menu
    View.OnClickListener AcessActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (Contador)
            {
                case 1:
                    Intent intentAnimals = new Intent(MainActivity.this, Animals1.class);
                    startActivity(intentAnimals);
                    finish();
                    break;

                case 2:
                    Intent intentFruits = new Intent(MainActivity.this, Fruits1.class);
                    startActivity(intentFruits);
                    finish();
                    break;

                case 3:
                    Intent intentNumbers = new Intent(MainActivity.this, Numbers1.class);
                    startActivity(intentNumbers);
                    finish();
                    break;

                case 4:
                    String texto = "Seção família em construção - Indisponível";
                    int duracao = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(getApplicationContext(), texto,duracao);
                    toast.show();
                    break;

                case 5:
                    Intent intentToys = new Intent(MainActivity.this, Toys1.class);
                    startActivity(intentToys);
                    finish();
                    break;

                case 6:

                    Intent intentClothes = new Intent(MainActivity.this, Clothes1.class);
                    startActivity(intentClothes);
                    finish();
                    break;

                default:
                    String texto1 = "Se você está vendo essa mensagem, não deveria vê-la, algum " +
                            "erro bem grave existe nesse aplicativo (1923)";
                    int duracao1 = Toast.LENGTH_SHORT;

                    Toast toast1 = Toast.makeText(getApplicationContext(), texto1,duracao1);
                    toast1.show();
                    break;
            }

        }
    };


    // Ação botão contato
    View.OnClickListener ContatoAcao = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentContato = new Intent(MainActivity.this, Contato.class);
            startActivity(intentContato);
        }
    };

    // Ação botão fechar
    View.OnClickListener Fechar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentFechar = new Intent(MainActivity.this, activity_splash_screen.class);
            intentFechar.putExtra("acao", "fechar");
            startActivity(intentFechar);
            finish();
        }
    };




    /*@Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    } */


}

