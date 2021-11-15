package com.example.poil;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import android.widget.ImageView;
import android.widget.TextView;

import android.os.SystemClock;

import androidx.appcompat.app.AppCompatActivity;

public class One_level extends AppCompatActivity {

    OneTable oneTable = new OneTable();
    Delay delay = new Delay();

    public Animation a;
    public TextView testView1;
    public TextView testView2;
    public TextView testView3;
    public ImageView oneOlane3;
    public TextView testView4;
    public TextView testView5;
    public TextView testView6;
    public TextView testView7;
    public TextView testView8;
    public TextView testView9;
    public TextView testView10;
    public TextView testView11;
    public TextView testView12;
    public TextView testView13;
    public TextView testView14;
    public TextView testView15;
    public TextView testView16;
    public TextView testView17;
    public TextView testView18;
    public TextView testView19;
    public TextView testView20;
    public TextView testView21;
    public TextView testView22;
    public TextView testView23;
    public TextView testView24;
    public TextView testView25;
    public TextView testView26;
    public TextView testView27;
    public TextView testView28;
    public TextView testView29;
    public TextView testView30;
    public TextView testView31;
    public TextView testView32;
    public TextView testView33;
    public TextView testView34;
    public TextView testView35;
    public ImageView one_Button_next_level;

    public int line=0;//0



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_level);
        final TextView textView1=(TextView)findViewById(R.id.textView1);
        final TextView textView2=(TextView)findViewById(R.id.textView2);
        final TextView textView3=(TextView)findViewById(R.id.textView3);
        final ImageView onePlane3 =(ImageView)findViewById(R.id.onePlane3);
        final TextView textView4=(TextView)findViewById(R.id.textView4);
        final TextView textView5=(TextView)findViewById(R.id.textView5);
        final TextView textView6=(TextView)findViewById(R.id.textView6);
        final TextView textView7=(TextView)findViewById(R.id.textView7);
        final TextView textView8=(TextView)findViewById(R.id.textView8);
        final TextView textView9=(TextView)findViewById(R.id.textView9);
        final TextView textView10=(TextView)findViewById(R.id.textView10);
        final TextView textView11=(TextView)findViewById(R.id.textView11);
        final TextView textView12=(TextView)findViewById(R.id.textView12);
        final TextView textView13=(TextView)findViewById(R.id.textView13);
        final TextView textView14=(TextView)findViewById(R.id.textView14);
        final TextView textView15=(TextView)findViewById(R.id.textView15);
        final TextView textView16=(TextView)findViewById(R.id.textView16);
        final TextView textView17=(TextView)findViewById(R.id.textView17);
        final TextView textView18=(TextView)findViewById(R.id.textView18);
        final TextView textView19=(TextView)findViewById(R.id.textView19);
        final TextView textView20=(TextView)findViewById(R.id.textView20);
        final TextView textView21=(TextView)findViewById(R.id.textView21);
        final TextView textView22=(TextView)findViewById(R.id.textView22);
        final TextView textView23=(TextView)findViewById(R.id.textView23);
        final TextView textView24=(TextView)findViewById(R.id.textView24);
        final TextView textView25=(TextView)findViewById(R.id.textView25);
        final TextView textView26=(TextView)findViewById(R.id.textView26);
        final TextView textView27=(TextView)findViewById(R.id.textView27);
        final TextView textView28=(TextView)findViewById(R.id.textView28);
        final TextView textView29=(TextView)findViewById(R.id.textView29);
        final TextView textView30=(TextView)findViewById(R.id.textView30);
        final TextView textView31=(TextView)findViewById(R.id.textView31);
        final TextView textView32=(TextView)findViewById(R.id.textView32);
        final TextView textView33=(TextView)findViewById(R.id.textView33);
        final TextView textView34=(TextView)findViewById(R.id.textView34);
        final TextView textView35=(TextView)findViewById(R.id.textView35);
        final ImageView one_Button_next_level = (ImageView) findViewById(R.id.one_Button_next_level);

        textView1.setText(oneTable.onescenario[0]);
        textView2.setText(oneTable.onescenario[1]);
        textView3.setText(oneTable.onescenario[2]); //3
        textView4.setText(oneTable.onescenario[3]);//4
        textView5.setText(oneTable.onescenario[4]);// 44444
        textView6.setText(oneTable.onescenario[5]);
        textView7.setText(oneTable.onescenario[6]);
        textView8.setText(oneTable.onescenario[7]);
        textView9.setText(oneTable.onescenario[8]);
        textView10.setText(oneTable.onescenario[9]);
        textView11.setText(oneTable.onescenario[10]);
        textView12.setText(oneTable.onescenario[11]);
        textView13.setText(oneTable.onescenario[12]);
        textView14.setText(oneTable.onescenario[13]);
        textView15.setText(oneTable.onescenario[14]);
        textView16.setText(oneTable.onescenario[15]);
        textView17.setText(oneTable.onescenario[16]);
        textView18.setText(oneTable.onescenario[17]);
        textView19.setText(oneTable.onescenario[18]);
        textView20.setText(oneTable.onescenario[19]);
        textView21.setText(oneTable.onescenario[20]);
        textView22.setText(oneTable.onescenario[21]);
        textView23.setText(oneTable.onescenario[22]);
        textView24.setText(oneTable.onescenario[23]);
        textView25.setText(oneTable.onescenario[24]);
        textView26.setText(oneTable.onescenario[25]);
        textView27.setText(oneTable.onescenario[26]);
        textView28.setText(oneTable.onescenario[27]);
        textView29.setText(oneTable.onescenario[28]);
        textView30.setText(oneTable.onescenario[29]);
        textView31.setText(oneTable.onescenario[30]);
        textView32.setText(oneTable.onescenario[31]);
        textView33.setText(oneTable.onescenario[32]);
        textView34.setText(oneTable.onescenario[33]);
        textView35.setText(oneTable.onescenario[34]);

        //


        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        onePlane3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        textView14.setVisibility(View.INVISIBLE);
        textView15.setVisibility(View.INVISIBLE);
        textView16.setVisibility(View.INVISIBLE);
        textView17.setVisibility(View.INVISIBLE);
        textView18.setVisibility(View.INVISIBLE);
        textView19.setVisibility(View.INVISIBLE);
        textView20.setVisibility(View.INVISIBLE);
        textView21.setVisibility(View.INVISIBLE);
        textView22.setVisibility(View.INVISIBLE);
        textView23.setVisibility(View.INVISIBLE);
        textView24.setVisibility(View.INVISIBLE);
        textView25.setVisibility(View.INVISIBLE);
        textView26.setVisibility(View.INVISIBLE);
        textView27.setVisibility(View.INVISIBLE);
        textView28.setVisibility(View.INVISIBLE);
        textView29.setVisibility(View.INVISIBLE);
        textView30.setVisibility(View.INVISIBLE);
        textView31.setVisibility(View.INVISIBLE);
        textView32.setVisibility(View.INVISIBLE);
        textView33.setVisibility(View.INVISIBLE);
        textView34.setVisibility(View.INVISIBLE);
        textView35.setVisibility(View.INVISIBLE);
        one_Button_next_level.setVisibility(View.INVISIBLE);


        delay.execute();
    }

    //закрываем игру

    public void OnBackPressed(){
        delay.cancel(true);
        delay=null;
        try {
            Intent intent = new Intent(One_level.this, MainActivity.class);
            startActivity(intent);finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }
    //AsyncTask
    class Delay extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            while (line <= 35) {
                publishProgress(line++);
                try {
                    Thread.sleep(1000);//
                    if (isCancelled()) return null;
                } catch (Exception e) { }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            final TextView textView1 = (TextView) findViewById(R.id.textView1);
            final TextView textView2 = (TextView) findViewById(R.id.textView2);
            final TextView textView3 = (TextView) findViewById(R.id.textView3);
            final ImageView onePlane3 = (ImageView) findViewById(R.id.onePlane3);
            final TextView textView4 = (TextView) findViewById(R.id.textView4);
            final TextView textView5 = (TextView) findViewById(R.id.textView5);
            final TextView textView6 = (TextView) findViewById(R.id.textView6);
            final TextView textView7 = (TextView) findViewById(R.id.textView7);
            final TextView textView8 = (TextView) findViewById(R.id.textView8);
            final TextView textView9 = (TextView) findViewById(R.id.textView9);
            final TextView textView10 = (TextView) findViewById(R.id.textView10);
            final TextView textView11 = (TextView) findViewById(R.id.textView11);
            final TextView textView12 = (TextView) findViewById(R.id.textView12);
            final TextView textView13 = (TextView) findViewById(R.id.textView13);
            final TextView textView14 = (TextView) findViewById(R.id.textView14);
            final TextView textView15 = (TextView) findViewById(R.id.textView15);
            final TextView textView16 = (TextView) findViewById(R.id.textView16);
            final TextView textView17 = (TextView) findViewById(R.id.textView17);
            final TextView textView18 = (TextView) findViewById(R.id.textView18);
            final TextView textView19 = (TextView) findViewById(R.id.textView19);
            final TextView textView20 = (TextView) findViewById(R.id.textView20);
            final TextView textView21 = (TextView) findViewById(R.id.textView21);
            final TextView textView22 = (TextView) findViewById(R.id.textView22);
            final TextView textView23 = (TextView) findViewById(R.id.textView23);
            final TextView textView24 = (TextView) findViewById(R.id.textView24);
            final TextView textView25 = (TextView) findViewById(R.id.textView25);
            final TextView textView26 = (TextView) findViewById(R.id.textView26);
            final TextView textView27 = (TextView) findViewById(R.id.textView27);
            final TextView textView28 = (TextView) findViewById(R.id.textView28);
            final TextView textView29 = (TextView) findViewById(R.id.textView29);
            final TextView textView30 = (TextView) findViewById(R.id.textView30);
            final TextView textView31 = (TextView) findViewById(R.id.textView31);
            final TextView textView32 = (TextView) findViewById(R.id.textView32);
            final TextView textView33 = (TextView) findViewById(R.id.textView33);
            final TextView textView34 = (TextView) findViewById(R.id.textView34);
            final TextView textView35 = (TextView) findViewById(R.id.textView35);
            final ImageView one_Button_next_level = (ImageView) findViewById(R.id.one_Button_next_level);

            final Animation a = AnimationUtils.loadAnimation(One_level.this, R.anim.alpha);
            switch (line) {

                case 0:
                    textView1.setVisibility(View.VISIBLE);
                    textView1.startAnimation(a);
                    break;

                case 1:
                    textView2.setVisibility(View.VISIBLE);
                    textView2.startAnimation(a);
                    break;

                case 2:
                    textView3.setVisibility(View.VISIBLE);
                    textView3.startAnimation(a);
                    break;

                case 3:
                    onePlane3.setVisibility(View.VISIBLE);
                    onePlane3.startAnimation(a);
                    break;

                case 4:
                    textView4.setVisibility(View.VISIBLE);
                    textView4.startAnimation(a);
                    break;

                case 5:
                    textView5.setVisibility(View.VISIBLE);
                    textView5.startAnimation(a);
                    break;

                case 6:
                    textView6.setVisibility(View.VISIBLE);
                    textView6.startAnimation(a);
                    break;

                case 7:
                    textView7.setVisibility(View.VISIBLE);
                    textView7.startAnimation(a);
                    break;

                case 8:
                    textView8.setVisibility(View.VISIBLE);
                    textView8.startAnimation(a);
                    break;


                case 9:
                    textView9.setVisibility(View.VISIBLE);
                    textView9.startAnimation(a);
                    break;

                case 10:
                    textView10.setVisibility(View.VISIBLE);
                    textView10.startAnimation(a);
                    break;

                case 11:
                    textView11.setVisibility(View.VISIBLE);
                    textView11.startAnimation(a);
                    break;

                case 12:
                    textView12.setVisibility(View.VISIBLE);
                    textView12.startAnimation(a);
                    break;

                case 13:
                    textView13.setVisibility(View.VISIBLE);
                    textView13.startAnimation(a);
                    break;

                case 14:
                    textView14.setVisibility(View.VISIBLE);
                    textView14.startAnimation(a);
                    break;

                case 15:
                    textView15.setVisibility(View.VISIBLE);
                    textView15.startAnimation(a);
                    break;

                case 16:
                    textView16.setVisibility(View.VISIBLE);
                    textView16.startAnimation(a);
                    break;

                case 17:
                    textView17.setVisibility(View.VISIBLE);
                    textView17.startAnimation(a);
                    textView14.setVisibility(View.GONE);
                    break;

                case 18:
                    textView18.setVisibility(View.VISIBLE);
                    textView18.startAnimation(a);
                    break;

                case 19:
                    textView19.setVisibility(View.VISIBLE);
                    textView19.startAnimation(a);
                    break;

                case 20:
                    textView20.setVisibility(View.VISIBLE);
                    textView20.startAnimation(a);
                    break;

                case 21:
                    textView21.setVisibility(View.VISIBLE);
                    textView21.startAnimation(a);
                    break;

                case 22:
                    textView22.setVisibility(View.VISIBLE);
                    textView22.startAnimation(a);
                    break;

                case 23:
                    textView23.setVisibility(View.VISIBLE);
                    textView23.startAnimation(a);
                    break;

                case 24:
                    textView24.setVisibility(View.VISIBLE);
                    textView24.startAnimation(a);
                    break;

                case 25:
                    textView25.setVisibility(View.VISIBLE);
                    textView25.startAnimation(a);
                    break;

                case 26:
                    textView26.setVisibility(View.VISIBLE);
                    textView26.startAnimation(a);
                    break;

                case 27:
                    textView27.setVisibility(View.VISIBLE);
                    textView27.startAnimation(a);
                    break;

                case 28:
                    textView28.setVisibility(View.VISIBLE);
                    textView28.startAnimation(a);
                    break;

                case 29:
                    textView29.setVisibility(View.VISIBLE);
                    textView29.startAnimation(a);
                    break;

                case 30:
                    textView30.setVisibility(View.VISIBLE);
                    textView30.startAnimation(a);
                    break;

                case 31:
                    textView31.setVisibility(View.VISIBLE);
                    textView31.startAnimation(a);
                    break;

                case 32:
                    textView32.setVisibility(View.VISIBLE);
                    textView32.startAnimation(a);
                    break;

                case 33:
                    textView33.setVisibility(View.VISIBLE);
                    textView33.startAnimation(a);
                    break;

                case 34:
                    textView34.setVisibility(View.VISIBLE);
                    textView34.startAnimation(a);
                    break;

                case 35:
                    textView35.setVisibility(View.VISIBLE);
                    textView35.startAnimation(a);
                    break;

                case 36:
                    one_Button_next_level.setVisibility(View.VISIBLE);
                    one_Button_next_level.startAnimation(a);
                    one_Button_next_level.setOnClickListener(new View.OnClickListener() {

                        @Override//переход на сл главу
                        public void onClick(View v) {
                            one_Button_next_level.setImageDrawable(getResources().getDrawable(R.drawable.dalee));
                            try {

                                Intent intent = new Intent(One_level.this, Two_level.class);
                                startActivity(intent);finish();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });

                default:
                    break;


            }

        }

    }}