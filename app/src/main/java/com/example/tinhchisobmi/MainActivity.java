package com.example.tinhchisobmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btnBMI;
    EditText edtTen,edtCanNang,edtChieuCao,edtBMI,edtChuanDoan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBMI = findViewById(R.id.btnBMI);
        edtTen = findViewById(R.id.edtTen);
        edtCanNang = findViewById(R.id.edtCanNang);
        edtChieuCao = findViewById(R.id.edtChieuCao);
        edtBMI = findViewById(R.id.edtBMI);
        edtChuanDoan = findViewById(R.id.edtChuanDoan);
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double H = Double.parseDouble(edtChieuCao.getText()+"");
                double W = Double.parseDouble(edtCanNang.getText()+"");
                double BMI = W/Math.pow(H, 2);
                String chuandoan="";
                if(BMI<18)
                {
                    chuandoan="Bạn Gầy";
                }
                else if(BMI<=24.9)
                {
                    chuandoan="Bạn Bình thường";
                }
                else if(BMI<=29.9)
                {
                    chuandoan="Người béo phì Câp I";

                }
                else if(BMI<=34.9)
                {
                    chuandoan = "Người béo phì cấp độ 2";
                }
                else
                {
                    chuandoan="Người béo phì cáp 3";
                }
                DecimalFormat dcf= new DecimalFormat("#.0");
                edtBMI.setText(dcf.format(BMI));
                edtChuanDoan.setText(chuandoan);
            }
        });
    }
}