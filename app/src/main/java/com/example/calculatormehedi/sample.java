package com.example.calculatormehedi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sample extends AppCompatActivity {

    private Button sin_bt,cos_bt,tan_bt,sqrt_bt,log_bt;
    private TextView result1_tv;
    private EditText num11_et;

    double result1;
    int num11 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        sin_bt=findViewById(R.id.sin_bt);
        cos_bt=findViewById(R.id.cos_bt);
        tan_bt=findViewById(R.id.tan_bt);
        sqrt_bt=findViewById(R.id.sqrt_bt);
        log_bt=findViewById(R.id.log_bt);

        result1_tv=findViewById(R.id.result1_tv);
        num11_et=findViewById(R.id.num11_et);


        sin_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1;
                snum1= num11_et.getText().toString();


                if(snum1.isEmpty()){
                    Toast.makeText(sample.this, "Please,Enter the number", Toast.LENGTH_SHORT).show();
                    return;
                }

                num11= Integer.parseInt(snum1);

                result1 = Math.sin(Math.toRadians(num11));
                result1_tv.setText(String.valueOf(result1));

            }
        } );

        cos_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1;
                snum1= num11_et.getText().toString();


                if(snum1.isEmpty()){
                    Toast.makeText(sample.this, "Please,Enter the number", Toast.LENGTH_SHORT).show();
                    return;
                }

                num11= Integer.parseInt(snum1);

                result1 = Math.cos(Math.toRadians(num11));
                result1_tv.setText(String.valueOf(result1));

            }
        } );

        tan_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1;
                snum1= num11_et.getText().toString();


                if(snum1.isEmpty()){
                    Toast.makeText(sample.this, "Please,Enter the number", Toast.LENGTH_SHORT).show();
                    return;
                }

                num11= Integer.parseInt(snum1);

                result1 = Math.tan(Math.toRadians(num11));
                result1_tv.setText(String.valueOf(result1));

            }
        } );

        sqrt_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1;
                snum1= num11_et.getText().toString();


                if(snum1.isEmpty()){
                    Toast.makeText(sample.this, "Please,Enter the number", Toast.LENGTH_SHORT).show();
                    return;
                }

                num11= Integer.parseInt(snum1);

                result1 = Math.sqrt(num11);
                result1_tv.setText(String.valueOf(result1));

            }
        } );

        log_bt.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                String snum1;
                snum1= num11_et.getText().toString();


                if(snum1.isEmpty()){
                    Toast.makeText(sample.this, "Please,Enter the number", Toast.LENGTH_SHORT).show();
                    return;
                }

                num11= Integer.parseInt(snum1);

                result1 = Math.log(num11);
                result1_tv.setText(String.valueOf(result1));

            }
        } );

    }
}
