package com.pentilku.konversi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_hasil;
    private EditText et_angka;
    private Double nilai=Double.NaN;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setbtn();
         btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nilai = Double.parseDouble(et_angka.getText().toString());
                operation(nilai);
            }
        });
    }

    public void setbtn()
    {
        et_angka=(EditText) findViewById(R.id.et_angka);
        tv_hasil=(TextView)findViewById(R.id.tv_hasil);
        btn = (Button)findViewById(R.id.btn);
    }

    public void operation(Double nilai)
    {
        if(nilai>=81)
        {
            tv_hasil.setText("A");
        }
        else if (nilai<=80 && nilai>=71 )
        {
            tv_hasil.setText("AB");
        }
        else if (nilai<=70 && nilai >=66)
        {
            tv_hasil.setText("B");
        }
        else if (nilai<=65 && nilai>=60)
        {
            tv_hasil.setText("BC");
        }
        else if (nilai<=59 && nilai >=50)
        {
            tv_hasil.setText("C");
        }
        else if(nilai<=49 && nilai>=30)
        {
            tv_hasil.setText("D");
        }
        else if (nilai<=29 && nilai>=0)
        {
            tv_hasil.setText("E");
        }
        else
        {
            tv_hasil.setText("Salah");
        }
    }

}
