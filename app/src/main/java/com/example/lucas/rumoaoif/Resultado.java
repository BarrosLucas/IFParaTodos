package com.example.lucas.rumoaoif;

import android.app.Activity;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Resultado extends Activity {
    String[] tipoA = {"AC","PPI-1","PPI-2","OE-1","OE-2"};
    String[] anoA = {"2013","2014","2015","2016"};
    String[] campusA = {"Maceió", "Palmeira dos Índios", "Satuba", "Arapiraca", "Penedo", "Piranhas", "Maragogi", "Santana do Ipanema", "Murici", "Marechal Deodoro","Batalha","Coruripe"};
    String[][][] cursoA = {
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
    /*//{"Maceió", "Palmeira dos Índios", "Satuba", "Arapiraca", "Penedo", "Piranhas", "Maragogi", "Santana do Ipanema", "Murici", "Marechal Deodoro","Batalha","Coruripe"};
    int[][][][] corte = {
            //2013
            {
                    //Maceió
                    //{"Eletronica Matutino", "Eletrônica Vespertino","Eletrotécnica Matutino","Eletrotécnica Vespertino", "Mecânica Matutino", "Mecânica Vespertino", "Química Matutino", "Química Vespertino", "Edificações Matutino", "Edificações Vespertino", "Estradas Matutino", "Informática Vespertino"},//Maceió
                    {
                            //Eletrônica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrônica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Química Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Química Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Estradas Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Palmeira dos Índios
                    {
                            //Eletrotécnica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Satuba
                    //{"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {
                            //Agroindústria Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Semi-Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Semi-Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Arapiraca
                    //{"Eletroeletrônica Matutino","Eletroeletrônica Vespertino","Informática Matutino","Informática Vespertino"},//Arapiraca
                    {
                            //Eletroeletrônica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletroeletrônica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Penedo
                    {
                            //Açúcar e Álcool Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Açúcar e Álcool Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Piranhas
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústrai Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Maragogi
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Santana do Ipanema
                    //{"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {
                            //Agropecuária Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Murici
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Murici
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Mauttino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústrai Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Marechal Deodoro
                    //{"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"}//Marechal
                    {
                            //Meio Ambiente Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    }
            },

            //2014
            {
                    //Maceió
                    //{"Eletronica Matutino","Eletrônica Vespertino","Eletrotécnica Matutino","Eletrotécnica Vespertino", "Mecânica Matutino","Mecânica Vespertino","Química Matutino","Química Vespertino","Edificações Matutino","Edificações Vespertino","Estradas Vespertino","Informática Matutino"},//Maceió
                    {
                            //Eletrônica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrônica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Química Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Química Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Estradas Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Palmeira dos Índios
                    //{"Eletrotécnica Matutino","Eletrotécnica Vespertino","Edificações Matutino","Edificações Vespertino","Informática Matutino","Informática Vespertino"},//Palmeira
                    {
                            //Eletrotécnica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Satuba
                    //{"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {
                            //Agroindústria Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Semi-Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Semi-Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Arapiraca
                    //{"Eletroeletrônica Vespertino","Informática Vespertino"},//Arapiraca
                    {
                            //Eletroeletrônica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Penedo
                    //{"Açúcar e Álcool Matutino","Açúcar e Álcool Vespertino","Meio Ambiente Matutino","Meio Ambiente Vespertino"},//Penedo
                    {
                            //Açúcar e Álcool Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Açúcar e Álcool Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Piranhas
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústrai Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Maragogi
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Santana do Ipanema
                    //{"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {
                            //Agropecuária Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Murici
                    //{"Agroecologia Matutino","Agroindústria Vespertino"},//Murici
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústrai Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Marechal Deodoro
                    //{"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"}//Marechal
                    {
                            //Meio Ambiente Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    }
            },

            //2015
            {
                    //Maceió
                    //{"Eletronica Matutino","Eletrônica Vespertino","Eletrotécnica Matutino","Eletrotécnica Vespertino", "Mecânica Matutino","Mecânica Vespertino","Química Matutino","Química Vespertino","Edificações Matutino","Edificações Vespertino","Estradas Matutino","Informática Matutino","Informática Vespertino"},//Maceió
                    {
                            //Eletrônica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrônica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Química Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Química Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Estradas Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0 //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Palmeira dos Índios
                    //{"Eletrotécnica Matutino","Eletrotécnica Vespertino","Edificações Matutino","Edificações Vespertino","Informática Matutino","Informática Vespertino"},//Palmeira
                    {
                            //Eletrotécnica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Satuba
                    //{"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {
                            //Agroindústria Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Semi-Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Semi-Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Arapiraca
                    //{"Eletroeletrônica Matutino","Eletroeletrônica Vespertino","Informática Matutino","Informática Vespertino"},//Arapiraca
                    {
                            //Eletroeletrônica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletroeletrônica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Penedo
                    //{"Açúcar e Álcool Matutino","Açúcar e Álcool Vespertino","Meio Ambiente Matutino","Meio Ambiente Vespertino"},//Penedo
                    {
                            //Açúcar e Álcool Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Açúcar e Álcool Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Piranhas
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Maragogi
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Santana do Ipanema
                    //{"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {
                            //Agropecuária Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Murici
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Murici
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Marechal Deodoro
                    //{"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"},//Marechal
                    {
                            //Meio Ambiente Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Batalha
                    //{"Agroindústria Matutino","Agroindústria Vespertino"},//Batalha
                    {
                            //Agroindústria Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0 //OE-2
                            },

                            //Agroindústria Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0 //OE-2
                            }
                    },
                    //Coruripe
                    //{"Edificações Matutino","Edificações Vespertino"}//Coruripe
                    {
                            //Edificações Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0 //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0 //OE-2
                            }
                    }
            },
            //2016
            {
                    //Maceió
                    //{"Eletronica Matutino","Eletrônica Vespertino","Eletrotécnica Matutino","Eletrotécnica Vespertino", "Mecânica Matutino","Mecânica Vespertino","Química Matutino","Química Vespertino","Edificações Matutino","Edificações Vespertino","Estradas Vespertino","Informática Matutino","Informática Vespertino"},//Maceió
                    {
                            //Eletrônica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrônica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Química Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Química Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Estradas Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Palmeira dos Índios
                    //{"Eletrotécnica Matutino","Eletrotécnica Vespertino","Edificações Matutino","Edificações Vespertino","Informática Matutino","Informática Vespertino"},//Palmeira
                    {
                            //Eletrotécnica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Satuba
                    //{"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {
                            //Agroindústria Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Semi-Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Semi-Residência
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Arapiraca
                    //{"Eletroeletrônica Matutino","Eletroeletrônica Vespertino","Informática Matutino","Informática Vespertino"},//Arapiraca
                    {
                            //Eletroeletrônica Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Eletroeletrônica Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Penedo
                    //{"Açúcar e Álcool Matutino","Açúcar e Álcool Vespertino","Meio Ambiente Matutino","Meio Ambiente Vespertino"},//Penedo
                    {
                            //Açúcar e Álcool Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Açúcar e Álcool Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Piranhas
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústrai Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Maragogi
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {
                            //Agroecologia Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Santana do Ipanema
                    //{"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {
                            //Agropecuária Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Murici
                    //{"Agroecologia Vespertino","Agroindústria Vespertino"},//Murici
                    {
                            //Agroecologia Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Marechal Deodoro
                    //{"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"},//Marechal
                    {
                            //Meio Ambiente Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Batalha
                    //{"Agroindústria Matutino","Agroindústria Vespertino"},//Batalha
                    {
                            //Agroindústria Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0 //OE-2
                            },

                            //Agroindústria Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0 //OE-2
                            }
                    },
                    //Coruripe
                    //{"Edificações Matutino","Edificações Vespertino"}//Coruripe
                    {
                            //Edificações Matutino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0 //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    0, //AC
                                    0, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0 //OE-2
                            }
                    }
            }
    };*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        TextView anoe = (TextView) findViewById(R.id.anoe);
        TextView campuse = (TextView) findViewById(R.id.campuse);
        TextView cursoe = (TextView) findViewById(R.id.cursoe);
        TextView tipoe = (TextView) findViewById(R.id.tipoe);
        TextView nota = (TextView) findViewById(R.id.nota);
        Intent intent = getIntent();

        Log.i("ANO: ",""+intent.getIntExtra("ano",0));
        Log.i("CAMPUS: ",""+intent.getIntExtra("campus",0));
        Log.i("CURSO: ",""+intent.getIntExtra("curso",0));
        Log.i("TIPO: ",""+intent.getIntExtra("tipo",0));

        anoe.setText(anoA[intent.getIntExtra("ano", 0)]);
        campuse.setText(campusA[intent.getIntExtra("campus", 0)]);
        cursoe.setText(cursoA[intent.getIntExtra("ano", 0)][intent.getIntExtra("campus", 0)][intent.getIntExtra("curso", 0)]);
        tipoe.setText(tipoA[intent.getIntExtra("tipo", 0)]);
        nota.setText(""+MainActivity.corte[intent.getIntExtra("ano",0)][intent.getIntExtra("campus",0)][intent.getIntExtra("curso",0)][intent.getIntExtra("tipo",0)]);
    }
    public void menu(View v){
        finish();
    }
}
