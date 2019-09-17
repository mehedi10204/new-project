package com.example.calculatormehedi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button add_bt,sub_bt,mul_bt,div_bt,sci_bt ;
    private TextView result_tv ;
    private EditText num1_et, num2_et ;

    float result ;
    int num1 ,num2 ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_bt= findViewById(R.id.add_bt);
        sub_bt= findViewById(R.id.sub_bt);
        mul_bt= findViewById(R.id.mul_bt);
        div_bt= findViewById(R.id.div_bt);
        sci_bt= findViewById(R.id.sci_bt);

        result_tv= findViewById(R.id.result_tv);
        num1_et =  findViewById(R.id.num1_et);
        num2_et =  findViewById(R.id.num2_et);


        add_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1= num1_et.getText().toString();
                snum2= num2_et.getText().toString();

                if(snum1.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please,Enter first number", Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(snum2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please,Enter Second number", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1= Integer.parseInt(snum1);
                num2= Integer.parseInt(snum2);
                result = (float) num1 + num2;
                result_tv.setText(String.valueOf(result));

            }
        } );

        sub_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1= num1_et.getText().toString();
                snum2= num2_et.getText().toString();

                if(snum1.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please,Enter first number", Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(snum2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please,Enter Second number", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1= Integer.parseInt(snum1);
                num2= Integer.parseInt(snum2);
                result = (float) num1 - num2;
                result_tv.setText(String.valueOf(result));

            }
        } );


        mul_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1= num1_et.getText().toString();
                snum2= num2_et.getText().toString();

                if(snum1.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please,Enter first number", Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(snum2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please,Enter Second number", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1= Integer.parseInt(snum1);
                num2= Integer.parseInt(snum2);
                result = (float) num1 * (float) num2;
                result_tv.setText(String.valueOf(result));

            }
        } );


        div_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1= num1_et.getText().toString();
                snum2= num2_et.getText().toString();

                if(snum1.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please,Enter first number", Toast.LENGTH_SHORT).show();
                    return;
                }

                else if(snum2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please,Enter Second number", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1= Integer.parseInt(snum1);
                num2= Integer.parseInt(snum2);
                result = num1 / (float) num2;
                result_tv.setText(String.valueOf(result));

            }
        } );

        sci_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                open_advanced_activity();
            }
        } );

    }

    public void open_advanced_activity(){

        Intent intent = new Intent(this, sample.class);
        startActivity(intent);


    }
}
