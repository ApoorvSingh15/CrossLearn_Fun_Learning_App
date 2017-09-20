package com.example.kanchankumari.cross_learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static android.graphics.Color.BLUE;

public class vocabgame5 extends AppCompatActivity {





    private Button[][] b=new Button[10][10];
    String word="";
    TextView w1,w2,w3,w4,w5,w6,w7;
    Button hb,sub;
    ArrayList<String> mf;
    String[] ss;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabgame5);

        b[0][0] = (Button) findViewById(R.id.c00);
        b[0][1] = (Button) findViewById(R.id.c01);
        b[0][2] = (Button) findViewById(R.id.c02);
        b[0][3] = (Button) findViewById(R.id.c03);
        b[0][4] = (Button) findViewById(R.id.c04);
        b[0][5] = (Button) findViewById(R.id.c05);
        b[0][6] = (Button) findViewById(R.id.c06);
        b[0][7] = (Button) findViewById(R.id.c07);
        b[0][8] = (Button) findViewById(R.id.c08);
        b[0][9] = (Button) findViewById(R.id.c09);
        b[1][0] = (Button) findViewById(R.id.c10);
        b[1][1] = (Button) findViewById(R.id.c11);
        b[1][2] = (Button) findViewById(R.id.c12);
        b[1][3] = (Button) findViewById(R.id.c13);
        b[1][4] = (Button) findViewById(R.id.c14);
        b[1][5] = (Button) findViewById(R.id.c15);
        b[1][6] = (Button) findViewById(R.id.c16);
        b[1][7] = (Button) findViewById(R.id.c17);
        b[1][8] = (Button) findViewById(R.id.c18);
        b[1][9] = (Button) findViewById(R.id.c19);
        b[2][0] = (Button) findViewById(R.id.c20);
        b[2][1] = (Button) findViewById(R.id.c21);
        b[2][2] = (Button) findViewById(R.id.c22);
        b[2][3] = (Button) findViewById(R.id.c23);
        b[2][4] = (Button) findViewById(R.id.c24);
        b[2][5] = (Button) findViewById(R.id.c25);
        b[2][6] = (Button) findViewById(R.id.c26);
        b[2][7] = (Button) findViewById(R.id.c27);
        b[2][8] = (Button) findViewById(R.id.c28);
        b[2][9] = (Button) findViewById(R.id.c29);
        b[3][0] = (Button) findViewById(R.id.c30);
        b[3][1] = (Button) findViewById(R.id.c31);
        b[3][2] = (Button) findViewById(R.id.c32);
        b[3][3] = (Button) findViewById(R.id.c33);
        b[3][4] = (Button) findViewById(R.id.c34);
        b[3][5] = (Button) findViewById(R.id.c35);
        b[3][6] = (Button) findViewById(R.id.c36);
        b[3][7] = (Button) findViewById(R.id.c37);
        b[3][8] = (Button) findViewById(R.id.c38);
        b[3][9] = (Button) findViewById(R.id.c39);
        b[4][0] = (Button) findViewById(R.id.c40);
        b[4][1] = (Button) findViewById(R.id.c41);
        b[4][2] = (Button) findViewById(R.id.c42);
        b[4][3] = (Button) findViewById(R.id.c43);
        b[4][4] = (Button) findViewById(R.id.c44);
        b[4][5] = (Button) findViewById(R.id.c45);
        b[4][6] = (Button) findViewById(R.id.c46);
        b[4][7] = (Button) findViewById(R.id.c47);
        b[4][8] = (Button) findViewById(R.id.c48);
        b[4][9] = (Button) findViewById(R.id.c49);
        b[5][0] = (Button) findViewById(R.id.c50);
        b[5][1] = (Button) findViewById(R.id.c51);
        b[5][2] = (Button) findViewById(R.id.c52);
        b[5][3] = (Button) findViewById(R.id.c53);
        b[5][4] = (Button) findViewById(R.id.c54);
        b[5][5] = (Button) findViewById(R.id.c55);
        b[5][6] = (Button) findViewById(R.id.c56);
        b[5][7] = (Button) findViewById(R.id.c57);
        b[5][8] = (Button) findViewById(R.id.c58);
        b[5][9] = (Button) findViewById(R.id.c59);
        b[6][0] = (Button) findViewById(R.id.c60);
        b[6][1] = (Button) findViewById(R.id.c61);
        b[6][2] = (Button) findViewById(R.id.c62);
        b[6][3] = (Button) findViewById(R.id.c63);
        b[6][4] = (Button) findViewById(R.id.c64);
        b[6][5] = (Button) findViewById(R.id.c65);
        b[6][6] = (Button) findViewById(R.id.c66);
        b[6][7] = (Button) findViewById(R.id.c67);
        b[6][8] = (Button) findViewById(R.id.c68);
        b[6][9] = (Button) findViewById(R.id.c69);
        b[7][0] = (Button) findViewById(R.id.c70);
        b[7][1] = (Button) findViewById(R.id.c71);
        b[7][2] = (Button) findViewById(R.id.c72);
        b[7][3] = (Button) findViewById(R.id.c73);
        b[7][4] = (Button) findViewById(R.id.c74);
        b[7][5] = (Button) findViewById(R.id.c75);
        b[7][6] = (Button) findViewById(R.id.c76);
        b[7][7] = (Button) findViewById(R.id.c77);
        b[7][8] = (Button) findViewById(R.id.c78);
        b[7][9] = (Button) findViewById(R.id.c79);
        b[8][0] = (Button) findViewById(R.id.c80);
        b[8][1] = (Button) findViewById(R.id.c81);
        b[8][2] = (Button) findViewById(R.id.c82);
        b[8][3] = (Button) findViewById(R.id.c83);
        b[8][4] = (Button) findViewById(R.id.c84);
        b[8][5] = (Button) findViewById(R.id.c85);
        b[8][6] = (Button) findViewById(R.id.c86);
        b[8][7] = (Button) findViewById(R.id.c87);
        b[8][8] = (Button) findViewById(R.id.c88);
        b[8][9] = (Button) findViewById(R.id.c89);
        b[9][0] = (Button) findViewById(R.id.c90);
        b[9][1] = (Button) findViewById(R.id.c91);
        b[9][2] = (Button) findViewById(R.id.c92);
        b[9][3] = (Button) findViewById(R.id.c93);
        b[9][4] = (Button) findViewById(R.id.c94);
        b[9][5] = (Button) findViewById(R.id.c95);
        b[9][6] = (Button) findViewById(R.id.c96);
        b[9][7] = (Button) findViewById(R.id.c97);
        b[9][8] = (Button) findViewById(R.id.c98);
        b[9][9] = (Button) findViewById(R.id.c99);
        w1=(TextView)findViewById(R.id.w1);
        w2=(TextView)findViewById(R.id.w2);
        w3=(TextView)findViewById(R.id.w3);
        w4=(TextView)findViewById(R.id.w4);
        w5=(TextView)findViewById(R.id.w5);
        w6=(TextView)findViewById(R.id.w6);
        w7=(TextView)findViewById(R.id.w7);

        sub=(Button)findViewById(R.id.mybutton2);

        hb=(Button)findViewById(R.id.hb);

        mf=new ArrayList<String>();
        String m = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
            {
                b[i][j].setText(m.charAt(r.nextInt(m.length()))+"");
            }
        }

        int k = 0;
        ss=new String[]{"DISQUIET","CONCEDE","INDICT","VACUOUS","MARRED","NUANCE","OBVIATE"};
        char p = 'K';
        int ind=1;


        //concede
        int  k1=0;
        String my3=ss[1];
        for (int i = 0; i <8; i++) {
            if (k1 < my3.length()) {
                p = (char) my3.charAt(k1);
                b[i][7].setText(p + "");
                k1++;
            }
        }
        word="";


        //disquiet
        String my=ss[0];
        for (int i = 2; i <10; i++) {
            for (int j = 2; j < 10; j++) {
                if (i == j) {

                    if(k<my.length()) {

                        p = (char) my.charAt(k);
                        b[i][j].setText(p + "");
                        k++;
                    }

                }
            }
        }




        //indict
        k1=0;
        String   my1=ss[2];
        for (int i = 3; i <10; i++) {
            if(k1<my1.length()) {
                p =(char)my1.charAt(k1);
                b[9][i].setText(p+"");
                k1++;
            }
        }




        //MARRED
        k1=0;
        String my2=ss[4];
        for (int i = 0; i <7; i++) {
            if(k1<my2.length()) {
                p =(char)my2.charAt(k1);
                b[6][i].setText(p+"");
                k1++;
            }
        }





        //NUANCE
        k1=0;
        my2=ss[5];
        for (int i = 4; i <10; i++) {
            if(k1<my2.length()) {
                p =(char)my2.charAt(k1);
                b[2][i].setText(p+"");
                k1++;
            }
        }




//OBVIATE
        k1=0;
        my2=ss[6];
        for (int i = 0; i <10; i++) {
            if(k1<my2.length()) {
                p =(char)my2.charAt(k1);
                b[1][i].setText(p+"");
                k1++;
            }
        }



        //VACUOUS
        k1=0;
        my2=ss[3];

        for (int j = 7; j>=0; j--) {

            if(k1<my2.length()) {
                p =(char)my2.charAt(k1);
                b[8][j].setText(p+"");

                k1++;
            }
        }





        b[0][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[0][7].setBackgroundResource(R.drawable.yellow);
                word=word+b[0][7].getText().toString();
            }
        });
        b[1][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[1][7].setBackgroundResource(R.drawable.yellow);
                word=word+b[1][7].getText().toString();
            }
        });
        b[2][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[2][7].setBackgroundResource(R.drawable.yellow);
                word=word+b[2][7].getText().toString();
            }
        });
        b[3][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[3][7].setBackgroundResource(R.drawable.yellow);
                word=word+b[3][7].getText().toString();
            }
        });
        b[4][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[4][7].setBackgroundResource(R.drawable.yellow);
                word=word+b[4][7].getText().toString();
            }
        });
        b[5][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[5][7].setBackgroundResource(R.drawable.yellow);
                word=word+b[5][7].getText().toString();
            }
        });
        b[6][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                word = word + b[6][7].getText().toString();
                b[6][7].setBackgroundResource(R.drawable.yellow);

                if (word.equals("CONCEDE")) {
                    mf.add(word);
                    Toast.makeText(vocabgame5.this, "CONCEDE - admit to be true ; grant (a right,privilege, etc) ", Toast.LENGTH_LONG).show();
                    w3.setBackgroundColor(BLUE);
                    word = "";
                    count++;
                }
            }
        });

        b[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[2][2].setBackgroundResource(R.drawable.yellow);
                word=word+b[2][2].getText().toString();
            }
        });
        b[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[3][3].setBackgroundResource(R.drawable.yellow);
                word=word+b[3][3].getText().toString();
            }
        });
        b[4][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[4][4].setBackgroundResource(R.drawable.yellow);
                word=word+b[4][4].getText().toString();
            }
        });
        b[5][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[5][5].setBackgroundResource(R.drawable.yellow);
                word=word+b[5][5].getText().toString();
            }
        });
        b[6][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[6][6].setBackgroundResource(R.drawable.yellow);
                word=word+b[6][6].getText().toString();
            }
        });
        b[7][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[7][7].setBackgroundResource(R.drawable.yellow);
                word=word+b[7][7].getText().toString();
            }
        });
        b[8][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[8][8].setBackgroundResource(R.drawable.yellow);
                word=word+b[8][8].getText().toString();
            }
        });
        b[9][9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                word = word + b[9][9].getText().toString();
                b[9][9].setBackgroundResource(R.drawable.yellow);
                if (word.equals("DISQUIET")) {
                    mf.add(word);
                    Toast.makeText(vocabgame5.this, "DISQUIET - make uneasy or anxious", Toast.LENGTH_LONG).show();
                    w4.setBackgroundColor(BLUE);
                    word = "";
                    count++;
                }
            }
        });

        b[9][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][3].setBackgroundResource(R.drawable.yellow);
                word=word+b[9][3].getText().toString();
            }
        });
        b[9][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][4].setBackgroundResource(R.drawable.yellow);
                word=word+b[9][4].getText().toString();
            }
        });
        b[9][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][5].setBackgroundResource(R.drawable.yellow);
                word=word+b[9][5].getText().toString();
            }
        });
        b[9][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][6].setBackgroundResource(R.drawable.yellow);
                word=word+b[9][6].getText().toString();
            }
        });
        b[9][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][7].setBackgroundResource(R.drawable.yellow);
                word=word+b[9][7].getText().toString();
            }
        });

        b[9][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                word = word + b[9][8].getText().toString();
                b[9][8].setBackgroundResource(R.drawable.yellow);
                if (word.equals("INDICT")) {

                    mf.add(word);
                    Toast.makeText(vocabgame5.this, "INDICT - charge ", Toast.LENGTH_LONG).show();
                    w6.setBackgroundColor(BLUE);
                    word = "";
                    count++;
                }
            }
        });


        b[6][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[6][0].setBackgroundResource(R.drawable.yellow);
                word=word+b[6][0].getText().toString();
            }
        });
        b[6][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[6][1].setBackgroundResource(R.drawable.yellow);
                word=word+b[6][1].getText().toString();
            }
        });
        b[6][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[6][2].setBackgroundResource(R.drawable.yellow);
                word=word+b[6][2].getText().toString();
            }
        });
        b[6][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[6][3].setBackgroundResource(R.drawable.yellow);
                word=word+b[6][3].getText().toString();
            }
        });
        b[6][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[6][4].setBackgroundResource(R.drawable.yellow);
                word=word+b[6][4].getText().toString();
            }
        });
        b[6][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[6][5].setBackgroundResource(R.drawable.yellow);
                word=word+b[6][5].getText().toString();


                if (word.equals("MARRED")) {
                    mf.add(word);
                    Toast.makeText(vocabgame5.this, "MARRED - damaged ; disfigured ", Toast.LENGTH_LONG).show();
                    w1.setBackgroundColor(BLUE);
                    word = "";
                    count++;
                }
            }
        });

        b[2][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[2][4].setBackgroundResource(R.drawable.yellow);
                word=word+b[2][4].getText().toString();
            }
        });
        b[2][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[2][5].setBackgroundResource(R.drawable.yellow);
                word=word+b[2][5].getText().toString();
            }
        });
        b[2][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[2][6].setBackgroundResource(R.drawable.yellow);
                word=word+b[2][6].getText().toString();
            }
        });
        b[2][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[2][7].setBackgroundResource(R.drawable.yellow);
                word=word+b[2][7].getText().toString();
            }
        });
        b[2][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[2][8].setBackgroundResource(R.drawable.yellow);
                word=word+b[2][8].getText().toString();
            }
        });
        b[2][9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[2][9].setBackgroundResource(R.drawable.yellow);
                word=word+b[2][9].getText().toString();


                if (word.equals("NUANCE")) {
                    mf.add(word);
                    Toast.makeText(vocabgame5.this, "NUANCE - shade of difference in meaning or color; subtle distinction ", Toast.LENGTH_LONG).show();
                    w5.setBackgroundColor(BLUE);
                    word = "";
                    count++;
                }
            }
        });
        b[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[1][0].setBackgroundResource(R.drawable.yellow);
                word=word+b[1][0].getText().toString();
            }
        });
        b[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[1][2].setBackgroundResource(R.drawable.yellow);
                word=word+b[1][2].getText().toString();
            }
        });
        b[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[1][3].setBackgroundResource(R.drawable.yellow);
                word=word+b[1][3].getText().toString();
            }
        });
        b[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[1][1].setBackgroundResource(R.drawable.yellow);
                word=word+b[1][1].getText().toString();
            }
        });
        b[1][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[1][4].setBackgroundResource(R.drawable.yellow);
                word=word+b[1][4].getText().toString();
            }
        });
        b[1][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[1][5].setBackgroundResource(R.drawable.yellow);
                word=word+b[1][5].getText().toString();
            }
        });
        b[1][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[1][6].setBackgroundResource(R.drawable.yellow);
                word=word+b[1][6].getText().toString();


                if (word.equals("OBVIATE")) {
                    mf.add(word);
                    Toast.makeText(vocabgame5.this, " OBVIATE- make unnecessary ; get rid of. ", Toast.LENGTH_LONG).show();
                    w7.setBackgroundColor(BLUE);
                    word = "";
                    count++;
                }
            }
        });

        b[8][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[8][7].setBackgroundResource(R.drawable.yellow);
                word=word+b[8][7].getText().toString();
            }
        });
        b[8][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[8][6].setBackgroundResource(R.drawable.yellow);
                word=word+b[8][6].getText().toString();
            }
        });
        b[8][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[8][5].setBackgroundResource(R.drawable.yellow);
                word=word+b[8][5].getText().toString();
            }
        });
        b[8][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[8][4].setBackgroundResource(R.drawable.yellow);
                word=word+b[8][4].getText().toString();
            }
        });
        b[8][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[8][3].setBackgroundResource(R.drawable.yellow);
                word=word+b[8][3].getText().toString();
            }
        });
        b[8][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[8][2].setBackgroundResource(R.drawable.yellow);
                word=word+b[8][2].getText().toString();
            }
        });
        b[8][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[8][1].setBackgroundResource(R.drawable.yellow);
                word=word+b[8][1].getText().toString();


                if (word.equals("VACUOUS")) {
                    mf.add(word);
                    Toast.makeText(vocabgame5.this, "VACUOUS - empty ; inane", Toast.LENGTH_LONG).show();
                    w2.setBackgroundColor(BLUE);
                    word = "";
                    count++;
                }
            }
        });

        hb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mf.contains("CONCEDE"))
                {
                    b[0][7].setBackgroundResource(R.drawable.yellow);
                    word=word+b[0][7].getText().toString();
                }
                else if(!mf.contains("INDICT"))
                {
                    b[9][3].setBackgroundResource(R.drawable.yellow);
                    word=word+b[9][3].getText().toString();
                }
                else if(!mf.contains("VACUOUS"))
                {

                    b[8][7].setBackgroundResource(R.drawable.yellow);
                    word=word+b[8][7].getText().toString();
                }
                else if(!mf.contains("MARRED"))
                {
                    b[6][0].setBackgroundResource(R.drawable.yellow);
                    word=word+b[6][0].getText().toString();

                }
                else if(!mf.contains("DISQUIET"))
                {
                    b[2][2].setBackgroundResource(R.drawable.yellow);
                    word=word+b[2][2].getText().toString();
                }
                else if(!mf.contains("NUANCE"))
                {
                    b[2][4].setBackgroundResource(R.drawable.yellow);
                    word=word+b[2][4].getText().toString();
                }
                else
                {
                    b[1][0].setBackgroundResource(R.drawable.yellow);
                    word=word+b[1][0].getText().toString();

                }
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count==7)
                {
                    Toast.makeText(vocabgame5.this,"You have found all the words",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(vocabgame5.this,"You have not found all the words",Toast.LENGTH_LONG).show();
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




    @Override

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
