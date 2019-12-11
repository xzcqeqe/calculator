package com.example.hhhhh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public  class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button B_0, B_1, B_2, B_3, B_4, B_5, B_6, B_7, B_8, B_9,
            B_CE, B_sin, B_cos, B_mi, B_jia, B_minus, B_multi, B_chu,
            B_zuo, B_you, B_deng, B_dian, B_bin, B_oct, B_hex;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B_0 = (Button) findViewById(R.id.ling);
        B_1 = (Button) findViewById(R.id.yi);
        B_2 = (Button) findViewById(R.id.er);
        B_3 = (Button) findViewById(R.id.san);
        B_4 = (Button) findViewById(R.id.si);
        B_5 = (Button) findViewById(R.id.wu);
        B_6 = (Button) findViewById(R.id.liu);
        B_7 = (Button) findViewById(R.id.qi);
        B_8 = (Button) findViewById(R.id.ba);
        B_9 = (Button) findViewById(R.id.jiu);
        B_CE = (Button) findViewById(R.id.CE);
        B_sin = (Button) findViewById(R.id.sin);
        B_cos = (Button) findViewById(R.id.cos);
        B_mi = (Button) findViewById(R.id.mi);
        B_jia = (Button) findViewById(R.id.jia);
        B_minus = (Button) findViewById(R.id.minus);
        B_multi = (Button) findViewById(R.id.multi);
        B_chu = (Button) findViewById(R.id.chu);
        B_zuo = (Button) findViewById(R.id.zuo);
        B_you = (Button) findViewById(R.id.you);
        B_deng = (Button) findViewById(R.id.deng);
        B_dian = (Button) findViewById(R.id.dian);
        B_bin = (Button) findViewById(R.id.bin);
        B_oct = (Button) findViewById(R.id.oct);

        B_hex = (Button) findViewById(R.id.hex);
        editText = (EditText) findViewById(R.id.et_input);
//
        B_0.setOnClickListener(this);
        B_1.setOnClickListener(this);
        B_2.setOnClickListener(this);
        B_3.setOnClickListener(this);
        B_4.setOnClickListener(this);
        B_5.setOnClickListener(this);
        B_6.setOnClickListener(this);
        B_7.setOnClickListener(this);
        B_8.setOnClickListener(this);
        B_9.setOnClickListener(this);
        B_CE.setOnClickListener(this);
        B_sin.setOnClickListener(this);
        B_cos.setOnClickListener(this);
        B_mi.setOnClickListener(this);
        B_jia.setOnClickListener(this);
        B_minus.setOnClickListener(this);
        B_multi.setOnClickListener(this);
        B_chu.setOnClickListener(this);
        B_dian.setOnClickListener(this);
        B_deng.setOnClickListener(this);
        B_zuo.setOnClickListener(this);
        B_you.setOnClickListener(this);
        B_bin.setOnClickListener(this);
        B_oct.setOnClickListener(this);
        B_hex.setOnClickListener(this);
//        editText.setOnClickListener(this);
//
    }


    @Override
    public void onClick (View v){
//        String str = editText.getText().toString();
        switch (v.getId()) {
            case R.id.ling:
                editText.append("0");
                break;
            case R.id.yi:
                editText.append("1");
                break;
            case R.id.er:
                editText.append("2");
                break;
            case R.id.san:
                editText.append("3");
                break;
            case R.id.si:
                editText.append("4");
                break;
            case R.id.wu:
                editText.append("5");
                break;
            case R.id.liu:
                editText.append("6");
                break;
            case R.id.qi:
                editText.append("7");
                break;
            case R.id.ba:
                editText.append("8");
                break;
            case R.id.jiu:
                editText.append("9");
                break;
            case R.id.CE:
                editText.setText("");
                break;
            case R.id.jia:
                editText.append("+");
                break;
            case R.id.minus:
                editText.append("-");
                break;
            case R.id.multi:
                editText.append("*");
                break;
            case R.id.chu:
                editText.append("/");
                break;
            case R.id.dian:
                editText.append(".");
                break;
            case R.id.zuo:
                editText.append("(");
                break;
            case R.id.you:
                editText.append(")");
                break;
//
            case R.id.mi:
                editText.append("^");

                break;
            case R.id.bin:
                String strBin = editText.getText().toString();
                editText.setText(Integer.toBinaryString(Integer.parseInt(strBin)));
                break;
            case R.id.oct:
                String strOct = editText.getText().toString();
                editText.setText(Integer.toOctalString(Integer.parseInt(strOct)));
                break;
            case R.id.hex:
                String strHex = editText.getText().toString();
                editText.setText(Integer.toHexString(Integer.parseInt(strHex)));
                break;
            case R.id.cos:
                editText.append("cos");
                break;
            case R.id.sin:
                editText.append("sin");
                break;

            case R.id.deng:


                try {
                    getResult();
                    break;
                } catch (Exception e) {
                    editText.setText("输入有误！");
                }
//            default:
//                break;
////
        }
    }


    public void getResult() {
        String in = editText.getText().toString();
        in =transform(in);


        Conduct c = new Conduct();
        double  Din = c.computeWithStack(in);
        editText.setText(Din+"");
    }

    private static String transform(String expression) {
        //先把表达式中的SIN cos转换成单字符
        expression = expression.replace("sin", "s");
        expression = expression.replace("cos", "c");
        //把表达式中的负号前添加0
        char[] arr = expression.toCharArray();
        String resultstring = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '-') {
                if (i == 0) {
                    arr[i] = '~';
                } else {
                    char c = arr[i - 1];
                    if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == 'E' || c == 'e' || c == 's' || c == 'c' || c == '²' || c == '³' || c == '^' || c == 't') {
                        arr[i] = '~';
                    }
                }
            }
        }
        //System.out.println(arr);
        if (arr[0] == '~' || arr[1] == '(') {
            arr[0] = '-';
            resultstring = "0" + new String(arr);
            //若首位数字为负数
            //则将已经转换好的负数的符号变更为'0-**'
        } else {
            resultstring = new String(arr);
        }
        /**
         * 以下为新增代码,表达式最前面的~已被解决，下面使用遍历的方法插入零，
         */
        int strlen = expression.length();
        StringBuilder sb = new StringBuilder(resultstring);
        int index=0;
        char c;
        while (index < strlen){
            c = sb.charAt(index);
            if (c == '~'){
                sb.insert(index,"0");
                index++;
                strlen++;
            }
            index++;
        }
        resultstring = sb.toString();
        resultstring = resultstring.replace("~","-");
        return  resultstring;
    }


    //菜单选项
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.more,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case  R.id.help_item:
                Intent in1 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(in1);
                break;
            case  R.id.c_weight:
                Intent in2 =  new Intent(MainActivity.this, Weight.class);
                startActivity(in2);
                break;
        }
        return  true;


    }


}



