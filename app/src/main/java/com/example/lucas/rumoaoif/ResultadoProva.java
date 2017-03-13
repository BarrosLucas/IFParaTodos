package com.example.lucas.rumoaoif;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;

public class ResultadoProva extends Activity {
    TextView temp,not,result,materias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_prova);

        temp = (TextView) findViewById(R.id.temp);
        not = (TextView) findViewById(R.id.not);
        result = (TextView) findViewById(R.id.result);
        materias = (TextView) findViewById(R.id.materias);
        Intent i = getIntent();
        long tempo = i.getLongExtra("tempo", 0);
        tempo*=-1;
        long horas = tempo/(60*60*1000);
        long minutos = (tempo%(60*60*1000))/(60*1000);
        long segundos = ((tempo%(60*60*1000))%(60*1000))/1000;
        CharSequence parte1,parte2,parte3;
        if (horas < 10){
            parte1="0"+horas;
        }else{
            parte1=""+horas;
        }
        if (minutos < 10){
            parte2="0"+minutos;
        }else{
            parte2=""+minutos;
        }
        if (segundos < 10){
            parte3="0"+segundos;
        }else{
            parte3=""+segundos;
        }

        CharSequence s = ""+MainActivity.nota;
        CharSequence s2 = parte1+":"+parte2+":"+parte3;
        CharSequence mater = "Português: "+MainActivity.portugues+"\nAtualidades: "+MainActivity.atualidades+"\nMatemática: "+MainActivity.matematica;

        temp.setText(s2);
        not.setText(s);
        materias.setText(mater);
        if(MainActivity.nota > MainActivity.notaMin){
            result.setText("Classificado");
        }
    }
    public void inicio(View v){
        finish();
    }
}
