package com.example.kanchankumari.cross_learn;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.RED;

public class Fruit_crossword extends AppCompatActivity {

    Button[][] b=new Button[10][10];
    String word="";
    TextView t1,t2,t3,t4,t5;
    Button hb;
    ArrayList<String> mf;
    int count=0;
    NotificationCompat.Builder notification;
    private static final int uniqueId=48753;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_crossword);

        b[0][0] = (Button) findViewById(R.id.b00);
        b[0][1] = (Button) findViewById(R.id.b01);
        b[0][2] = (Button) findViewById(R.id.b02);
        b[0][3] = (Button) findViewById(R.id.b03);
        b[0][4] = (Button) findViewById(R.id.b04);
        b[0][5] = (Button) findViewById(R.id.b05);
        b[0][6] = (Button) findViewById(R.id.b06);
        b[0][7] = (Button) findViewById(R.id.b07);
        b[0][8] = (Button) findViewById(R.id.b08);
        b[0][9] = (Button) findViewById(R.id.b09);
        b[1][0] = (Button) findViewById(R.id.b10);
        b[1][1] = (Button) findViewById(R.id.b11);
        b[1][2] = (Button) findViewById(R.id.b12);
        b[1][3] = (Button) findViewById(R.id.b13);
        b[1][4] = (Button) findViewById(R.id.b14);
        b[1][5] = (Button) findViewById(R.id.b15);
        b[1][6] = (Button) findViewById(R.id.b16);
        b[1][7] = (Button) findViewById(R.id.b17);
        b[1][8] = (Button) findViewById(R.id.b18);
        b[1][9] = (Button) findViewById(R.id.b19);
        b[2][0] = (Button) findViewById(R.id.b20);
        b[2][1] = (Button) findViewById(R.id.b21);
        b[2][2] = (Button) findViewById(R.id.b22);
        b[2][3] = (Button) findViewById(R.id.b23);
        b[2][4] = (Button) findViewById(R.id.b24);
        b[2][5] = (Button) findViewById(R.id.b25);
        b[2][6] = (Button) findViewById(R.id.b26);
        b[2][7] = (Button) findViewById(R.id.b27);
        b[2][8] = (Button) findViewById(R.id.b28);
        b[2][9] = (Button) findViewById(R.id.b29);
        b[3][0] = (Button) findViewById(R.id.b30);
        b[3][1] = (Button) findViewById(R.id.b31);
        b[3][2] = (Button) findViewById(R.id.b32);
        b[3][3] = (Button) findViewById(R.id.b33);
        b[3][4] = (Button) findViewById(R.id.b34);
        b[3][5] = (Button) findViewById(R.id.b35);
        b[3][6] = (Button) findViewById(R.id.b36);
        b[3][7] = (Button) findViewById(R.id.b37);
        b[3][8] = (Button) findViewById(R.id.b38);
        b[3][9] = (Button) findViewById(R.id.b39);
        b[4][0] = (Button) findViewById(R.id.b40);
        b[4][1] = (Button) findViewById(R.id.b41);
        b[4][2] = (Button) findViewById(R.id.b42);
        b[4][3] = (Button) findViewById(R.id.b43);
        b[4][4] = (Button) findViewById(R.id.b44);
        b[4][5] = (Button) findViewById(R.id.b45);
        b[4][6] = (Button) findViewById(R.id.b46);
        b[4][7] = (Button) findViewById(R.id.b47);
        b[4][8] = (Button) findViewById(R.id.b48);
        b[4][9] = (Button) findViewById(R.id.b49);
        b[5][0] = (Button) findViewById(R.id.b50);
        b[5][1] = (Button) findViewById(R.id.b51);
        b[5][2] = (Button) findViewById(R.id.b52);
        b[5][3] = (Button) findViewById(R.id.b53);
        b[5][4] = (Button) findViewById(R.id.b54);
        b[5][5] = (Button) findViewById(R.id.b55);
        b[5][6] = (Button) findViewById(R.id.b56);
        b[5][7] = (Button) findViewById(R.id.b57);
        b[5][8] = (Button) findViewById(R.id.b58);
        b[5][9] = (Button) findViewById(R.id.b59);
        b[6][0] = (Button) findViewById(R.id.b60);
        b[6][1] = (Button) findViewById(R.id.b61);
        b[6][2] = (Button) findViewById(R.id.b62);
        b[6][3] = (Button) findViewById(R.id.b63);
        b[6][4] = (Button) findViewById(R.id.b64);
        b[6][5] = (Button) findViewById(R.id.b65);
        b[6][6] = (Button) findViewById(R.id.b66);
        b[6][7] = (Button) findViewById(R.id.b67);
        b[6][8] = (Button) findViewById(R.id.b68);
        b[6][9] = (Button) findViewById(R.id.b69);
        b[7][0] = (Button) findViewById(R.id.b70);
        b[7][1] = (Button) findViewById(R.id.b71);
        b[7][2] = (Button) findViewById(R.id.b72);
        b[7][3] = (Button) findViewById(R.id.b73);
        b[7][4] = (Button) findViewById(R.id.b74);
        b[7][5] = (Button) findViewById(R.id.b75);
        b[7][6] = (Button) findViewById(R.id.b76);
        b[7][7] = (Button) findViewById(R.id.b77);
        b[7][8] = (Button) findViewById(R.id.b78);
        b[7][9] = (Button) findViewById(R.id.b79);
        b[8][0] = (Button) findViewById(R.id.b80);
        b[8][1] = (Button) findViewById(R.id.b81);
        b[8][2] = (Button) findViewById(R.id.b82);
        b[8][3] = (Button) findViewById(R.id.b83);
        b[8][4] = (Button) findViewById(R.id.b84);
        b[8][5] = (Button) findViewById(R.id.b85);
        b[8][6] = (Button) findViewById(R.id.b86);
        b[8][7] = (Button) findViewById(R.id.b87);
        b[8][8] = (Button) findViewById(R.id.b88);
        b[8][9] = (Button) findViewById(R.id.b89);
        b[9][0] = (Button) findViewById(R.id.b90);
        b[9][1] = (Button) findViewById(R.id.b91);
        b[9][2] = (Button) findViewById(R.id.b92);
        b[9][3] = (Button) findViewById(R.id.b93);
        b[9][4] = (Button) findViewById(R.id.b94);
        b[9][5] = (Button) findViewById(R.id.b95);
        b[9][6] = (Button) findViewById(R.id.b96);
        b[9][7] = (Button) findViewById(R.id.b97);
        b[9][8] = (Button) findViewById(R.id.b98);
        b[9][9] = (Button) findViewById(R.id.b99);

        //notificarion
        notification=new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);


        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        t5=(TextView)findViewById(R.id.t5);


        hb=(Button)findViewById(R.id.hb);
        mf=new ArrayList<String>();
        String m = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                b[i][j].setText(m.charAt(r.nextInt(m.length()))+"");
            }
        }

        int k = 0;
        String[] ss=new String[]{"MANGO","APPLE","ORANGE","BANANA","GRAPES"};
        char p = 'K';
        int ind=1;


        //mango
        int  k1=0;
        String my3=ss[0];
        for (int i = 4; i <10; i++) {
            if (k1 < my3.length()) {
                p = (char) my3.charAt(k1);
                b[i][7].setText(p + "");
                k1++;
            }
        }

        //apple
        String my=ss[ind];
        for (int i = 0; i <7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {

                    if(k<my.length()) {

                        p = (char) my.charAt(k);
                        b[i][j].setText(p + "");
                        k++;
                    }

                }
            }
        }

        //orange
        k1=0;
        String   my1=ss[2];
        for (int i = 0; i <7; i++) {
            if(k1<my1.length()) {
                p =(char)my1.charAt(k1);
                b[i][6].setText(p+"");
                k1++;
            }
        }

        //banana
        k1=0;
        String my2=ss[3];
        for (int i = 0; i <7; i++) {
            if(k1<my2.length()) {
                p =(char)my2.charAt(k1);
                b[5][i].setText(p+"");
                k1++;
            }
        }

        //grapes
        k1=0;
        my2=ss[4];
        for (int i = 3; i <10; i++) {
            if(k1<my2.length()) {
                p =(char)my2.charAt(k1);
                b[9][i].setText(p+"");
                k1++;
            }
        }



        b[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[0][0].setBackgroundResource(R.drawable.orb);
                word=word+b[0][0].getText().toString();

            }
        });
        b[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[1][1].setBackgroundResource(R.drawable.orb);
                word=word+b[1][1].getText().toString();

            }
        });
        b[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[2][2].setBackgroundResource(R.drawable.orb);
                word=word+b[2][2].getText().toString();

            }
        });
        b[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[3][3].setBackgroundResource(R.drawable.orb);
                word=word+b[3][3].getText().toString();
            }
        });


        b[4][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[4][4].setBackgroundResource(R.drawable.orb);
                word=word+b[4][4].getText().toString();
                mf.add(word);
                if(word.equals("APPLE"))
                {  count++;
                    Toast.makeText(Fruit_crossword.this,"Word is "+word+" is found",Toast.LENGTH_LONG).show();
                    word="";
                    t1.setBackgroundColor(BLUE);
                }


            }
        });

        b[4][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[4][7].setBackgroundResource(R.drawable.orb);
                word = word + b[4][7].getText().toString();
            }
        });
        b[5][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[5][7].setBackgroundResource(R.drawable.orb);
                word=word+b[5][7].getText().toString();

            }
        });
        b[6][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[6][7].setBackgroundResource(R.drawable.orb);
                word=word+b[6][7].getText().toString();

            }
        });
        b[7][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[7][7].setBackgroundResource(R.drawable.orb);
                word=word+b[7][7].getText().toString();

            }
        });
        b[8][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[8][7].setBackgroundResource(R.drawable.orb);
                word=word+b[8][7].getText().toString();
                if(word.equals("MANGO"))
                {
                    count++;
                    mf.add(word);
                    Toast.makeText(Fruit_crossword.this,"Word is "+word+" is found",Toast.LENGTH_LONG).show();
                    word="";
                    t2.setBackgroundColor(BLUE);
                }
            }
        });

        b[0][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[0][6].setBackgroundResource(R.drawable.orb);
                word=word+b[0][6].getText().toString();


            }
        });
        b[1][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[1][6].setBackgroundResource(R.drawable.orb);
                word=word+b[1][6].getText().toString();


            }
        });

        b[2][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[2][6].setBackgroundResource(R.drawable.orb);
                word=word+b[2][6].getText().toString();


            }
        });
        b[3][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[3][6].setBackgroundResource(R.drawable.orb);
                word=word+b[3][6].getText().toString();


            }
        });
        b[4][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[4][6].setBackgroundResource(R.drawable.orb);
                word=word+b[4][6].getText().toString();


            }
        });
        b[5][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[5][6].setBackgroundResource(R.drawable.orb);
                word=word+b[5][6].getText().toString();
                if(word.equals("ORANGE"))
                {
                    count++;
                    mf.add(word);
                    Toast.makeText(Fruit_crossword.this,"Word is "+word+" is found",Toast.LENGTH_LONG).show();
                    word="";
                    t4.setBackgroundColor(BLUE);
                }

            }
        });


        b[5][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[5][0].setBackgroundResource(R.drawable.orb);
                word=word+b[5][0].getText().toString();


            }
        });
        b[5][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[5][1].setBackgroundResource(R.drawable.orb);
                word=word+b[5][1].getText().toString();


            }
        });
        b[5][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[5][2].setBackgroundResource(R.drawable.orb);
                word=word+b[5][2].getText().toString();


            }
        });

        b[5][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[5][3].setBackgroundResource(R.drawable.orb);
                word=word+b[5][3].getText().toString();


            }
        });

        b[5][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[5][4].setBackgroundResource(R.drawable.orb);
                word=word+b[5][4].getText().toString();


            }
        });

        b[5][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[5][5].setBackgroundResource(R.drawable.orb);
                word=word+b[5][5].getText().toString();
                if(word.equals("BANANA"))
                { count++;
                    mf.add(word);
                    Toast.makeText(Fruit_crossword.this,"Word is "+word+" is found",Toast.LENGTH_LONG).show();
                    word="";
                    t3.setBackgroundColor(BLUE);
                }


            }
        });


        b[9][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][3].setBackgroundResource(R.drawable.orb);
                word=word+b[9][3].getText().toString();


            }
        });
        b[9][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][4].setBackgroundResource(R.drawable.orb);
                word=word+b[9][4].getText().toString();


            }
        });
        b[9][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][5].setBackgroundResource(R.drawable.orb);
                word=word+b[9][5].getText().toString();


            }
        });
        b[9][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][6].setBackgroundResource(R.drawable.orb);
                word=word+b[9][6].getText().toString();


            }
        });
        b[9][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][7].setBackgroundResource(R.drawable.orb);
                word=word+b[9][7].getText().toString();


            }
        });
        b[9][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b[9][8].setBackgroundResource(R.drawable.orb);
                word=word+b[9][8].getText().toString();
                if(word.equals("GRAPES"))
                { count++;
                    mf.add(word);
                    Toast.makeText(Fruit_crossword.this,"Word is "+word+" is found",Toast.LENGTH_LONG).show();
                    word="";
                    t5.setBackgroundColor(BLUE);
                }


            }
        });


        hb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(!mf.contains("GRAPES")) {
                 //grapes
                   b[9][3].setBackgroundResource(R.drawable.orb);
               }
               else if(mf.contains("APPLE")) {
                    //äpple
                    b[0][0].setBackgroundResource(R.drawable.orb);
                }
                else if(mf.contains("MANGO")) {
                 //mango
                    b[4][7].setBackgroundResource(R.drawable.orb);
                }
                else if(mf.contains("ORANGE")) {
                   //Orange
                   b[0][6].setBackgroundResource(R.drawable.orb);
               }
               else
               {
                   //banana
                   b[5][0].setBackgroundResource(R.drawable.orb);

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


    public void mybuttonClick(View v)
    {
        if(count==5)
        {

            Toast.makeText(Fruit_crossword.this,"You have found all the words",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(Fruit_crossword.this,"You have not found all the words",Toast.LENGTH_LONG).show();

        }


        notification.setSmallIcon(R.drawable.grbut);
        notification.setTicker("Your new Word notification");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Word of the Day");
        notification.setContentText("This your new word");
        Intent i=new Intent(this,MainActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueId,notification.build());




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
