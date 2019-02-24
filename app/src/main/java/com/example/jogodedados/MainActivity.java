package com.example.jogodedados;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {

    ImageView primeiroDado;
    ImageView segundoDado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primeiroDado = findViewById(R.id.dado_1);
        segundoDado = findViewById(R.id.dado_2);
    }

    public void jogarDado1(View view) {
        ImageView img1 = (ImageView)findViewById(R.id.dado_1);
        ImageView img2 = (ImageView)findViewById(R.id.dado_2);
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        dado1.JogarDado();
        dado2.JogarDado();

        if (dado1.getNumero() == 1) img1.setImageResource(R.drawable.dice1);
        if (dado1.getNumero() == 2) img1.setImageResource(R.drawable.dice2);
        if (dado1.getNumero() == 3) img1.setImageResource(R.drawable.dice3);
        if (dado1.getNumero() == 4) img1.setImageResource(R.drawable.dice4);
        if (dado1.getNumero() == 5) img1.setImageResource(R.drawable.dice5);
        if (dado1.getNumero() == 6) img1.setImageResource(R.drawable.dice6);

        if (dado2.getNumero() == 1) img2.setImageResource(R.drawable.dice1);
        if (dado2.getNumero() == 2) img2.setImageResource(R.drawable.dice2);
        if (dado2.getNumero() == 3) img2.setImageResource(R.drawable.dice3);
        if (dado2.getNumero() == 4) img2.setImageResource(R.drawable.dice4);
        if (dado2.getNumero() == 5) img2.setImageResource(R.drawable.dice5);
        if (dado2.getNumero() == 6) img2.setImageResource(R.drawable.dice6);

        if (dado1.getNumero() > dado2.getNumero()) {
            Toast.makeText(this,"Jogador 1 venceu!",1). show();
        } else {
            Toast.makeText(this,"Jogador 2 venceu!",1). show();
        }
    }
}
