package com.example.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnEqual,btnExp,btnRoot , btnAdd , btnSub,btnDiv,btnMul,btnDot,btnClear;
    EditText ed1;
    int index=0;

    float Res1,Res2;
    boolean Add , Sub, Mul , Div , Exp ,Root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mapping all the buttons with their corresponding id's
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnExp=(Button)findViewById(R.id.btnExp);
        btnRoot=(Button)findViewById(R.id.btnRoot);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnDot=(Button)findViewById(R.id.btnDot);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        btnClear=(Button)findViewById(R.id.btnClear);
        ed1=(EditText) findViewById((R.id.editText));


        // after clicking on buttons some value should be shown on screen this can be done with setOnClickListener

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { ed1.setText(ed1.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + ".");
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                    ed1.setText("");

                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Add=true;

                    ed1.setText(ed1.getText() + " + " );
                    index=ed1.getText().toString().length()-1;
//                    ed1.setText(null);

                }
            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                    ed1.setText("");

                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Sub=true;
                    ed1.setText(ed1.getText() + " - " );
                    index=ed1.getText().toString().length()-1;

//                    ed1.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                    ed1.setText("");

                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Mul=true;
                    ed1.setText(ed1.getText() + " * " );
                    index=ed1.getText().toString().length()-1;

//                    ed1.setText(null);
                }
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                    ed1.setText("");

                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Div=true;
                    ed1.setText(ed1.getText() + " / " );
                    index=ed1.getText().toString().length()-1;

//                    ed1.setText(null);
                }
            }
        });

        btnExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                    ed1.setText("");

                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Exp=true;
                    ed1.setText(ed1.getText() + " ^ " );
                    index=ed1.getText().toString().length()-1;


//                    ed1.setText(null);
                }
            }
        });

        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("3√");
                Root=true;
                index=ed1.getText().toString().length()-1;

//                ed1.setText(null);

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int last = ed1.getText().toString().length();
                String second = ed1.getText().toString().substring(index, last);

                Res2 = Float.parseFloat(second + "");
                String first = Float.toString(Res1);


                if (Add == true) {
                    ed1.setText((Res1 + Res2) + "");
                    Add = false;
                } else if (Sub == true) {
                    ed1.setText((Res1 - Res2) + "");
                    Sub = false;
                } else if (Mul == true) {
                    ed1.setText((Res1 * Res2) + "");
                    Mul = false;
                } else if (Div == true) {
                    ed1.setText((Res1 / Res2) + "");
                    Div = false;
                } else if (Exp == true) {

                    float ans = 1;

                    for (int i = 0; i < Res2; i++)
                        ans = ans * Res1;

                    ed1.setText((ans) + "");
                    Exp = false;
                } else if (Root == true) {

                    double ans = Math.cbrt(Res2);

                    ed1.setText((ans) + "");
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });


    }


}