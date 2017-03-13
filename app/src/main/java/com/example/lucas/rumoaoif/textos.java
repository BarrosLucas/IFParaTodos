package com.example.lucas.rumoaoif;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.senab.photoview.PhotoViewAttacher;
//import


public class textos extends Activity{
    ImageView imagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PhotoViewAttacher mAttacher;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textos);
        int[][] textos = {
                //2013
                {
                        R.drawable.texto1,
                        R.drawable.texto1,
                        R.drawable.texto1,
                        R.drawable.texto1,
                        R.drawable.texto1,
                        R.drawable.texto1,
                        R.drawable.texto2,
                        R.drawable.texto2,
                        R.drawable.texto2,
                        R.drawable.texto3,
                        R.drawable.texto3,
                        R.drawable.texto3,
                        R.drawable.texto4,
                        R.drawable.texto4,
                        R.drawable.texto4,
                        R.drawable.texto4,
                        R.drawable.texto5,
                        R.drawable.texto5,
                        -1,
                        -1,
                        R.drawable.texto6,
                        R.drawable.texto7,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1
                },
                {
                        R.drawable._2014_texto1,
                        R.drawable._2014_texto1,
                        R.drawable._2014_texto1,
                        R.drawable._2014_texto1,
                        R.drawable._2014_texto1,
                        R.drawable._2014_texto2,
                        R.drawable._2014_texto2,
                        R.drawable._2014_texto2,
                        R.drawable._2014_texto2,
                        R.drawable._2014_texto2,
                        R.drawable._2014_texto3,
                        R.drawable._2014_texto3,
                        R.drawable._2014_texto3,
                        R.drawable._2014_texto3,
                        R.drawable._2014_texto3,
                        R.drawable._2014_texto4,
                        R.drawable._2014_texto4,
                        R.drawable._2014_texto4,
                        R.drawable._2014_texto5,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1
                },
                //2015
                {
                        R.drawable._2015_texto1,
                        R.drawable._2015_texto1,
                        R.drawable._2015_texto1,
                        R.drawable._2015_texto2,
                        R.drawable._2015_texto2,
                        R.drawable._2015_texto3,
                        R.drawable._2015_texto3,
                        R.drawable._2015_texto4,
                        R.drawable._2015_texto4,
                        R.drawable._2015_texto5,
                        R.drawable._2015_texto5,
                        R.drawable._2015_texto5,
                        R.drawable._2015_texto5,
                        R.drawable._2015_texto6,
                        R.drawable._2015_texto6,
                        R.drawable._2015_texto6,
                        R.drawable._2015_texto7,
                        R.drawable._2015_texto7,
                        R.drawable._2015_texto8,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1
                },
                //2016
                {
                        R.drawable._2016_texto1,
                        R.drawable._2016_texto1,
                        R.drawable._2016_texto1,
                        R.drawable._2016_texto2,
                        R.drawable._2016_texto2,
                        R.drawable._2016_texto2,
                        R.drawable._2016_texto3,
                        R.drawable._2016_texto3,
                        R.drawable._2016_texto4,
                        R.drawable._2016_texto5,
                        R.drawable._2016_texto5,
                        R.drawable._2016_texto6,
                        R.drawable._2016_texto7,
                        R.drawable._2016_texto7,
                        -1,
                        R.drawable._2016_texto8,
                        R.drawable._2016_texto8,
                        R.drawable._2016_texto8,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1,
                        -1
                }
        };
        imagem = (ImageView) findViewById(R.id.imagem);
        imagem.setImageResource(textos[Questao.ano][MainActivity.questaoAtual]);
        PhotoViewAttacher photoViewAttacher = new PhotoViewAttacher(imagem);
        photoViewAttacher.update();
        TextView desc = (TextView) findViewById(R.id.descricao);
        if (Questao.ano == 0) {
            if (MainActivity.questaoAtual >= 0 && MainActivity.questaoAtual <= 5) {
                desc.setText("Texto para as questões de 1 a 6");
            } else if (MainActivity.questaoAtual > 5 && MainActivity.questaoAtual <= 8) {
                desc.setText("Texto para as questões de 7 a 9");
            } else if (MainActivity.questaoAtual > 8 && MainActivity.questaoAtual <= 11) {
                desc.setText("Texto para as questões de 10 a 12");
            } else if (MainActivity.questaoAtual > 11 && MainActivity.questaoAtual <= 15) {
                desc.setText("Texto para as questões de 13 a 16");
            } else if (MainActivity.questaoAtual > 15 && MainActivity.questaoAtual <= 17) {
                desc.setText("Texto para as questões de 17 a 18");
            } else if (MainActivity.questaoAtual == 20) {
                desc.setText("Texto para a questão 21");
            } else if (MainActivity.questaoAtual == 21) {
                desc.setText("Texto para a questão 22");
            }
        }else if(Questao.ano == 1){
            if (MainActivity.questaoAtual >= 0 && MainActivity.questaoAtual <= 4) {
                desc.setText("Texto para as questões de 1 a 5");
            } else if (MainActivity.questaoAtual > 4 && MainActivity.questaoAtual <= 9) {
                desc.setText("Texto para as questões de 5 a 10");
            } else if (MainActivity.questaoAtual > 9 && MainActivity.questaoAtual <= 14) {
                desc.setText("Texto para as questões de 10 a 15");
            } else if (MainActivity.questaoAtual > 14 && MainActivity.questaoAtual <= 17) {
                desc.setText("Texto para as questões de 15 a 18");
            } else if (MainActivity.questaoAtual == 18) {
                desc.setText("Texto para a questão 19");
            }
        }else if(Questao.ano == 2){
            if (MainActivity.questaoAtual >= 0 && MainActivity.questaoAtual <= 2) {
                desc.setText("Texto para as questões de 1 a 3");
            } else if (MainActivity.questaoAtual > 2 && MainActivity.questaoAtual <= 4) {
                desc.setText("Texto para as questões 4 e 5");
            } else if (MainActivity.questaoAtual > 4 && MainActivity.questaoAtual <= 6) {
                desc.setText("Texto para as questões 6 e 7");
            } else if (MainActivity.questaoAtual > 6 && MainActivity.questaoAtual <= 8) {
                desc.setText("Texto para as questões 8 e 9");
            } else if (MainActivity.questaoAtual > 8 && MainActivity.questaoAtual <= 12) {
                desc.setText("Texto para as questões de 10 a 13");
            } else if (MainActivity.questaoAtual > 12 && MainActivity.questaoAtual <= 15) {
                desc.setText("Texto para as questões de 14 a 16");
            } else if (MainActivity.questaoAtual > 15 && MainActivity.questaoAtual <= 17) {
                desc.setText("Texto para as questões 17 e 18");
            } else if (MainActivity.questaoAtual == 18) {
                desc.setText("Texto para a questão 19");
            }
        }else if(Questao.ano == 3){
            if (MainActivity.questaoAtual >= 0 && MainActivity.questaoAtual <= 2) {
                desc.setText("Texto para as questões de 1 a 3");
            } else if (MainActivity.questaoAtual > 2 && MainActivity.questaoAtual <= 5) {
                desc.setText("Texto para as questões de 4 a 6");
            } else if (MainActivity.questaoAtual > 5 && MainActivity.questaoAtual <= 7) {
                desc.setText("Texto para as questões 7 e 8");
            } else if (MainActivity.questaoAtual == 8) {
                desc.setText("Texto para a questão 9");
            } else if (MainActivity.questaoAtual > 8 && MainActivity.questaoAtual <= 10) {
                desc.setText("Texto para as questões 10 e 11");
            } else if (MainActivity.questaoAtual == 11) {
                desc.setText("Texto para a questão 12");
            } else if (MainActivity.questaoAtual > 11 && MainActivity.questaoAtual <= 13) {
                desc.setText("Texto para as questões 13 e 14");
            } else if (MainActivity.questaoAtual > 14 && MainActivity.questaoAtual <= 17) {
                desc.setText("Texto para as questões de 16 a 18");
            }
        }

    }


    public void voltar(View v){
        finish();
    }

}
