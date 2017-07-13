package com.example.phamm.calculatordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnnhan, btnchia, btntru, btncong, btncham, btnbang, btnam, btnxoa;
    TextView txthienthi, txtketqua;
    float num,ans;
    int operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             txtketqua.setText(txtketqua.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtketqua.setText(txtketqua.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtketqua.setText(txtketqua.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtketqua.setText(txtketqua.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtketqua.setText(txtketqua.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtketqua.setText(txtketqua.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtketqua.setText(txtketqua.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtketqua.setText(txtketqua.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtketqua.setText(txtketqua.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtketqua.setText(txtketqua.getText()+"9");
            }
        });
        btncham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtketqua.setText(txtketqua.getText()+".");
            }
        });
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num  = Float.parseFloat((String) txtketqua.getText());
                txtketqua.setText(" ");
                operation =1;
                txthienthi.setText(num+" +");
            }
        });
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String) txtketqua.getText());
                txtketqua.setText("");
                operation = 2;
                txthienthi.setText(num+" -");
            }
        });
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String) txtketqua.getText());
                txtketqua.setText("");
                operation = 3;
                txthienthi.setText(num+" /");
            }
        });
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String) txtketqua.getText());
                txtketqua.setText("");
                operation =4;
                txthienthi.setText(num+" *");
            }
        });
        btnbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num2 = Float.parseFloat((String) txtketqua.getText()) ;
                switch (operation){
                    case 1:
                        ans = num + num2;
                        txtketqua.setText(ans + "");
                        txthienthi.setText(num + " + " + num2);
                        break;
                    case 2:
                        ans = num - num2;
                        txtketqua.setText(ans+ "");
                        txthienthi.setText(num+" - "+num2);
                        break;
                    case 3:
                        ans = num /num2;
                        txtketqua.setText(ans+"");
                        txthienthi.setText(num+" / " + num2);
                        break;
                    case 4:
                        ans = num * num2;
                        txtketqua.setText(ans+"");
                        txthienthi.setText(num+" * "+num2);
                        break;
                }
            }
        });
        btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txthienthi.setText(null);
                txtketqua.setText(null);
            }
        });
        btnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Float.parseFloat((String)txtketqua.getText());
                num = num * (-1);
                txtketqua.setText(num+"");
            }
        });
    }
    private void AnhXa(){
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btncham = (Button) findViewById(R.id.btncham);
        btnchia = (Button) findViewById(R.id.btnchia);
        btnnhan = (Button) findViewById(R.id.btnnhan);
        btntru  = (Button) findViewById(R.id.btntru);
        btncong = (Button) findViewById(R.id.btncong);
        btnbang = (Button) findViewById(R.id.btnbang);
        btnam   = (Button) findViewById(R.id.btnam);
        btnxoa  = (Button) findViewById(R.id.btnxoa);

        txthienthi = (TextView) findViewById(R.id.txtHienThi);
        txtketqua  = (TextView) findViewById(R.id.txtKQ);
    }
}
