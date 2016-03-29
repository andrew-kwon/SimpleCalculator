package com.example.administrator.calculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    private Button add,sub,mult,div,back;
    private TextView text1,text2,setText,result;
    private int nowA=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);
        result = (TextView) findViewById(R.id.result);
        setText=text1;
        text1.setTextColor(0xFF0000FF);

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button10);
        add = (Button) findViewById(R.id.Add);
        sub = (Button) findViewById(R.id.sub);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        back = (Button)findViewById(R.id.back);


        text1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setText=text1;
                text1.setTextColor(0xFF0000FF);
                text2.setTextColor(0xFF707070);
                nowA=1;

            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText=text2;
                text2.setTextColor(0xFF0000FF);
                text1.setTextColor(0xFF707070);
                nowA=0;
            }
        });

        back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if(nowA==1)
                    setText.setText("1Value : ");
                else setText.setText("2Value : ");

            }
        });

        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText.append("1");
            }
        });
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText.append("2");
            }
        });
        btn3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText.append("3");
            }
        });btn4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText.append("4");
            }
        });btn5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText.append("5");
            }
        });btn6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText.append("6");
            }
        });btn7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText.append("7");
            }
        });
        btn8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText.append("8");
            }
        });
        btn9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText.append("9");
            }
        });
        btn0.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText.append("0");
            }
        });
        add.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A=text1.getText().toString();
                String B=text2.getText().toString();
                String[] Astring=A.split(":");
                String[] Bstring=B.split(":");

                if(Astring[1].trim().equals("") || Bstring[1].trim().equals(""))
                {
                    result.setText("수를 입력하세요");
                }
                else {
                    int numInt = Integer.parseInt(Astring[1].trim());
                    int numInt2 = Integer.parseInt(Bstring[1].trim());

                    String changeA = String.valueOf(numInt + numInt2);

                    result.setText(changeA);
                }
            }
        });sub.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A=text1.getText().toString();
                String B=text2.getText().toString();
                String[] Astring=A.split(":");
                String[] Bstring=B.split(":");
                if(Astring[1].trim().equals("") || Bstring[1].trim().equals(""))
                {
                    result.setText("수를 입력하세요");
                }
                else {
                    int numInt = Integer.parseInt(Astring[1].trim());
                    int numInt2 = Integer.parseInt(Bstring[1].trim());

                    String changeA = String.valueOf(numInt - numInt2);

                    result.setText(changeA);
                }
            }
        });mult.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = text1.getText().toString();
                String B = text2.getText().toString();
                String[] Astring = A.split(":");
                String[] Bstring = B.split(":");
                if(Astring[1].trim().equals("") || Bstring[1].trim().equals(""))
                {
                    result.setText("수를 입력하세요");
                }
                else {
                    int numInt = Integer.parseInt(Astring[1].trim());
                    int numInt2 = Integer.parseInt(Bstring[1].trim());

                    String changeA = String.valueOf(numInt * numInt2);

                    result.setText(changeA);
                }
            }
        });
        div.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = text1.getText().toString();
                String B = text2.getText().toString();
                String[] Astring = A.split(":");
                String[] Bstring = B.split(":");
                if(Astring[1].trim().equals("") || Bstring[1].trim().equals(""))
                {
                    result.setText("수를 입력하세요");
                }
                else {
                    int numInt = Integer.parseInt(Astring[1].trim());
                    int numInt2 = Integer.parseInt(Bstring[1].trim());
                    if (numInt2 == 0) {
                        result.setText("나눌 수 없습니다.");
                    } else {
                        String changeA = String.valueOf((float) numInt / (float) numInt2);

                        result.setText(changeA);
                    }
                }
            }
        });
    }


}
