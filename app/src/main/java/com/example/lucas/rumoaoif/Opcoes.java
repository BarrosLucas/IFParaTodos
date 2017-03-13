package com.example.lucas.rumoaoif;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Opcoes extends Activity {
    int ano;
    int campus;
    int tipo;

    private String[][][] cursu = {
            //2013
            {
                    {"Eletronica Matutino", "Eletrônica Vespertino","Eletrotécnica Matutino","Eletrotécnica Vespertino", "Mecânica Matutino", "Mecânica Vespertino", "Química Matutino", "Química Vespertino", "Edificações Matutino", "Edificações Vespertino", "Estradas Matutino", "Informática Vespertino"},//Maceió
                    {"Eletrotécnica Matutino","Eletrotécnica Vespertino","Edificações Matutino","Edificações Vespertino","Informática Matutino","Informática Vespertino"},//Palmeira
                    {"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {"Eletroeletrônica Matutino","Eletroeletrônica Vespertino","Informática Matutino","Informática Vespertino"},//Arapiraca
                    {"Açúcar e Álcool Matutino","Açúcar e Álcool Vespertino","Meio Ambiente Matutino","Meio Ambiente Vespertino"},//Penedo
                    {"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Murici
                    {"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"}//Marechal
            },
            //2014
            {
                    {"Eletronica Matutino","Eletrônica Vespertino","Eletrotécnica Matutino","Eletrotécnica Vespertino", "Mecânica Matutino","Mecânica Vespertino","Química Matutino","Química Vespertino","Edificações Matutino","Edificações Vespertino","Estradas Vespertino","Informática Matutino"},//Maceió
                    {"Eletrotécnica Matutino","Eletrotécnica Vespertino","Edificações Matutino","Edificações Vespertino","Informática Matutino","Informática Vespertino"},//Palmeira
                    {"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {"Eletroeletrônica Vespertino","Informática Vespertino"},//Arapiraca
                    {"Açúcar e Álcool Matutino","Açúcar e Álcool Vespertino","Meio Ambiente Matutino","Meio Ambiente Vespertino"},//Penedo
                    {"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {"Agroecologia Matutino","Agroindústria Vespertino"},//Murici
                    {"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"}//Marechal
            },
            //2015
            {
                    {"Eletronica Matutino","Eletrônica Vespertino","Eletrotécnica Matutino","Eletrotécnica Vespertino", "Mecânica Matutino","Mecânica Vespertino","Química Matutino","Química Vespertino","Edificações Matutino","Edificações Vespertino","Estradas Matutino","Informática Matutino","Informática Vespertino"},//Maceió
                    {"Eletrotécnica Matutino","Eletrotécnica Vespertino","Edificações Matutino","Edificações Vespertino","Informática Matutino","Informática Vespertino"},//Palmeira
                    {"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {"Eletroeletrônica Matutino","Eletroeletrônica Vespertino","Informática Matutino","Informática Vespertino"},//Arapiraca
                    {"Açúcar e Álcool Matutino","Açúcar e Álcool Vespertino","Meio Ambiente Matutino","Meio Ambiente Vespertino"},//Penedo
                    {"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Murici
                    {"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"},//Marechal
                    {"Agroindústria Matutino","Agroindústria Vespertino"},//Batalha
                    {"Edificações Matutino","Edificações Vespertino"}//Coruripe
            },
            //2016
            {
                    {"Eletronica Matutino","Eletrônica Vespertino","Eletrotécnica Matutino","Eletrotécnica Vespertino", "Mecânica Matutino","Mecânica Vespertino","Química Matutino","Química Vespertino","Edificações Matutino","Edificações Vespertino","Estradas Vespertino","Informática Matutino","Informática Vespertino"},//Maceió
                    {"Eletrotécnica Matutino","Eletrotécnica Vespertino","Edificações Matutino","Edificações Vespertino","Informática Matutino","Informática Vespertino"},//Palmeira
                    {"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {"Eletroeletrônica Matutino","Eletroeletrônica Vespertino","Informática Matutino","Informática Vespertino"},//Arapiraca
                    {"Açúcar e Álcool Matutino","Açúcar e Álcool Vespertino","Meio Ambiente Matutino","Meio Ambiente Vespertino"},//Penedo
                    {"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {"Agroecologia Vespertino","Agroindústria Vespertino"},//Murici
                    {"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"},//Marechal
                    {"Agroindústria Matutino","Agroindústria Vespertino"},//Batalha
                    {"Edificações Matutino","Edificações Vespertino"}//Coruripe
            }
    };

    ArrayAdapter<String> adaptadorCurso;

    boolean ano1,ano2,ano3,ano4,campus1,campus2,campus3,campus4,campus5,campus6,campus7,campus8,campus9,campus10,campus11,campus12,tv1,tv2,tv3,tv4,tv5;

    int op;

    Button bt;

    Spinner curso;

    RadioGroup rgAno, rgCampus, rgTipo;
    final int[] _curso = new int[1];
    RadioButton a2013,a2014,a2015,a2016, local1,local2,local3,local4,local5,local6,local7,local8,local9,local10,local11,local12, tipo1,tipo2,tipo3,tipo4,tipo5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);

        Intent intent = getIntent();
        op = intent.getIntExtra("opcao",0);

        bt = (Button) findViewById(R.id.rooi);

        if(op == 0){
            bt.setText("Consultar");
        }else{
            bt.setText("Iniciar Teste");
        }

        ano = 0;
        campus = 0;
        _curso[0] = 0;
        tipo = 0;

        adaptadorCurso = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cursu[ano][campus]);
        adaptadorCurso.setDropDownViewResource(android.R.layout.simple_spinner_item);

        ano1 = true;
        ano2 = false;
        ano3 = false;
        ano4 = false;

        campus1 = true;
        campus2 = false;
        campus3 = false;
        campus4 = false;
        campus5 = false;
        campus6 = false;
        campus7 = false;
        campus8 = false;
        campus9 = false;
        campus10 = false;
        campus11 = false;
        campus12 = false;

        curso = (Spinner) findViewById(R.id.cursos);

        curso.setAdapter(adaptadorCurso);
        curso.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Chamar próxima Activity
                _curso[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });

        rgAno = (RadioGroup) findViewById(R.id.anoDeProva);
        rgCampus = (RadioGroup) findViewById(R.id.campusDeProva);
        rgTipo = (RadioGroup) findViewById(R.id.tipoDeVaga);

        a2013 = (RadioButton) findViewById(R.id.ano2013);
        a2014 = (RadioButton) findViewById(R.id.ano2014);
        a2015 = (RadioButton) findViewById(R.id.ano2015);
        a2016 = (RadioButton) findViewById(R.id.ano2016);

        local1 = (RadioButton) findViewById(R.id.local1);
        local2 = (RadioButton) findViewById(R.id.local2);
        local3 = (RadioButton) findViewById(R.id.local3);
        local4 = (RadioButton) findViewById(R.id.local4);
        local5 = (RadioButton) findViewById(R.id.local5);
        local6 = (RadioButton) findViewById(R.id.local6);
        local7 = (RadioButton) findViewById(R.id.local7);
        local8 = (RadioButton) findViewById(R.id.local8);
        local9 = (RadioButton) findViewById(R.id.local9);
        local10 = (RadioButton) findViewById(R.id.local10);
        local11 = (RadioButton) findViewById(R.id.local11);
        local12 = (RadioButton) findViewById(R.id.local12);

        tipo1 = (RadioButton)findViewById(R.id.tipo1);
        tipo2 = (RadioButton)findViewById(R.id.tipo2);
        tipo3 = (RadioButton)findViewById(R.id.tipo3);
        tipo4 = (RadioButton)findViewById(R.id.tipo4);
        tipo5 = (RadioButton)findViewById(R.id.tipo5);


        rgAno.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId){
                ano1 = R.id.ano2013 == checkedId;
                ano2 = R.id.ano2014 == checkedId;
                ano3 = R.id.ano2015 == checkedId;
                ano4 = R.id.ano2016 == checkedId;
                sincronizeAno();
            }
        });

        rgCampus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId){
                campus1 = R.id.local1 == checkedId;
                campus2 = R.id.local2 == checkedId;
                campus3 = R.id.local3 == checkedId;
                campus4 = R.id.local4 == checkedId;
                campus5 = R.id.local5 == checkedId;
                campus6 = R.id.local6 == checkedId;
                campus7 = R.id.local7 == checkedId;
                campus8 = R.id.local8 == checkedId;
                campus9 = R.id.local9 == checkedId;
                campus10 = R.id.local10 == checkedId;
                campus11 = R.id.local11 == checkedId;
                campus12 = R.id.local12 == checkedId;
                sincronizeCampus();
            }
        });

        rgTipo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId){
                tv1 = R.id.tipo1 == checkedId;
                tv2 = R.id.tipo2 == checkedId;
                tv3 = R.id.tipo3 == checkedId;
                tv4 = R.id.tipo4 == checkedId;
                tv5 = R.id.tipo5 == checkedId;
                sincronizeTipo();
            }
        });

    }
    protected void sincronizeCampus(){
        if(campus1){
            campus = 0;
        }else if(campus2){
            campus = 1;
        }else if(campus3){
            campus = 2;
        }else if(campus4){
            campus = 3;
        }else if(campus5){
            campus = 4;
        }else if(campus6){
            campus = 5;
        }else if(campus7){
            campus = 6;
        }else if(campus8){
            campus = 7;
        }else if(campus9){
            campus = 8;
        }else if(campus10){
            campus = 9;
        }else if(campus11){
            campus = 10;
        }else if(campus12){
            campus = 11;
        }
        adaptadorCurso = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cursu[ano][campus]);
        adaptadorCurso.setDropDownViewResource(android.R.layout.simple_spinner_item);
        curso.setAdapter(adaptadorCurso);
    }
    protected void sincronizeAno(){
        if(ano1){
            ano = 0;
            if (campus11 || campus12){
                campus11 = false;
                campus12 = false;
                campus10 = true;
                local10.setChecked(true);
            }
            local11.setVisibility(View.GONE);
            local12.setVisibility(View.GONE);
        }else if(ano2){
            ano = 1;
            if (campus11 || campus12){
                campus11 = false;
                campus12 = false;
                campus10 = true;
                local10.setChecked(true);
            }
            local11.setVisibility(View.GONE);
            local12.setVisibility(View.GONE);
        }else if(ano3){
            ano = 2;
            local11.setVisibility(View.VISIBLE);
            local12.setVisibility(View.VISIBLE);
        }else if(ano4){
            ano = 3;
            local11.setVisibility(View.VISIBLE);
            local12.setVisibility(View.VISIBLE);
        }
    }
    protected void sincronizeTipo() {
        if (tv1) {
            tipo = 0;
        } else if (tv2) {
            tipo = 1;
        } else if (tv3) {
            tipo = 2;
        } else if (tv4) {
            tipo = 3;
        } else if (tv5) {
            tipo = 4;
        }
    }
    public void pronto(View v){
        if(op == 0){
            Intent i = new Intent(this,Resultado.class);
            i.putExtra("ano",ano);
            i.putExtra("campus",campus);
            i.putExtra("curso",_curso[0]);
            i.putExtra("tipo",tipo);
            startActivity(i);
            finish();
        }else if(op == 1){
            MainActivity.notaMin = MainActivity.corte[ano][campus][_curso[0]][tipo];
            MainActivity.nota = 0;
            Intent i = new Intent(this, Questao.class);
            i.putExtra("ano",ano);
            startActivity(i);
            finish();
        }
    }

}
