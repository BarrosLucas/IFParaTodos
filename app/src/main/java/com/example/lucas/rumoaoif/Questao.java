package com.example.lucas.rumoaoif;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Questao extends Activity {
    Chronometer c;
    public static int ano;
    ImageView correcao;
    boolean disponibilidade = true;
    String[] anos = {"2013","2014","2015","2016"};
    int[][] imagem = {
            {
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
            //2014
            {
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
                    R.drawable._2014_imagem1,
                    -1,
                    -1,
                    -1,
                    -1,
                    -1,
                    -1,
                    R.drawable._2014_imagem2,
                    R.drawable._2014_imagem3
            },
            //2015
            {
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
                    R.drawable._2015_imagem1,
                    R.drawable._2015_imagem2,
                    -1,
                    -1,
                    -1,
                    -1,
                    -1,
                    -1,
                    -1,
                    -1,
                    -1,
                    R.drawable._2015_imagem3,
                    -1,
                    R.drawable._2015_imagem4,
                    -1,
                    -1,
                    -1,
                    R.drawable._2015_imagem5,
                    -1,
                    -1
            },
            //2016
            {
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
                    R.drawable._2016_imagem1,
                    R.drawable._2016_imagem2,
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
                    R.drawable._2016_imagem3,
                    -1,
                    -1
            }
    };
    //Array pa é para presença de texto e de imagem em cada questão
    boolean[][][] pa ={
            //2013
            {
                    {
                            true, false
                    }, //1
                    {
                            true, false
                    }, //2
                    {
                            true, false
                    }, //3
                    {
                            true, false
                    }, //4
                    {
                            true, false
                    }, //5
                    {
                            true, false
                    }, //6
                    {
                            true, false
                    }, //7
                    {
                            true, false
                    }, //8
                    {
                            true, false
                    }, //9
                    {
                            true, false
                    }, //10
                    {
                            true, false
                    }, //11
                    {
                            true, false
                    }, //12
                    {
                            true, false
                    }, //13
                    {
                            true, false
                    }, //14
                    {
                            true, false
                    }, //15
                    {
                            true, false
                    }, //16
                    {
                            true, false
                    }, //17
                    {
                            true, false
                    }, //18
                    {
                            false, false
                    }, //19
                    {
                            false, false
                    }, //20
                    {
                            true, false
                    }, //21
                    {
                            true, false
                    }, //22
                    {
                            false, false
                    },//23
                    {
                            false, false
                    },//24
                    {
                            false, false
                    },//25
                    {
                            false, false
                    },//26
                    {
                            false, false
                    },//27
                    {
                            false, false
                    },//28
                    {
                            false, false
                    },//29
                    {
                            false, false
                    },//30
                    {
                            false, false
                    },//31
                    {
                            false, false
                    },//32
                    {
                            false, false
                    },//33
                    {
                            false, false
                    },//34
                    {
                            false, false
                    },//35
                    {
                            false, false
                    },//36
                    {
                            false, false
                    },//37
                    {
                            false, false
                    },//38
                    {
                            false, false
                    },//39
                    {
                            false, false
                    } //40
            },
            //2014
            {
                    {
                            true, false
                    }, //1
                    {
                            true, false
                    }, //2
                    {
                            true, false
                    }, //3
                    {
                            true, false
                    }, //4
                    {
                            true, false
                    }, //5
                    {
                            true, false
                    }, //6
                    {
                            true, false
                    }, //7
                    {
                            true, false
                    }, //8
                    {
                            true, false
                    }, //9
                    {
                            true, false
                    }, //10
                    {
                            true, false
                    }, //11
                    {
                            true, false
                    }, //12
                    {
                            true, false
                    }, //13
                    {
                            true, false
                    }, //14
                    {
                            true, false
                    }, //15
                    {
                            true, false
                    }, //16
                    {
                            true, false
                    }, //17
                    {
                            true, false
                    }, //18
                    {
                            true, false
                    }, //19
                    {
                            false, false
                    }, //20
                    {
                            false, false
                    }, //21
                    {
                            false, false
                    }, //22
                    {
                            false, false
                    },//23
                    {
                            false, false
                    },//24
                    {
                            false, false
                    },//25
                    {
                            false, false
                    },//26
                    {
                            false, false
                    },//27
                    {
                            false, false
                    },//28
                    {
                            false, false
                    },//29
                    {
                            false, false
                    },//30
                    {
                            false, false
                    },//31
                    {
                            false, true
                    },//32
                    {
                            false, false
                    },//33
                    {
                            false, false
                    },//34
                    {
                            false, false
                    },//35
                    {
                            false, false
                    },//36
                    {
                            false, false
                    },//37
                    {
                            false, false
                    },//38
                    {
                            false, true
                    },//39
                    {
                            false, true
                    } //40

            },

            //2015
            {
                    {
                            true, false
                    }, //1
                    {
                            true, false
                    }, //2
                    {
                            true, false
                    }, //3
                    {
                            true, false
                    }, //4
                    {
                            true, false
                    }, //5
                    {
                            true, false
                    }, //6
                    {
                            true, false
                    }, //7
                    {
                            true, false
                    }, //8
                    {
                            true, false
                    }, //9
                    {
                            true, false
                    }, //10
                    {
                            true, false
                    }, //11
                    {
                            true, false
                    }, //12
                    {
                            true, false
                    }, //13
                    {
                            true, false
                    }, //14
                    {
                            true, false
                    }, //15
                    {
                            true, false
                    }, //16
                    {
                            true, false
                    }, //17
                    {
                            true, false
                    }, //18
                    {
                            true, false
                    }, //19
                    {
                            false, false
                    }, //20
                    {
                            false, true
                    }, //21
                    {
                            false, true
                    }, //22
                    {
                            false, false
                    },//23
                    {
                            false, false
                    },//24
                    {
                            false, false
                    },//25
                    {
                            false, false
                    },//26
                    {
                            false, false
                    },//27
                    {
                            false, false
                    },//28
                    {
                            false, false
                    },//29
                    {
                            false, false
                    },//30
                    {
                            false, false
                    },//31
                    {
                            false, true
                    },//32
                    {
                            false, false
                    },//33
                    {
                            false, true
                    },//34
                    {
                            false, false
                    },//35
                    {
                            false, false
                    },//36
                    {
                            false, false
                    },//37
                    {
                            false, true
                    },//38
                    {
                            false, true
                    },//39
                    {
                            false, true
                    } //40
            },
            //2016
            {
                    {
                            true, false
                    }, //1
                    {
                            true, false
                    }, //2
                    {
                            true, false
                    }, //3
                    {
                            true, false
                    }, //4
                    {
                            true, false
                    }, //5
                    {
                            true, false
                    }, //6
                    {
                            true, false
                    }, //7
                    {
                            true, false
                    }, //8
                    {
                            true, false
                    }, //9
                    {
                            true, false
                    }, //10
                    {
                            true, false
                    }, //11
                    {
                            true, false
                    }, //12
                    {
                            true, false
                    }, //13
                    {
                            true, false
                    }, //14
                    {
                            false, false
                    }, //15
                    {
                            true, false
                    }, //16
                    {
                            true, false
                    }, //17
                    {
                            true, false
                    }, //18
                    {
                            false, false
                    }, //19
                    {
                            false, true
                    }, //20
                    {
                            false, true
                    }, //21
                    {
                            false, false
                    }, //22
                    {
                            false, false
                    },//23
                    {
                            false, false
                    },//24
                    {
                            false, false
                    },//25
                    {
                            false, false
                    },//26
                    {
                            false, false
                    },//27
                    {
                            false, false
                    },//28
                    {
                            false, false
                    },//29
                    {
                            false, false
                    },//30
                    {
                            false, false
                    },//31
                    {
                            false, false
                    },//32
                    {
                            false, false
                    },//33
                    {
                            false, false
                    },//34
                    {
                            false, false
                    },//35
                    {
                            false, false
                    },//36
                    {
                            false, false
                    },//37
                    {
                            false, true
                    },//38
                    {
                            false, false
                    },//39
                    {
                            false, false
                    } //40
            }
    };
    RadioButton a,b,ce,d,e;
    TextView exame, questao, quesito;
    Button redacao;
    ImageView question;
    boolean A,B,C,D,E;
    int[][] questoes = {
            //2013
            {
                    R.string._1,
                    R.string._2,
                    R.string._3,
                    R.string._4,
                    R.string._5,
                    R.string._6,
                    R.string._7,
                    R.string._8,
                    R.string._9,
                    R.string._10,
                    R.string._11,
                    R.string._12,
                    R.string._13,
                    R.string._14,
                    R.string._15,
                    R.string._16,
                    R.string._17,
                    R.string._18,
                    R.string._19,
                    R.string._20,
                    R.string._21,
                    R.string._22,
                    R.string._23,
                    R.string._24,
                    R.string._25,
                    R.string._26,
                    R.string._27,
                    R.string._28,
                    R.string._29,
                    R.string._30,
                    R.string._31,
                    R.string._32,
                    R.string._33,
                    R.string._34,
                    R.string._35,
                    R.string._36,
                    R.string._37,
                    R.string._38,
                    R.string._39,
                    R.string._40
            },
            //2014
            {
                    R.string._2014_1,
                    R.string._2014_2,
                    R.string._2014_3,
                    R.string._2014_4,
                    R.string._2014_5,
                    R.string._2014_6,
                    R.string._2014_7,
                    R.string._2014_8,
                    R.string._2014_9,
                    R.string._2014_10,
                    R.string._2014_11,
                    R.string._2014_12,
                    R.string._2014_13,
                    R.string._2014_14,
                    R.string._2014_15,
                    R.string._2014_16,
                    R.string._2014_17,
                    R.string._2014_18,
                    R.string._2014_19,
                    R.string._2014_20,
                    R.string._2014_21,
                    R.string._2014_22,
                    R.string._2014_23,
                    R.string._2014_24,
                    R.string._2014_25,
                    R.string._2014_26,
                    R.string._2014_27,
                    R.string._2014_28,
                    R.string._2014_29,
                    R.string._2014_30,
                    R.string._2014_31,
                    R.string._2014_32,
                    R.string._2014_33,
                    R.string._2014_34,
                    R.string._2014_35,
                    R.string._2014_36,
                    R.string._2014_37,
                    R.string._2014_38,
                    R.string._2014_39,
                    R.string._2014_40
            },
            //2015
            {
                    R.string._2015_1,
                    R.string._2015_2,
                    R.string._2015_3,
                    R.string._2015_4,
                    R.string._2015_5,
                    R.string._2015_6,
                    R.string._2015_7,
                    R.string._2015_8,
                    R.string._2015_9,
                    R.string._2015_10,
                    R.string._2015_11,
                    R.string._2015_12,
                    R.string._2015_13,
                    R.string._2015_14,
                    R.string._2015_15,
                    R.string._2015_16,
                    R.string._2015_17,
                    R.string._2015_18,
                    R.string._2015_19,
                    R.string._2015_20,
                    R.string._2015_21,
                    R.string._2015_22,
                    R.string._2015_23,
                    R.string._2015_24,
                    R.string._2015_25,
                    R.string._2015_26,
                    R.string._2015_27,
                    R.string._2015_28,
                    R.string._2015_29,
                    R.string._2015_30,
                    R.string._2015_31,
                    R.string._2015_32,
                    R.string._2015_33,
                    R.string._2015_34,
                    R.string._2015_35,
                    R.string._2015_36,
                    R.string._2015_37,
                    R.string._2015_38,
                    R.string._2015_39,
                    R.string._2015_40
            },
            //2016
            {
                    R.string._2016_1,
                    R.string._2016_2,
                    R.string._2016_3,
                    R.string._2016_4,
                    R.string._2016_5,
                    R.string._2016_6,
                    R.string._2016_7,
                    R.string._2016_8,
                    R.string._2016_9,
                    R.string._2016_10,
                    R.string._2016_11,
                    R.string._2016_12,
                    R.string._2016_13,
                    R.string._2016_14,
                    R.string._2016_15,
                    R.string._2016_16,
                    R.string._2016_17,
                    R.string._2016_18,
                    R.string._2016_19,
                    R.string._2016_20,
                    R.string._2016_21,
                    R.string._2016_22,
                    R.string._2016_23,
                    R.string._2016_24,
                    R.string._2016_25,
                    R.string._2016_26,
                    R.string._2016_27,
                    R.string._2016_28,
                    R.string._2016_29,
                    R.string._2016_30,
                    R.string._2016_31,
                    R.string._2016_32,
                    R.string._2016_33,
                    R.string._2016_34,
                    R.string._2016_35,
                    R.string._2016_36,
                    R.string._2016_37,
                    R.string._2016_38,
                    R.string._2016_39,
                    R.string._2016_40
            }
    };
    int[][][][] alternativas = {
            //2013
            {
                    //Questão 1
                    {
                            {R.string._1a, 0},
                            {R.string._1b, 0},
                            {R.string._1c, 1},
                            {R.string._1d, 0},
                            {R.string._1e, 0}
                    },
                    //Questão 2
                    {
                            {R.string._2a, 0},
                            {R.string._2b, 1},
                            {R.string._2c, 0},
                            {R.string._2d, 0},
                            {R.string._2e, 0}
                    },
                    //Questão 3
                    {
                            {R.string._3a, 0},
                            {R.string._3b, 0},
                            {R.string._3c, 0},
                            {R.string._3d, 1},
                            {R.string._3e, 0}
                    },
                    //Questão 4
                    {
                            {R.string._4a, 0},
                            {R.string._4b, 0},
                            {R.string._4c, 0},
                            {R.string._4d, 1},
                            {R.string._4e, 0}
                    },
                    //Questão 5
                    {
                            {R.string._5a, 0},
                            {R.string._5b, 1},
                            {R.string._5c, 0},
                            {R.string._5d, 0},
                            {R.string._5e, 0}
                    },
                    //Questão 6
                    {
                            {R.string._6a, 0},
                            {R.string._6b, 0},
                            {R.string._6c, 0},
                            {R.string._6d, 0},
                            {R.string._6e, 1}
                    },
                    //Questão 7
                    {
                            {R.string._7a, 1},
                            {R.string._7b, 0},
                            {R.string._7c, 0},
                            {R.string._7d, 0},
                            {R.string._7e, 0}
                    },
                    //Questão 8
                    {
                            {R.string._8a, 0},
                            {R.string._8b, 0},
                            {R.string._8c, 0},
                            {R.string._8d, 1},
                            {R.string._8e, 0}
                    },
                    //Questão 9
                    {
                            {R.string._9a, 0},
                            {R.string._9b, 1},
                            {R.string._9c, 0},
                            {R.string._9c, 0},
                            {R.string._9e, 0}
                    },

                    //Questão 10
                    {
                            {R.string._10a, 1},
                            {R.string._10b, 0},
                            {R.string._10c, 0},
                            {R.string._10d, 0},
                            {R.string._10e, 0}
                    },
                    //Questão 11
                    {
                            {R.string._11a, 0},
                            {R.string._11b, 0},
                            {R.string._11c, 0},
                            {R.string._11d, 0},
                            {R.string._11e, 1}
                    },//Questão 12
                    {
                            {R.string._12a, 1},
                            {R.string._12b, 0},
                            {R.string._12c, 0},
                            {R.string._12d, 0},
                            {R.string._12e, 0}
                    },
                    //OLHAR RESTO DO GABARITO... 0 PARA ALTERNATIVAS ERRADAS E 1 PARA AS CERTAS... ISSSO SERÁ SOMADO A NOTA A CADA VEZ QUE O USUÁRIO ACERTAR
                    //Questão 13
                    {
                            {R.string._13a, 0},
                            {R.string._13b, 0},
                            {R.string._13c, 1},
                            {R.string._13d, 0},
                            {R.string._13e, 0}
                    },
                    //Questão 14
                    {
                            {R.string._14a, 0},
                            {R.string._14b, 0},
                            {R.string._14c, 0},
                            {R.string._14d, 1},
                            {R.string._14e, 0}
                    },
                    //Questão 15
                    {
                            {R.string._15a, 0},
                            {R.string._15b, 0},
                            {R.string._15c, 0},
                            {R.string._15d, 0},
                            {R.string._15e, 1}
                    },
                    //Questão 16
                    {
                            {R.string._16a, 0},
                            {R.string._16b, 0},
                            {R.string._16c, 1},
                            {R.string._16d, 0},
                            {R.string._16e, 0}
                    },
                    //Questão 17
                    {
                            {R.string._17a, 0},
                            {R.string._17b, 0},
                            {R.string._17c, 1},
                            {R.string._17d, 0},
                            {R.string._17e, 0}
                    },
                    //Questão 18
                    {
                            {R.string._18a, 0},
                            {R.string._18b, 1},
                            {R.string._18c, 0},
                            {R.string._18d, 0},
                            {R.string._18e, 0}
                    },
                    //Questão 19
                    {
                            {R.string._19a, 0},
                            {R.string._19b, 0},
                            {R.string._19c, 1},
                            {R.string._19d, 0},
                            {R.string._19e, 0}
                    },
                    //Questão 20
                    {
                            {R.string._20a, 0},
                            {R.string._20b, 0},
                            {R.string._20c, 1},
                            {R.string._20d, 0},
                            {R.string._20e, 0}
                    },
                    //Questão 21
                    {
                            {R.string._21a, 0},
                            {R.string._21b, 0},
                            {R.string._21c, 0},
                            {R.string._21d, 0},
                            {R.string._21e, 1}
                    },
                    //Questão 22
                    {
                            {R.string._22a, 0},
                            {R.string._22b, 0},
                            {R.string._22c, 1},
                            {R.string._22d, 0},
                            {R.string._22e, 0}
                    },
                    //Questão 23
                    {
                            {R.string._23a, 0},
                            {R.string._23b, 0},
                            {R.string._23c, 1},
                            {R.string._23d, 0},
                            {R.string._23e, 0}
                    },
                    //Questão 24
                    {
                            {R.string._24a, 0},
                            {R.string._24b, 0},
                            {R.string._24c, 0},
                            {R.string._24d, 1},
                            {R.string._24e, 0}
                    },
                    //Questão 25
                    {
                            {R.string._25a, 1},
                            {R.string._25b, 0},
                            {R.string._25c, 0},
                            {R.string._25d, 0},
                            {R.string._25e, 0}
                    },
                    //Questão 26
                    {
                            {R.string._26a, 0},
                            {R.string._26b, 0},
                            {R.string._26c, 0},
                            {R.string._26d, 0},
                            {R.string._26e, 1}
                    },

                    //Questão 27
                    {
                            {R.string._27a, 0},
                            {R.string._27b, 0},
                            {R.string._27c, 0},
                            {R.string._27d, 1},
                            {R.string._27e, 0}
                    },

                    //Questão 28
                    {
                            {R.string._28a, 0},
                            {R.string._28b, 0},
                            {R.string._28c, 0},
                            {R.string._28d, 0},
                            {R.string._28e, 1}
                    },


                    //Questão 29
                    {
                            {R.string._29a, 0},
                            {R.string._29b, 0},
                            {R.string._29c, 0},
                            {R.string._29d, 0},
                            {R.string._29e, 1}
                    },


                    //Questão 30
                    {
                            {R.string._30a, 1},
                            {R.string._30b, 0},
                            {R.string._30c, 0},
                            {R.string._30d, 0},
                            {R.string._30e, 0}
                    },

                    //Questão 31
                    {
                            {R.string._31a, 0},
                            {R.string._31b, 1},
                            {R.string._31c, 0},
                            {R.string._31d, 0},
                            {R.string._31e, 0}
                    },
                    //Questão 32
                    {
                            {R.string._32a, 0},
                            {R.string._32b, 0},
                            {R.string._32c, 1},
                            {R.string._32d, 0},
                            {R.string._32e, 0}
                    },
                    //Questão 33
                    {
                            {R.string._33a, 1},
                            {R.string._33b, 0},
                            {R.string._33c, 0},
                            {R.string._33d, 0},
                            {R.string._33e, 0}
                    },
                    //Questão 34
                    {
                            {R.string._34a, 0},
                            {R.string._34b, 1},
                            {R.string._34c, 0},
                            {R.string._34d, 0},
                            {R.string._34e, 0}
                    },
                    //Questão 35
                    {
                            {R.string._35a, 1},
                            {R.string._35b, 0},
                            {R.string._35c, 0},
                            {R.string._35d, 0},
                            {R.string._35e, 0}
                    },
                    //Questão 36
                    {
                            {R.string._36a, 0},
                            {R.string._36b, 1},
                            {R.string._36c, 0},
                            {R.string._36d, 0},
                            {R.string._36e, 0}
                    },
                    //Questão 37
                    {
                            {R.string._37a, 0},
                            {R.string._37b, 0},
                            {R.string._37c, 1},
                            {R.string._37d, 0},
                            {R.string._37e, 0}
                    },
                    //Questão 38
                    {
                            {R.string._38a, 0},
                            {R.string._38b, 1},
                            {R.string._38c, 0},
                            {R.string._38d, 0},
                            {R.string._38e, 0}
                    },
                    //Questão 39
                    {
                            {R.string._39a, 0},
                            {R.string._39b, 0},
                            {R.string._39c, 1},
                            {R.string._39d, 0},
                            {R.string._39e, 0}
                    },

                    //Questão 40
                    {
                            {R.string._40a, 1},
                            {R.string._40b, 1},
                            {R.string._40c, 1},
                            {R.string._40d, 1},
                            {R.string._40e, 1}
                    }

            },
            //2014
            {
                            //Questão 1
                            {
                                    {R.string._2014_1a, 0},
                                    {R.string._2014_1b, 0},
                                    {R.string._2014_1c, 1},
                                    {R.string._2014_1d, 0},
                                    {R.string._2014_1e, 0}
                            },
                            //Questão 2
                            {
                                    {R.string._2014_2a, 0},
                                    {R.string._2014_2b, 1},
                                    {R.string._2014_2c, 0},
                                    {R.string._2014_2d, 0},
                                    {R.string._2014_2e, 0}
                            },
                            //Questão 3
                            {
                                    {R.string._2014_3a, 1},
                                    {R.string._2014_3b, 1},
                                    {R.string._2014_3c, 1},
                                    {R.string._2014_3d, 1},
                                    {R.string._2014_3e, 1}
                            },
                            //Questão 4
                            {
                                    {R.string._2014_4a, 1},
                                    {R.string._2014_4b, 0},
                                    {R.string._2014_4c, 0},
                                    {R.string._2014_4d, 0},
                                    {R.string._2014_4e, 0}
                            },
                            //Questão 5
                            {
                                    {R.string._2014_5a, 0},
                                    {R.string._2014_5b, 1},
                                    {R.string._2014_5c, 0},
                                    {R.string._2014_5d, 0},
                                    {R.string._2014_5e, 0}
                            },
                            //Questão 6
                            {
                                    {R.string._2014_6a, 0},
                                    {R.string._2014_6b, 0},
                                    {R.string._2014_6c, 1},
                                    {R.string._2014_6d, 0},
                                    {R.string._2014_6e, 0}
                            },
                            //Questão 7
                            {
                                    {R.string._2014_7a, 0},
                                    {R.string._2014_7b, 1},
                                    {R.string._2014_7c, 0},
                                    {R.string._2014_7d, 0},
                                    {R.string._2014_7e, 0}
                            },
                            //Questão 8
                            {
                                    {R.string._2014_8a, 0},
                                    {R.string._2014_8b, 0},
                                    {R.string._2014_8c, 0},
                                    {R.string._2014_8d, 0},
                                    {R.string._2014_8e, 1}
                            },
                            //Questão 9
                            {
                                    {R.string._2014_9a, 0},
                                    {R.string._2014_9b, 1},
                                    {R.string._2014_9c, 0},
                                    {R.string._2014_9c, 0},
                                    {R.string._2014_9e, 0}
                            },

                            //Questão 10
                            {
                                    {R.string._2014_10a, 0},
                                    {R.string._2014_10b, 0},
                                    {R.string._2014_10c, 0},
                                    {R.string._2014_10d, 0},
                                    {R.string._2014_10e, 1}
                            },
                            //Questão 11
                            {
                                    {R.string._2014_11a, 0},
                                    {R.string._2014_11b, 0},
                                    {R.string._2014_11c, 0},
                                    {R.string._2014_11d, 0},
                                    {R.string._2014_11e, 1}
                            },//Questão 12
                            {
                                    {R.string._2014_12a, 1},
                                    {R.string._2014_12b, 0},
                                    {R.string._2014_12c, 0},
                                    {R.string._2014_12d, 0},
                                    {R.string._2014_12e, 0}
                            },
                            //OLHAR RESTO DO GABARITO... 0 PARA ALTERNATIVAS ERRADAS E 1 PARA AS CERTAS... ISSSO SERÁ SOMADO A NOTA A CADA VEZ QUE O USUÁRIO ACERTAR
                            //Questão 13
                            {
                                    {R.string._2014_13a, 0},
                                    {R.string._2014_13b, 0},
                                    {R.string._2014_13c, 1},
                                    {R.string._2014_13d, 0},
                                    {R.string._2014_13e, 0}
                            },
                            //Questão 14
                            {
                                    {R.string._2014_14a, 0},
                                    {R.string._2014_14b, 1},
                                    {R.string._2014_14c, 0},
                                    {R.string._2014_14d, 0},
                                    {R.string._2014_14e, 0}
                            },
                            //Questão 15
                            {
                                    {R.string._2014_15a, 0},
                                    {R.string._2014_15b, 1},
                                    {R.string._2014_15c, 0},
                                    {R.string._2014_15d, 0},
                                    {R.string._2014_15e, 0}
                            },
                            //Questão 16
                            {
                                    {R.string._2014_16a, 0},
                                    {R.string._2014_16b, 0},
                                    {R.string._2014_16c, 0},
                                    {R.string._2014_16d, 0},
                                    {R.string._2014_16e, 1}
                            },
                            //Questão 17
                            {
                                    {R.string._2014_17a, 0},
                                    {R.string._2014_17b, 0},
                                    {R.string._2014_17c, 0},
                                    {R.string._2014_17d, 1},
                                    {R.string._2014_17e, 0}
                            },
                            //Questão 18
                            {
                                    {R.string._2014_18a, 0},
                                    {R.string._2014_18b, 0},
                                    {R.string._2014_18c, 0},
                                    {R.string._2014_18d, 1},
                                    {R.string._2014_18e, 0}
                            },
                            //Questão 19
                            {
                                    {R.string._2014_19a, 0},
                                    {R.string._2014_19b, 0},
                                    {R.string._2014_19c, 0},
                                    {R.string._2014_19d, 0},
                                    {R.string._2014_19e, 1}
                            },
                            //Questão 20
                            {
                                    {R.string._2014_20a, 0},
                                    {R.string._2014_20b, 1},
                                    {R.string._2014_20c, 0},
                                    {R.string._2014_20d, 0},
                                    {R.string._2014_20e, 0}
                            },
                            //Questão 21
                            {
                                    {R.string._2014_21a, 0},
                                    {R.string._2014_21b, 0},
                                    {R.string._2014_21c, 0},
                                    {R.string._2014_21d, 1},
                                    {R.string._2014_21e, 0}
                            },
                            //Questão 22
                            {
                                    {R.string._2014_22a, 0},
                                    {R.string._2014_22b, 0},
                                    {R.string._2014_22c, 0},
                                    {R.string._2014_22d, 0},
                                    {R.string._2014_22e, 1}
                            },
                            //Questão 23
                            {
                                    {R.string._2014_23a, 0},
                                    {R.string._2014_23b, 1},
                                    {R.string._2014_23c, 0},
                                    {R.string._2014_23d, 0},
                                    {R.string._2014_23e, 0}
                            },
                            //Questão 24
                            {
                                    {R.string._2014_24a, 0},
                                    {R.string._2014_24b, 0},
                                    {R.string._2014_24c, 0},
                                    {R.string._2014_24d, 1},
                                    {R.string._2014_24e, 0}
                            },
                            //Questão 25
                            {
                                    {R.string._2014_25a, 1},
                                    {R.string._2014_25b, 0},
                                    {R.string._2014_25c, 0},
                                    {R.string._2014_25d, 0},
                                    {R.string._2014_25e, 0}
                            },
                            //Questão 26
                            {
                                    {R.string._2014_26a, 0},
                                    {R.string._2014_26b, 0},
                                    {R.string._2014_26c, 1},
                                    {R.string._2014_26d, 0},
                                    {R.string._2014_26e, 0}
                            },

                            //Questão 27
                            {
                                    {R.string._2014_27a, 0},
                                    {R.string._2014_27b, 0},
                                    {R.string._2014_27c, 0},
                                    {R.string._2014_27d, 1},
                                    {R.string._2014_27e, 0}
                            },

                            //Questão 28
                            {
                                    {R.string._2014_28a, 0},
                                    {R.string._2014_28b, 0},
                                    {R.string._2014_28c, 1},
                                    {R.string._2014_28d, 0},
                                    {R.string._2014_28e, 0}
                            },


                            //Questão 29
                            {
                                    {R.string._2014_29a, 0},
                                    {R.string._2014_29b, 0},
                                    {R.string._2014_29c, 0},
                                    {R.string._2014_29d, 0},
                                    {R.string._2014_29e, 1}
                            },


                            //Questão 30
                            {
                                    {R.string._2014_30a, 0},
                                    {R.string._2014_30b, 1},
                                    {R.string._2014_30c, 0},
                                    {R.string._2014_30d, 0},
                                    {R.string._2014_30e, 0}
                            },

                            //Questão 31
                            {
                                    {R.string._2014_31a, 1},
                                    {R.string._2014_31b, 0},
                                    {R.string._2014_31c, 0},
                                    {R.string._2014_31d, 0},
                                    {R.string._2014_31e, 0}
                            },
                            //Questão 32
                            {
                                    {R.string._2014_32a, 0},
                                    {R.string._2014_32b, 0},
                                    {R.string._2014_32c, 0},
                                    {R.string._2014_32d, 0},
                                    {R.string._2014_32e, 1}
                            },
                            //Questão 33
                            {
                                    {R.string._2014_33a, 1},
                                    {R.string._2014_33b, 0},
                                    {R.string._2014_33c, 0},
                                    {R.string._2014_33d, 0},
                                    {R.string._2014_33e, 0}
                            },
                            //Questão 34
                            {
                                    {R.string._2014_34a, 1},
                                    {R.string._2014_34b, 0},
                                    {R.string._2014_34c, 0},
                                    {R.string._2014_34d, 0},
                                    {R.string._2014_34e, 0}
                            },
                            //Questão 35
                            {
                                    {R.string._2014_35a, 0},
                                    {R.string._2014_35b, 0},
                                    {R.string._2014_35c, 0},
                                    {R.string._2014_35d, 1},
                                    {R.string._2014_35e, 0}
                            },
                            //Questão 36
                            {
                                    {R.string._2014_36a, 0},
                                    {R.string._2014_36b, 0},
                                    {R.string._2014_36c, 0},
                                    {R.string._2014_36d, 1},
                                    {R.string._2014_36e, 0}
                            },
                            //Questão 37
                            {
                                    {R.string._2014_37a, 0},
                                    {R.string._2014_37b, 1},
                                    {R.string._2014_37c, 0},
                                    {R.string._2014_37d, 0},
                                    {R.string._2014_37e, 0}
                            },
                            //Questão 38
                            {
                                    {R.string._2014_38a, 1},
                                    {R.string._2014_38b, 0},
                                    {R.string._2014_38c, 0},
                                    {R.string._2014_38d, 0},
                                    {R.string._2014_38e, 0}
                            },
                            //Questão 39
                            {
                                    {R.string._2014_39a, 0},
                                    {R.string._2014_39b, 0},
                                    {R.string._2014_39c, 0},
                                    {R.string._2014_39d, 1},
                                    {R.string._2014_39e, 0}
                            },

                            //Questão 40
                            {
                                    {R.string._2014_40a, 0},
                                    {R.string._2014_40b, 1},
                                    {R.string._2014_40c, 0},
                                    {R.string._2014_40d, 0},
                                    {R.string._2014_40e, 0}
                            }
            },
            //2015
            {
                    //Questão 1
                    {
                            {R.string._2015_1a, 0},
                            {R.string._2015_1b, 1},
                            {R.string._2015_1c, 0},
                            {R.string._2015_1d, 0},
                            {R.string._2015_1e, 0}
                    },
                    //Questão 2
                    {
                            {R.string._2015_2a, 0},
                            {R.string._2015_2b, 0},
                            {R.string._2015_2c, 0},
                            {R.string._2015_2d, 1},
                            {R.string._2015_2e, 0}
                    },
                    //Questão 3
                    {
                            {R.string._2015_3a, 0},
                            {R.string._2015_3b, 0},
                            {R.string._2015_3c, 0},
                            {R.string._2015_3d, 1},
                            {R.string._2015_3e, 0}
                    },
                    //Questão 4
                    {
                            {R.string._2015_4a, 0},
                            {R.string._2015_4b, 1},
                            {R.string._2015_4c, 0},
                            {R.string._2015_4d, 0},
                            {R.string._2015_4e, 0}
                    },
                    //Questão 5
                    {
                            {R.string._2015_5a, 0},
                            {R.string._2015_5b, 1},
                            {R.string._2015_5c, 0},
                            {R.string._2015_5d, 0},
                            {R.string._2015_5e, 0}
                    },
                    //Questão 6
                    {
                            {R.string._2015_6a, 0},
                            {R.string._2015_6b, 0},
                            {R.string._2015_6c, 0},
                            {R.string._2015_6d, 0},
                            {R.string._2015_6e, 1}
                    },
                    //Questão 7
                    {
                            {R.string._2015_7a, 1},
                            {R.string._2015_7b, 0},
                            {R.string._2015_7c, 0},
                            {R.string._2015_7d, 0},
                            {R.string._2015_7e, 0}
                    },
                    //Questão 8
                    {
                            {R.string._2015_8a, 1},
                            {R.string._2015_8b, 0},
                            {R.string._2015_8c, 0},
                            {R.string._2015_8d, 0},
                            {R.string._2015_8e, 0}
                    },
                    //Questão 9
                    {
                            {R.string._2015_9a, 0},
                            {R.string._2015_9b, 0},
                            {R.string._2015_9c, 1},
                            {R.string._2015_9c, 0},
                            {R.string._2015_9e, 0}
                    },

                    //Questão 10
                    {
                            {R.string._2015_10a, 0},
                            {R.string._2015_10b, 0},
                            {R.string._2015_10c, 1},
                            {R.string._2015_10d, 0},
                            {R.string._2015_10e, 0}
                    },
                    //Questão 11
                    {
                            {R.string._2015_11a, 1},
                            {R.string._2015_11b, 0},
                            {R.string._2015_11c, 0},
                            {R.string._2015_11d, 0},
                            {R.string._2015_11e, 0}
                    },//Questão 12
                    {
                            {R.string._2015_12a, 0},
                            {R.string._2015_12b, 1},
                            {R.string._2015_12c, 0},
                            {R.string._2015_12d, 0},
                            {R.string._2015_12e, 0}
                    },
                    //OLHAR RESTO DO GABARITO... 0 PARA ALTERNATIVAS ERRADAS E 1 PARA AS CERTAS... ISSSO SERÁ SOMADO A NOTA A CADA VEZ QUE O USUÁRIO ACERTAR
                    //Questão 13
                    {
                            {R.string._2015_13a, 0},
                            {R.string._2015_13b, 0},
                            {R.string._2015_13c, 0},
                            {R.string._2015_13d, 1},
                            {R.string._2015_13e, 0}
                    },
                    //Questão 14
                    {
                            {R.string._2015_14a, 0},
                            {R.string._2015_14b, 0},
                            {R.string._2015_14c, 1},
                            {R.string._2015_14d, 0},
                            {R.string._2015_14e, 0}
                    },
                    //Questão 15
                    {
                            {R.string._2015_15a, 0},
                            {R.string._2015_15b, 0},
                            {R.string._2015_15c, 1},
                            {R.string._2015_15d, 0},
                            {R.string._2015_15e, 0}
                    },
                    //Questão 16
                    {
                            {R.string._2015_16a, 0},
                            {R.string._2015_16b, 0},
                            {R.string._2015_16c, 0},
                            {R.string._2015_16d, 1},
                            {R.string._2015_16e, 0}
                    },
                    //Questão 17
                    {
                            {R.string._2015_17a, 1},
                            {R.string._2015_17b, 0},
                            {R.string._2015_17c, 0},
                            {R.string._2015_17d, 0},
                            {R.string._2015_17e, 0}
                    },
                    //Questão 18
                    {
                            {R.string._2015_18a, 0},
                            {R.string._2015_18b, 0},
                            {R.string._2015_18c, 0},
                            {R.string._2015_18d, 0},
                            {R.string._2015_18e, 1}
                    },
                    //Questão 19
                    {
                            {R.string._2015_19a, 0},
                            {R.string._2015_19b, 1},
                            {R.string._2015_19c, 0},
                            {R.string._2015_19d, 0},
                            {R.string._2015_19e, 0}
                    },
                    //Questão 20
                    {
                            {R.string._2015_20a, 0},
                            {R.string._2015_20b, 0},
                            {R.string._2015_20c, 0},
                            {R.string._2015_20d, 1},
                            {R.string._2015_20e, 0}
                    },
                    //Questão 21
                    {
                            {R.string._2015_21a, 0},
                            {R.string._2015_21b, 0},
                            {R.string._2015_21c, 1},
                            {R.string._2015_21d, 0},
                            {R.string._2015_21e, 0}
                    },
                    //Questão 22
                    {
                            {R.string._2015_22a, 0},
                            {R.string._2015_22b, 0},
                            {R.string._2015_22c, 0},
                            {R.string._2015_22d, 0},
                            {R.string._2015_22e, 1}
                    },
                    //Questão 23
                    {
                            {R.string._2015_23a, 0},
                            {R.string._2015_23b, 0},
                            {R.string._2015_23c, 0},
                            {R.string._2015_23d, 1},
                            {R.string._2015_23e, 0}
                    },
                    //Questão 24
                    {
                            {R.string._2015_24a, 0},
                            {R.string._2015_24b, 1},
                            {R.string._2015_24c, 0},
                            {R.string._2015_24d, 0},
                            {R.string._2015_24e, 0}
                    },
                    //Questão 25
                    {
                            {R.string._2015_25a, 0},
                            {R.string._2015_25b, 0},
                            {R.string._2015_25c, 0},
                            {R.string._2015_25d, 0},
                            {R.string._2015_25e, 1}
                    },
                    //Questão 26
                    {
                            {R.string._2015_26a, 0},
                            {R.string._2015_26b, 1},
                            {R.string._2015_26c, 0},
                            {R.string._2015_26d, 0},
                            {R.string._2015_26e, 0}
                    },

                    //Questão 27
                    {
                            {R.string._2015_27a, 0},
                            {R.string._2015_27b, 0},
                            {R.string._2015_27c, 1},
                            {R.string._2015_27d, 0},
                            {R.string._2015_27e, 0}
                    },

                    //Questão 28
                    {
                            {R.string._2015_28a, 1},
                            {R.string._2015_28b, 1},
                            {R.string._2015_28c, 1},
                            {R.string._2015_28d, 1},
                            {R.string._2015_28e, 1}
                    },


                    //Questão 29
                    {
                            {R.string._2015_29a, 0},
                            {R.string._2015_29b, 0},
                            {R.string._2015_29c, 0},
                            {R.string._2015_29d, 0},
                            {R.string._2015_29e, 1}
                    },


                    //Questão 30
                    {
                            {R.string._2015_30a, 1},
                            {R.string._2015_30b, 1},
                            {R.string._2015_30c, 1},
                            {R.string._2015_30d, 1},
                            {R.string._2015_30e, 1}
                    },

                    //Questão 31
                    {
                            {R.string._2015_31a, 0},
                            {R.string._2015_31b, 0},
                            {R.string._2015_31c, 0},
                            {R.string._2015_31d, 1},
                            {R.string._2015_31e, 0}
                    },
                    //Questão 32
                    {
                            {R.string._2015_32a, 1},
                            {R.string._2015_32b, 0},
                            {R.string._2015_32c, 0},
                            {R.string._2015_32d, 0},
                            {R.string._2015_32e, 0}
                    },
                    //Questão 33
                    {
                            {R.string._2015_33a, 1},
                            {R.string._2015_33b, 1},
                            {R.string._2015_33c, 1},
                            {R.string._2015_33d, 1},
                            {R.string._2015_33e, 1}
                    },
                    //Questão 34
                    {
                            {R.string._2015_34a, 0},
                            {R.string._2015_34b, 1},
                            {R.string._2015_34c, 0},
                            {R.string._2015_34d, 0},
                            {R.string._2015_34e, 0}
                    },
                    //Questão 35
                    {
                            {R.string._2015_35a, 0},
                            {R.string._2015_35b, 0},
                            {R.string._2015_35c, 0},
                            {R.string._2015_35d, 1},
                            {R.string._2015_35e, 0}
                    },
                    //Questão 36
                    {
                            {R.string._2015_36a, 1},
                            {R.string._2015_36b, 1},
                            {R.string._2015_36c, 1},
                            {R.string._2015_36d, 1},
                            {R.string._2015_36e, 1}
                    },
                    //Questão 37
                    {
                            {R.string._2015_37a, 0},
                            {R.string._2015_37b, 0},
                            {R.string._2015_37c, 1},
                            {R.string._2015_37d, 0},
                            {R.string._2015_37e, 0}
                    },
                    //Questão 38
                    {
                            {R.string._2015_38a, 1},
                            {R.string._2015_38b, 0},
                            {R.string._2015_38c, 0},
                            {R.string._2015_38d, 0},
                            {R.string._2015_38e, 0}
                    },
                    //Questão 39
                    {
                            {R.string._2015_39a, 1},
                            {R.string._2015_39b, 0},
                            {R.string._2015_39c, 0},
                            {R.string._2015_39d, 0},
                            {R.string._2015_39e, 0}
                    },

                    //Questão 40
                    {
                            {R.string._2015_40a, 0},
                            {R.string._2015_40b, 0},
                            {R.string._2015_40c, 1},
                            {R.string._2015_40d, 0},
                            {R.string._2015_40e, 0}
                    }
            },
            //2016
            {
                    //Questão 1
                    {
                            {R.string._2016_1a, 1},
                            {R.string._2016_1b, 0},
                            {R.string._2016_1c, 0},
                            {R.string._2016_1d, 0},
                            {R.string._2016_1e, 0}
                    },
                    //Questão 2
                    {
                            {R.string._2016_2a, 0},
                            {R.string._2016_2b, 1},
                            {R.string._2016_2c, 0},
                            {R.string._2016_2d, 0},
                            {R.string._2016_2e, 0}
                    },
                    //Questão 3
                    {
                            {R.string._2016_3a, 1},
                            {R.string._2016_3b, 0},
                            {R.string._2016_3c, 0},
                            {R.string._2016_3d, 0},
                            {R.string._2016_3e, 0}
                    },
                    //Questão 4
                    {
                            {R.string._2016_4a, 0},
                            {R.string._2016_4b, 0},
                            {R.string._2016_4c, 0},
                            {R.string._2016_4d, 1},
                            {R.string._2016_4e, 0}
                    },
                    //Questão 5
                    {
                            {R.string._2016_5a, 0},
                            {R.string._2016_5b, 0},
                            {R.string._2016_5c, 1},
                            {R.string._2016_5d, 0},
                            {R.string._2016_5e, 0}
                    },
                    //Questão 6
                    {
                            {R.string._2016_6a, 0},
                            {R.string._2016_6b, 1},
                            {R.string._2016_6c, 0},
                            {R.string._2016_6d, 0},
                            {R.string._2016_6e, 0}
                    },
                    //Questão 7
                    {
                            {R.string._2016_7a, 0},
                            {R.string._2016_7b, 0},
                            {R.string._2016_7c, 0},
                            {R.string._2016_7d, 1},
                            {R.string._2016_7e, 0}
                    },
                    //Questão 8
                    {
                            {R.string._2016_8a, 0},
                            {R.string._2016_8b, 0},
                            {R.string._2016_8c, 0},
                            {R.string._2016_8d, 0},
                            {R.string._2016_8e, 1}
                    },
                    //Questão 9
                    {
                            {R.string._2016_9a, 1},
                            {R.string._2016_9b, 0},
                            {R.string._2016_9c, 0},
                            {R.string._2016_9c, 0},
                            {R.string._2016_9e, 0}
                    },

                    //Questão 10
                    {
                            {R.string._2016_10a, 1},
                            {R.string._2016_10b, 0},
                            {R.string._2016_10c, 0},
                            {R.string._2016_10d, 0},
                            {R.string._2016_10e, 1}
                    },
                    //Questão 11
                    {
                            {R.string._2016_11a, 1},
                            {R.string._2016_11b, 0},
                            {R.string._2016_11c, 0},
                            {R.string._2016_11d, 0},
                            {R.string._2016_11e, 0}
                    },//Questão 12
                    {
                            {R.string._2016_12a, 0},
                            {R.string._2016_12b, 1},
                            {R.string._2016_12c, 0},
                            {R.string._2016_12d, 0},
                            {R.string._2016_12e, 0}
                    },
                    //OLHAR RESTO DO GABARITO... 0 PARA ALTERNATIVAS ERRADAS E 1 PARA AS CERTAS... ISSSO SERÁ SOMADO A NOTA A CADA VEZ QUE O USUÁRIO ACERTAR
                    //Questão 13
                    {
                            {R.string._2016_13a, 0},
                            {R.string._2016_13b, 0},
                            {R.string._2016_13c, 1},
                            {R.string._2016_13d, 0},
                            {R.string._2016_13e, 0}
                    },
                    //Questão 14
                    {
                            {R.string._2016_14a, 0},
                            {R.string._2016_14b, 0},
                            {R.string._2016_14c, 0},
                            {R.string._2016_14d, 1},
                            {R.string._2016_14e, 0}
                    },
                    //Questão 15
                    {
                            {R.string._2016_15a, 0},
                            {R.string._2016_15b, 0},
                            {R.string._2016_15c, 1},
                            {R.string._2016_15d, 0},
                            {R.string._2016_15e, 0}
                    },
                    //Questão 16
                    {
                            {R.string._2016_16a, 0},
                            {R.string._2016_16b, 0},
                            {R.string._2016_16c, 0},
                            {R.string._2016_16d, 0},
                            {R.string._2016_16e, 1}
                    },
                    //Questão 17
                    {
                            {R.string._2016_17a, 1},
                            {R.string._2016_17b, 0},
                            {R.string._2016_17c, 0},
                            {R.string._2016_17d, 0},
                            {R.string._2016_17e, 0}
                    },
                    //Questão 18
                    {
                            {R.string._2016_18a, 0},
                            {R.string._2016_18b, 0},
                            {R.string._2016_18c, 0},
                            {R.string._2016_18d, 0},
                            {R.string._2016_18e, 1}
                    },
                    //Questão 19
                    {
                            {R.string._2016_19a, 0},
                            {R.string._2016_19b, 0},
                            {R.string._2016_19c, 0},
                            {R.string._2016_19d, 1},
                            {R.string._2016_19e, 0}
                    },
                    //Questão 20
                    {
                            {R.string._2016_20a, 1},
                            {R.string._2016_20b, 0},
                            {R.string._2016_20c, 0},
                            {R.string._2016_20d, 0},
                            {R.string._2016_20e, 0}
                    },
                    //Questão 21
                    {
                            {R.string._2016_21a, 0},
                            {R.string._2016_21b, 0},
                            {R.string._2016_21c, 1},
                            {R.string._2016_21d, 0},
                            {R.string._2016_21e, 0}
                    },
                    //Questão 22
                    {
                            {R.string._2016_22a, 0},
                            {R.string._2016_22b, 0},
                            {R.string._2016_22c, 0},
                            {R.string._2016_22d, 0},
                            {R.string._2016_22e, 1}
                    },
                    //Questão 23
                    {
                            {R.string._2016_23a, 0},
                            {R.string._2016_23b, 1},
                            {R.string._2016_23c, 0},
                            {R.string._2016_23d, 0},
                            {R.string._2016_23e, 0}
                    },
                    //Questão 24
                    {
                            {R.string._2016_24a, 0},
                            {R.string._2016_24b, 0},
                            {R.string._2016_24c, 0},
                            {R.string._2016_24d, 0},
                            {R.string._2016_24e, 1}
                    },
                    //Questão 25
                    {
                            {R.string._2016_25a, 0},
                            {R.string._2016_25b, 0},
                            {R.string._2016_25c, 0},
                            {R.string._2016_25d, 0},
                            {R.string._2016_25e, 1}
                    },
                    //Questão 26
                    {
                            {R.string._2016_26a, 0},
                            {R.string._2016_26b, 0},
                            {R.string._2016_26c, 0},
                            {R.string._2016_26d, 1},
                            {R.string._2016_26e, 0}
                    },

                    //Questão 27
                    {
                            {R.string._2016_27a, 0},
                            {R.string._2016_27b, 0},
                            {R.string._2016_27c, 1},
                            {R.string._2016_27d, 0},
                            {R.string._2016_27e, 0}
                    },

                    //Questão 28
                    {
                            {R.string._2016_28a, 1},
                            {R.string._2016_28b, 1},
                            {R.string._2016_28c, 1},
                            {R.string._2016_28d, 1},
                            {R.string._2016_28e, 1}
                    },


                    //Questão 29
                    {
                            {R.string._2016_29a, 0},
                            {R.string._2016_29b, 1},
                            {R.string._2016_29c, 0},
                            {R.string._2016_29d, 0},
                            {R.string._2016_29e, 0}
                    },


                    //Questão 30
                    {
                            {R.string._2016_30a, 0},
                            {R.string._2016_30b, 0},
                            {R.string._2016_30c, 1},
                            {R.string._2016_30d, 0},
                            {R.string._2016_30e, 0}
                    },

                    //Questão 31
                    {
                            {R.string._2016_31a, 0},
                            {R.string._2016_31b, 1},
                            {R.string._2016_31c, 0},
                            {R.string._2016_31d, 0},
                            {R.string._2016_31e, 0}
                    },
                    //Questão 32
                    {
                            {R.string._2016_32a, 0},
                            {R.string._2016_32b, 0},
                            {R.string._2016_32c, 1},
                            {R.string._2016_32d, 0},
                            {R.string._2016_32e, 0}
                    },
                    //Questão 33
                    {
                            {R.string._2016_33a, 0},
                            {R.string._2016_33b, 0},
                            {R.string._2016_33c, 1},
                            {R.string._2016_33d, 0},
                            {R.string._2016_33e, 0}
                    },
                    //Questão 34
                    {
                            {R.string._2016_34a, 0},
                            {R.string._2016_34b, 0},
                            {R.string._2016_34c, 0},
                            {R.string._2016_34d, 0},
                            {R.string._2016_34e, 1}
                    },
                    //Questão 35
                    {
                            {R.string._2016_35a, 0},
                            {R.string._2016_35b, 1},
                            {R.string._2016_35c, 0},
                            {R.string._2016_35d, 0},
                            {R.string._2016_35e, 0}
                    },
                    //Questão 36
                    {
                            {R.string._2016_36a, 0},
                            {R.string._2016_36b, 0},
                            {R.string._2016_36c, 0},
                            {R.string._2016_36d, 1},
                            {R.string._2016_36e, 0}
                    },
                    //Questão 37
                    {
                            {R.string._2016_37a, 0},
                            {R.string._2016_37b, 1},
                            {R.string._2016_37c, 0},
                            {R.string._2016_37d, 0},
                            {R.string._2016_37e, 0}
                    },
                    //Questão 38
                    {
                            {R.string._2016_38a, 1},
                            {R.string._2016_38b, 0},
                            {R.string._2016_38c, 0},
                            {R.string._2016_38d, 0},
                            {R.string._2016_38e, 0}
                    },
                    //Questão 39
                    {
                            {R.string._2016_39a, 0},
                            {R.string._2016_39b, 0},
                            {R.string._2016_39c, 0},
                            {R.string._2016_39d, 1},
                            {R.string._2016_39e, 0}
                    },

                    //Questão 40
                    {
                            {R.string._2016_40a, 0},
                            {R.string._2016_40b, 0},
                            {R.string._2016_40c, 0},
                            {R.string._2016_40d, 1},
                            {R.string._2016_40e, 0}
                    }
            }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao);
        c = (Chronometer) findViewById(R.id.cronometro);
        c.setBase(SystemClock.elapsedRealtime());
        c.start();
        question = (ImageView) findViewById(R.id.question);
        correcao = (ImageView) findViewById(R.id.correcao);

        Intent i = getIntent();
        ano = i.getIntExtra("ano", 0);

        redacao = (Button) findViewById(R.id.redacao);

        exame = (TextView) findViewById(R.id.exame);
        questao = (TextView) findViewById(R.id.questao);
        quesito = (TextView) findViewById(R.id.quesito);

        a = (RadioButton) findViewById(R.id.a);
        b = (RadioButton) findViewById(R.id.b);
        ce = (RadioButton) findViewById(R.id.c);
        d = (RadioButton) findViewById(R.id.d);
        e = (RadioButton) findViewById(R.id.e);

        atualiza();

        RadioGroup rg = (RadioGroup) findViewById(R.id.alternativas);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId){
                A = R.id.a == checkedId;
                B = R.id.b == checkedId;
                C = R.id.c == checkedId;
                D = R.id.d == checkedId;
                E = R.id.e == checkedId;
                Log.i("Aff",A+" "+B+" "+C+" "+D+" "+E);
            }
        });
    }
    public void proxima(View v){
        a.setEnabled(false);
        b.setEnabled(false);
        ce.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        if (disponibilidade) {
            correcao.setVisibility(View.VISIBLE);
            int not=0;
            if (A) {
                MainActivity.nota += alternativas[ano][MainActivity.questaoAtual][0][1];
                not = alternativas[ano][MainActivity.questaoAtual][0][1];
                if (alternativas[ano][MainActivity.questaoAtual][0][1] != 1){
                    Log.i("Teste","Veio");
                    mudarCor(0,0);
                    correcao.setImageResource(R.drawable.errado);
                }else{
                    Log.i("Teste","Pa");
                    correcao.setImageResource(R.drawable.certo);
                }
            } else if (B) {
                MainActivity.nota += alternativas[ano][MainActivity.questaoAtual][1][1];
                not = alternativas[ano][MainActivity.questaoAtual][1][1];
                if (alternativas[ano][MainActivity.questaoAtual][1][1] != 1){
                    Log.i("Teste","Veio");
                    mudarCor(1,0);
                    correcao.setImageResource(R.drawable.errado);
                }else {
                    Log.i("Teste","Pa");
                    correcao.setImageResource(R.drawable.certo);
                }
            } else if (C) {
                MainActivity.nota += alternativas[ano][MainActivity.questaoAtual][2][1];
                not = alternativas[ano][MainActivity.questaoAtual][2][1];
                if (alternativas[ano][MainActivity.questaoAtual][2][1] != 1){
                    Log.i("Teste","Veio");
                    mudarCor(2,0);
                    correcao.setImageResource(R.drawable.errado);
                }else {
                    Log.i("Teste","Pa");
                    correcao.setImageResource(R.drawable.certo);
                }
            } else if (D) {
                MainActivity.nota += alternativas[ano][MainActivity.questaoAtual][3][1];
                not = alternativas[ano][MainActivity.questaoAtual][3][1];
                if (alternativas[ano][MainActivity.questaoAtual][3][1] != 1){
                    Log.i("Teste","Veio");
                    mudarCor(3,0);
                    correcao.setImageResource(R.drawable.errado);
                }else {
                    Log.i("Teste","Pa");
                    correcao.setImageResource(R.drawable.certo);
                }
            } else if (E) {
                MainActivity.nota += alternativas[ano][MainActivity.questaoAtual][4][1];
                not = alternativas[ano][MainActivity.questaoAtual][4][1];
                if (alternativas[ano][MainActivity.questaoAtual][4][1] != 1){
                    Log.i("Teste","Veio");
                    mudarCor(4,0);
                    correcao.setImageResource(R.drawable.errado);
                }else {
                    Log.i("Teste","Pa");
                    correcao.setImageResource(R.drawable.certo);
                }
            }
            if (MainActivity.questaoAtual < 18){
                MainActivity.portugues += not;
            }else if(MainActivity.questaoAtual >= 18 && MainActivity.questaoAtual < 22){
                MainActivity.atualidades += not;
            }else{
                MainActivity.matematica += not;
            }
            disponibilidade = false;
            int y;
            for (y = 0; y < 5; y++) {
                if (alternativas[ano][MainActivity.questaoAtual][y][1] == 1) {
                    Log.i("Teste", "Róói");
                    mudarCor(y, 1);
                }
            }
            if (MainActivity.questaoAtual == 39) {
                Button b = (Button) findViewById(R.id.pa);
                b.setText("Resultado");
            } else {
                Button b = (Button) findViewById(R.id.pa);
                b.setText("Próxima");
            }
        }else{
            if (MainActivity.questaoAtual == 39) {
                long valor = c.getBase() - SystemClock.elapsedRealtime();
                Intent i = new Intent(this, ResultadoProva.class);
                i.putExtra("tempo", valor);
                startActivity(i);
                finish();
            } else {
                MainActivity.questaoAtual++;
                Button b = (Button) findViewById(R.id.pa);
                b.setText("Resolvi");
                atualiza();
            }
        }
    }
    protected void atualiza(){
        correcao.setVisibility(View.INVISIBLE);
        disponibilidade = true;
        if (pa[ano][MainActivity.questaoAtual][0]){
            redacao.setVisibility(View.VISIBLE);
        }else{
            redacao.setVisibility(View.GONE);
        }
        if(pa[ano][MainActivity.questaoAtual][1]){
            question.setImageResource(imagem[ano][MainActivity.questaoAtual]);
            question.setVisibility(View.VISIBLE);
        }else{
            question.setVisibility(View.GONE);
        }

        a.setText(alternativas[ano][MainActivity.questaoAtual][0][0]);
        b.setText(alternativas[ano][MainActivity.questaoAtual][1][0]);
        ce.setText(alternativas[ano][MainActivity.questaoAtual][2][0]);
        d.setText(alternativas[ano][MainActivity.questaoAtual][3][0]);
        e.setText(alternativas[ano][MainActivity.questaoAtual][4][0]);
        a.setTextColor(Color.BLACK);
        b.setTextColor(Color.BLACK);
        ce.setTextColor(Color.BLACK);
        d.setTextColor(Color.BLACK);
        e.setTextColor(Color.BLACK);
        a.setEnabled(true);
        b.setEnabled(true);
        ce.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        a.setChecked(true);
        b.setChecked(false);
        ce.setChecked(false);
        d.setChecked(false);
        e.setChecked(false);
        A = true;
        B = false;
        C = false;
        D = false;
        E = false;

        exame.setText("Exame de Seleção "+anos[ano]);
        questao.setText("Questão "+(MainActivity.questaoAtual+1));
        quesito.setText(questoes[ano][MainActivity.questaoAtual]);
    }
    public void ler(View v){
        Intent inte = new Intent(this, textos.class);
        startActivityForResult(inte, 1);
    }
    private void mudarCor(int letra, int av){
        if (av == 1) {
            int i;
            for (i = 0; i < 5; i++) {
                if (letra == i) {
                    if (i == 0) {
                        a.setTextColor(Color.GREEN);
                    } else if (i == 1) {
                        b.setTextColor(Color.GREEN);
                    } else if (i == 2) {
                        ce.setTextColor(Color.GREEN);
                    } else if (i == 3) {
                        d.setTextColor(Color.GREEN);
                    } else if (i == 4) {
                        e.setTextColor(Color.GREEN);
                    }
                }
            }
        }else{
            int i;
            for (i = 0; i < 5; i++) {
                if (letra == i) {
                    if (i == 0) {
                        a.setTextColor(Color.RED);
                    } else if (i == 1) {
                        b.setTextColor(Color.RED);
                    } else if (i == 2) {
                        ce.setTextColor(Color.RED);
                    } else if (i == 3) {
                        d.setTextColor(Color.RED);
                    } else if (i == 4) {
                        e.setTextColor(Color.RED);
                    }
                }
            }
        }
    }
}
