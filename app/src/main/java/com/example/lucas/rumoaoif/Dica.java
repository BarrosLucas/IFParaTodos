package com.example.lucas.rumoaoif;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Dica extends Activity {
    int numero = 0;
    int[] tDicas = {R.string.tdica1,R.string.tdica2,R.string.tdica3,R.string.tdica4,R.string.tdica5,R.string.tdica6};
    int[] dicas = {R.string.dica1,R.string.dica2,R.string.dica3,R.string.dica4,R.string.dica5,R.string.dica6};
    int[] imgs = {R.drawable.dica1,R.drawable.dica2,R.drawable.dica3,R.drawable.dica4,R.drawable.dica5,R.drawable.dica6};
    TextView titulo,conteudo;
    Button antes, depois;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dica);

        titulo = (TextView) findViewById(R.id.titulo);
        conteudo = (TextView) findViewById(R.id.conteudo);

        antes = (Button) findViewById(R.id.antes);
        depois = (Button) findViewById(R.id.depois);

        img = (ImageView) findViewById(R.id.img);

        if (numero == 0){
            antes.setVisibility(View.INVISIBLE);
        }else if(numero == 5){
            depois.setVisibility(View.INVISIBLE);
        }else{
            antes.setVisibility(View.VISIBLE);
            depois.setVisibility(View.VISIBLE);
        }
    }
    public void proximo(View v){
        numero ++;
        if (numero == 5){
            depois.setVisibility(View.INVISIBLE);
        }
        titulo.setText(tDicas[numero]);
        conteudo.setText(dicas[numero]);
        img.setImageResource(imgs[numero]);
        antes.setVisibility(View.VISIBLE);
    }
    public void miolo(View v){
        finish();
    }
    public void anterior(View v){
        numero --;
        if (numero == 0){
            antes.setVisibility(View.INVISIBLE);
        }
        titulo.setText(tDicas[numero]);
        conteudo.setText(dicas[numero]);
        img.setImageResource(imgs[numero]);
        depois.setVisibility(View.VISIBLE);
    }
}
