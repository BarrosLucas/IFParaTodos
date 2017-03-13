package com.example.lucas.rumoaoif;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    public static int opcao;
    public static int notaMin;
    public static int nota;
    public static int portugues;
    public static int atualidades;
    public static int matematica;
    public static int questaoAtual = 0;

    public static int[][][][] corte = {
            //2013
            {
                    //Maceió
                    //{"Eletronica Matutino", "Eletrônica Vespertino","Eletrotécnica Matutino","Eletrotécnica Vespertino", "Mecânica Matutino", "Mecânica Vespertino", "Química Matutino", "Química Vespertino", "Edificações Matutino", "Edificações Vespertino", "Estradas Matutino", "Informática Vespertino"},//Maceió
                    {
                            //Eletrônica Matutino
                            {
                                    21, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            },

                            //Eletrônica Vespertino
                            {
                                    21, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Matutino
                            {
                                    19, //AC
                                    14, //PPI-1
                                    16, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    19, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Matutino
                            {
                                    20, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    15  //OE-2
                            },

                            //Mecânica Vespertino
                            {
                                    20, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Química Matutino
                            {
                                    20, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Química Vespertino
                            {
                                    20, //AC
                                    15, //PPI-1
                                    15, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    27, //AC
                                    15, //PPI-1
                                    15, //PPI-2
                                    20, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    22, //AC
                                    14, //PPI-1
                                    10, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            },

                            //Estradas Matutino
                            {
                                    19, //AC
                                    11, //PPI-1
                                    0, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    22, //AC
                                    15, //PPI-1
                                    10, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Palmeira dos Índios
                    {
                            //Eletrotécnica Matutino
                            {
                                    13, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    13, //AC
                                    9, //PPI-1
                                    10, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    20, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    14  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    16, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    17, //AC
                                    9, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    15, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Satuba
                    //{"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {
                            //Agroindústria Residência
                            {
                                    9, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Semi-Residência
                            {
                                    14, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    10, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Residência
                            {
                                    12, //AC
                                    6, //PPI-1
                                    0, //PPI-2
                                    9, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Semi-Residência
                            {
                                    15, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Arapiraca
                    //{"Eletroeletrônica Matutino","Eletroeletrônica Vespertino","Informática Matutino","Informática Vespertino"},//Arapiraca
                    {
                            //Eletroeletrônica Matutino
                            {
                                    17, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            },

                            //Eletroeletrônica Vespertino
                            {
                                    16, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    22, //AC
                                    15, //PPI-1
                                    11, //PPI-2
                                    21, //OE-1
                                    16  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    19, //AC
                                    13, //PPI-1
                                    9, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Penedo
                    {
                            //Açúcar e Álcool Matutino
                            {
                                    15, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Açúcar e Álcool Vespertino
                            {
                                    13, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Matutino
                            {
                                    15, //AC
                                    13, //PPI-1
                                    9, //PPI-2
                                    12, //OE-1
                                    7  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    13, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    10, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Piranhas
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {
                            //Agroecologia Matutino
                            {
                                    10, //AC
                                    9, //PPI-1
                                    0, //PPI-2
                                    11, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    9, //AC
                                    7, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Matutino
                            {
                                    10, //AC
                                    7, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústrai Vespertino
                            {
                                    7, //AC
                                    9, //PPI-1
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
                                    14, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    12, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    11, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Matutino
                            {
                                    14, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    11, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Vespertino
                            {
                                    12, //AC
                                    11, //PPI-1
                                    0, //PPI-2
                                    10, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Santana do Ipanema
                    //{"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {
                            //Agropecuária Matutino
                            {
                                    13, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Vespertino
                            {
                                    7, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    7, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Murici
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Murici
                    {
                            //Agroecologia Matutino
                            {
                                    11, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    8, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    13, //AC
                                    8, //PPI-1
                                    12, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Mauttino
                            {
                                    13, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústrai Vespertino
                            {
                                    13, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    9, //OE-1
                                    9  //OE-2
                            }
                    },
                    //Marechal Deodoro
                    //{"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"}//Marechal
                    {
                            //Meio Ambiente Matutino
                            {
                                    13, //AC
                                    9, //PPI-1
                                    0, //PPI-2
                                    6, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    7, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Matutino
                            {
                                    12, //AC
                                    5, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Vespertino
                            {
                                    8, //AC
                                    6, //PPI-1
                                    0, //PPI-2
                                    7, //OE-1
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
                                    23, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    20, //OE-1
                                    0  //OE-2
                            },

                            //Eletrônica Vespertino
                            {
                                    21, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Matutino
                            {
                                    24, //AC
                                    18, //PPI-1
                                    0, //PPI-2
                                    21, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    21, //AC
                                    18, //PPI-1
                                    0, //PPI-2
                                    20, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Matutino
                            {
                                    23, //AC
                                    18, //PPI-1
                                    0, //PPI-2
                                    19, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Vespertino
                            {
                                    22, //AC
                                    17, //PPI-1
                                    0, //PPI-2
                                    18, //OE-1
                                    16  //OE-2
                            },

                            //Química Matutino
                            {
                                    27, //AC
                                    20, //PPI-1
                                    16, //PPI-2
                                    22, //OE-1
                                    0  //OE-2
                            },

                            //Química Vespertino
                            {
                                    24, //AC
                                    17, //PPI-1
                                    0, //PPI-2
                                    20, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    26, //AC
                                    21, //PPI-1
                                    0, //PPI-2
                                    25, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    24, //AC
                                    19, //PPI-1
                                    0, //PPI-2
                                    22, //OE-1
                                    0  //OE-2
                            },

                            //Estradas Vespertino
                            {
                                    21, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    19, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    26, //AC
                                    20, //PPI-1
                                    0, //PPI-2
                                    22, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Palmeira dos Índios
                    //{"Eletrotécnica Matutino","Eletrotécnica Vespertino","Edificações Matutino","Edificações Vespertino","Informática Matutino","Informática Vespertino"},//Palmeira
                    {
                            //Eletrotécnica Matutino
                            {
                                    21, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    20, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    18, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    24, //AC
                                    19, //PPI-1
                                    0, //PPI-2
                                    22, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    22, //AC
                                    18, //PPI-1
                                    14, //PPI-2
                                    21, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    23, //AC
                                    17, //PPI-1
                                    0, //PPI-2
                                    21, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    20, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    19, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Satuba
                    //{"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {
                            //Agroindústria Residência
                            {
                                    13, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Semi-Residência
                            {
                                    20, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Residência
                            {
                                    17, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Semi-Residência
                            {
                                    20, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Arapiraca
                    //{"Eletroeletrônica Vespertino","Informática Vespertino"},//Arapiraca
                    {
                            //Eletroeletrônica Vespertino
                            {
                                    23, //AC
                                    19, //PPI-1
                                    0, //PPI-2
                                    22, //OE-1
                                    16  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    27, //AC
                                    20, //PPI-1
                                    0, //PPI-2
                                    25, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Penedo
                    //{"Açúcar e Álcool Matutino","Açúcar e Álcool Vespertino","Meio Ambiente Matutino","Meio Ambiente Vespertino"},//Penedo
                    {
                            //Açúcar e Álcool Matutino
                            {
                                    20, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Açúcar e Álcool Vespertino
                            {
                                    18, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Matutino
                            {
                                    21, //AC
                                    18, //PPI-1
                                    0, //PPI-2
                                    19, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    20, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Piranhas
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {
                            //Agroecologia Matutino
                            {
                                    19, //AC
                                    14, //PPI-1
                                    16, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    14, //AC
                                    11, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Matutino
                            {
                                    19, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústrai Vespertino
                            {
                                    15, //AC
                                    9, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Maragogi
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {
                            //Agroecologia Matutino
                            {
                                    19, //AC
                                    17, //PPI-1
                                    14, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    17, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Matutino
                            {
                                    20, //AC
                                    18, //PPI-1
                                    17, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Vespertino
                            {
                                    18, //AC
                                    15, //PPI-1
                                    14, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Santana do Ipanema
                    //{"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {
                            //Agropecuária Matutino
                            {
                                    21, //AC
                                    18, //PPI-1
                                    14, //PPI-2
                                    20, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Vespertino
                            {
                                    18, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Murici
                    //{"Agroecologia Matutino","Agroindústria Vespertino"},//Murici
                    {
                            //Agroecologia Matutino
                            {
                                    19, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústrai Vespertino
                            {
                                    19, //AC
                                    17, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Marechal Deodoro
                    //{"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"}//Marechal
                    {
                            //Meio Ambiente Matutino
                            {
                                    22, //AC
                                    18, //PPI-1
                                    9, //PPI-2
                                    21, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    18, //AC
                                    14, //PPI-1
                                    14, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Matutino
                            {
                                    19, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Vespertino
                            {
                                    10, //AC
                                    9, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
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
                                    20, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Eletrônica Vespertino
                            {
                                    19, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Matutino
                            {
                                    21, //AC
                                    17, //PPI-1
                                    9, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    20, //AC
                                    14, //PPI-1
                                    19, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Matutino
                            {
                                    21, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Vespertino
                            {
                                    19, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Química Matutino
                            {
                                    26, //AC
                                    17, //PPI-1
                                    0, //PPI-2
                                    19, //OE-1
                                    0  //OE-2
                            },

                            //Química Vespertino
                            {
                                    22, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    25, //AC
                                    17, //PPI-1
                                    0, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    22, //AC
                                    16, //PPI-1
                                    10, //PPI-2
                                    20, //OE-1
                                    0  //OE-2
                            },

                            //Estradas Matutino
                            {
                                    20, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    24, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    18, //OE-1
                                    0 //OE-2
                            },

                            //Informática Vespertino
                            {
                                    21, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Palmeira dos Índios
                    //{"Eletrotécnica Matutino","Eletrotécnica Vespertino","Edificações Matutino","Edificações Vespertino","Informática Matutino","Informática Vespertino"},//Palmeira
                    {
                            //Eletrotécnica Matutino
                            {
                                    18, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    18, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    21, //AC
                                    15, //PPI-1
                                    16, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    21, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    19, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    18, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    17, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Satuba
                    //{"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {
                            //Agroindústria Residência
                            {
                                    13, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    11, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Semi-Residência
                            {
                                    17, //AC
                                    11, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Residência
                            {
                                    17, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Semi-Residência
                            {
                                    17, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Arapiraca
                    //{"Eletroeletrônica Matutino","Eletroeletrônica Vespertino","Informática Matutino","Informática Vespertino"},//Arapiraca
                    {
                            //Eletroeletrônica Matutino
                            {
                                    21, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Eletroeletrônica Vespertino
                            {
                                    21, //AC
                                    16, //PPI-1
                                    19, //PPI-2
                                    19, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    21, //AC
                                    16, //PPI-1
                                    19, //PPI-2
                                    19, //OE-1
                                    13  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    20, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    20, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Penedo
                    //{"Açúcar e Álcool Matutino","Açúcar e Álcool Vespertino","Meio Ambiente Matutino","Meio Ambiente Vespertino"},//Penedo
                    {
                            //Açúcar e Álcool Matutino
                            {
                                    18, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Açúcar e Álcool Vespertino
                            {
                                    15, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Matutino
                            {
                                    20, //AC
                                    17, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    17, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Piranhas
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {
                            //Agroecologia Matutino
                            {
                                    14, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    14, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Matutino
                            {
                                    16, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Vespertino
                            {
                                    10, //AC
                                    10, //PPI-1
                                    7, //PPI-2
                                    9, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Maragogi
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {
                            //Agroecologia Matutino
                            {
                                    17, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    16, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Matutino
                            {
                                    18, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Vespertino
                            {
                                    17, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Santana do Ipanema
                    //{"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {
                            //Agropecuária Matutino
                            {
                                    18, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Vespertino
                            {
                                    16, //AC
                                    14, //PPI-1
                                    12, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Murici
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Murici
                    {
                            //Agroecologia Matutino
                            {
                                    16, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    12, //AC
                                    11, //PPI-1
                                    0, //PPI-2
                                    8, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Matutino
                            {
                                    18, //AC
                                    16, //PPI-1
                                    17, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Vespertino
                            {
                                    15, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Marechal Deodoro
                    //{"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"},//Marechal
                    {
                            //Meio Ambiente Matutino
                            {
                                    17, //AC
                                    14, //PPI-1
                                    13, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    16, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Matutino
                            {
                                    16, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Vespertino
                            {
                                    15, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Batalha
                    //{"Agroindústria Matutino","Agroindústria Vespertino"},//Batalha
                    {
                            //Agroindústria Matutino
                            {
                                    16, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0 //OE-2
                            },

                            //Agroindústria Vespertino
                            {
                                    10, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    11, //OE-1
                                    0 //OE-2
                            }
                    },
                    //Coruripe
                    //{"Edificações Matutino","Edificações Vespertino"}//Coruripe
                    {
                            //Edificações Matutino
                            {
                                    18, //AC
                                    15, //PPI-1
                                    9, //PPI-2
                                    16, //OE-1
                                    0 //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    15, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
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
                                    20, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Eletrônica Vespertino
                            {
                                    18, //AC
                                    11, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Matutino
                            {
                                    20, //AC
                                    14, //PPI-1
                                    17, //PPI-2
                                    0, //OE-1
                                    15  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    20, //AC
                                    11, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Matutino
                            {
                                    20, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Mecânica Vespertino
                            {
                                    19, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            },

                            //Química Matutino
                            {
                                    25, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            },

                            //Química Vespertino
                            {
                                    22, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    24, //AC
                                    17, //PPI-1
                                    0, //PPI-2
                                    19, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    20, //AC
                                    16, //PPI-1
                                    13, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Estradas Vespertino
                            {
                                    17, //AC
                                    16, //PPI-1
                                    13, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    24, //AC
                                    16, //PPI-1
                                    13, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    21, //AC
                                    15, //PPI-1
                                    12, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Palmeira dos Índios
                    //{"Eletrotécnica Matutino","Eletrotécnica Vespertino","Edificações Matutino","Edificações Vespertino","Informática Matutino","Informática Vespertino"},//Palmeira
                    {
                            //Eletrotécnica Matutino
                            {
                                    18, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Eletrotécnica Vespertino
                            {
                                    15, //AC
                                    9, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Matutino
                            {
                                    21, //AC
                                    17, //PPI-1
                                    14, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    17, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    18, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    17, //AC
                                    14, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Satuba
                    //{"Agroindústria Residência","Agroindústria Semi-Res","Agropecuária Residência","Agropecuária Semi-Res"},//Satuba
                    {
                            //Agroindústria Residência
                            {
                                    12, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Semi-Residência
                            {
                                    17, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Residência
                            {
                                    15, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Semi-Residência
                            {
                                    16, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Arapiraca
                    //{"Eletroeletrônica Matutino","Eletroeletrônica Vespertino","Informática Matutino","Informática Vespertino"},//Arapiraca
                    {
                            //Eletroeletrônica Matutino
                            {
                                    21, //AC
                                    16, //PPI-1
                                    0, //PPI-2
                                    19, //OE-1
                                    0  //OE-2
                            },

                            //Eletroeletrônica Vespertino
                            {
                                    20, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            },

                            //Informática Matutino
                            {
                                    23, //AC
                                    19, //PPI-1
                                    10, //PPI-2
                                    20, //OE-1
                                    23  //OE-2
                            },

                            //Informática Vespertino
                            {
                                    21, //AC
                                    17, //PPI-1
                                    8, //PPI-2
                                    18, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Penedo
                    //{"Açúcar e Álcool Matutino","Açúcar e Álcool Vespertino","Meio Ambiente Matutino","Meio Ambiente Vespertino"},//Penedo
                    {
                            //Açúcar e Álcool Matutino
                            {
                                    16, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Açúcar e Álcool Vespertino
                            {
                                    14, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    11, //OE-1
                                    13  //OE-2
                            },

                            //Meio Ambiente Matutino
                            {
                                    18, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    16, //AC
                                    14, //PPI-1
                                    6, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Piranhas
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Agroindústria Matutino","Agroindústria Vespertino"},//Piranhas
                    {
                            //Agroecologia Matutino
                            {
                                    14, //AC
                                    11, //PPI-1
                                    0, //PPI-2
                                    11, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    6, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    0, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Matutino
                            {
                                    16, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    10, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústrai Vespertino
                            {
                                    10, //AC
                                    7, //PPI-1
                                    0, //PPI-2
                                    8, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Maragogi
                    //{"Agroecologia Matutino","Agroecologia Vespertino","Hospedagem Matutino","Hospedagem Vespertino"},//Maragogi
                    {
                            //Agroecologia Matutino
                            {
                                    15, //AC
                                    11, //PPI-1
                                    10, //PPI-2
                                    10, //OE-1
                                    0  //OE-2
                            },

                            //Agroecologia Vespertino
                            {
                                    12, //AC
                                    8, //PPI-1
                                    0, //PPI-2
                                    10, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Matutino
                            {
                                    17, //AC
                                    15, //PPI-1
                                    11, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Hospedagem Vespertino
                            {
                                    13, //AC
                                    11, //PPI-1
                                    0, //PPI-2
                                    13, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Santana do Ipanema
                    //{"Agropecuária Matutino","Agropecuária Vespertino"},//Santana
                    {
                            //Agropecuária Matutino
                            {
                                    17, //AC
                                    13, //PPI-1
                                    14, //PPI-2
                                    14, //OE-1
                                    0  //OE-2
                            },

                            //Agropecuária Vespertino
                            {
                                    14, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    11, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Murici
                    //{"Agroecologia Vespertino","Agroindústria Vespertino"},//Murici
                    {
                            //Agroecologia Vespertino
                            {
                                    16, //AC
                                    14, //PPI-1
                                    9, //PPI-2
                                    15, //OE-1
                                    0  //OE-2
                            },

                            //Agroindústria Vespertino
                            {
                                    15, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    14, //OE-1
                                    13  //OE-2
                            }
                    },
                    //Marechal Deodoro
                    //{"Meio Ambiente Matutino","Meio Ambiente Vespertino","Guia de Turismo Matutino","Guia de Turismo Vespertino"},//Marechal
                    {
                            //Meio Ambiente Matutino
                            {
                                    16, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    16, //OE-1
                                    0  //OE-2
                            },

                            //Meio Ambiente Vespertino
                            {
                                    13, //AC
                                    9, //PPI-1
                                    0, //PPI-2
                                    10, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Matutino
                            {
                                    16, //AC
                                    13, //PPI-1
                                    0, //PPI-2
                                    10, //OE-1
                                    0  //OE-2
                            },

                            //Guia de Turismo Vespertino
                            {
                                    14, //AC
                                    9, //PPI-1
                                    0, //PPI-2
                                    10, //OE-1
                                    0  //OE-2
                            }
                    },
                    //Batalha
                    //{"Agroindústria Matutino","Agroindústria Vespertino"},//Batalha
                    {
                            //Agroindústria Matutino
                            {
                                    15, //AC
                                    12, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0 //OE-2
                            },

                            //Agroindústria Vespertino
                            {
                                    14, //AC
                                    10, //PPI-1
                                    0, //PPI-2
                                    12, //OE-1
                                    0 //OE-2
                            }
                    },
                    //Coruripe
                    //{"Edificações Matutino","Edificações Vespertino"}//Coruripe
                    {
                            //Edificações Matutino
                            {
                                    18, //AC
                                    15, //PPI-1
                                    0, //PPI-2
                                    17, //OE-1
                                    0 //OE-2
                            },

                            //Edificações Vespertino
                            {
                                    18, //AC
                                    14, //PPI-1
                                    7, //PPI-2
                                    15, //OE-1
                                    0 //OE-2
                            }
                    }
            }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questaoAtual = 0;
        notaMin = 0;
        nota = 0;
        portugues = 0;
        matematica = 0;
        atualidades = 0;
    }
    public void consultar(View v){
        Intent i = new Intent(this, Opcoes.class);
        i.putExtra("opcao",0);
        startActivity(i);
    }
    public void dicas (View v){
        Intent i = new Intent(this, Dica.class);
        startActivity(i);
    }
    public void teste (View v){
        questaoAtual = 0;
        nota = 0;
        portugues = 0;
        matematica = 0;
        atualidades = 0;
        notaMin = 0;
        Intent i = new Intent(this, Opcoes.class);
        i.putExtra("opcao",1);
        startActivity(i);
    }
}