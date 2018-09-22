package com.example.tram.laptrinhsukien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tram.sukien.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editsoA, editsoB;
    Button btn_button;
    TextView btkq;
    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editsoA = (EditText) findViewById(R.id.editText1);
        editsoB = (EditText) findViewById(R.id.editText2);
        btn_button = (Button) findViewById(R.id.btnbutton);
        btn_button.setOnClickListener(this);
        btkq =(TextView) findViewById(R.id.btn_kq) ;


            }

    @Override
    public void onClick(View v) {
    int a= Integer.parseInt(editsoA.getText()+"");
    int b= Integer.parseInt(editsoB.getText()+"");
    btkq.setText((a+b)+"");
    }


    }

