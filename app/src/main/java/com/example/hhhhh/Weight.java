package com.example.hhhhh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public  class Weight extends AppCompatActivity  implements View.OnClickListener {
    Button B_0, B_1, B_2, B_3, B_4, B_5, B_6, B_7, B_8, B_9,
            B_CE, B_KG, B_G, B_T,B_deng,B_CM,B_M,B_KM;
    EditText editText1, editText2;
    Spinner s1;
    String  op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_conversion);
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
        B_CE = (Button) findViewById(R.id.ce);
        B_KG = (Button) findViewById(R.id.kg);
        B_G = (Button) findViewById(R.id.g);
        B_T = (Button) findViewById(R.id.t);
        B_deng = (Button) findViewById(R.id.deng);
        B_CM = (Button) findViewById(R.id.cm);
        B_M = (Button) findViewById(R.id.mi);
        B_KM = (Button) findViewById(R.id.qm);


//        B_KG1 = (Button)findViewById(R.id.kg);
        editText1 = (EditText) findViewById(R.id.edit_input1);
        editText2 = (EditText) findViewById(R.id.edit_input2);
        s1 = (Spinner) findViewById(R.id.spinner);


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
        B_KG.setOnClickListener(this);
        B_G.setOnClickListener(this);
        B_T.setOnClickListener(this);
        B_deng.setOnClickListener(this);
        B_CM.setOnClickListener(this);
        B_M.setOnClickListener(this);
        B_KM.setOnClickListener(this);


        final List<String> list = new ArrayList<>();
        list.add("g");
        list.add("kg");
        list.add("t");
        list.add("cm");
        list.add("m");
        list.add("km");
        list.add("cm^2");
        list.add("m^2");
        list.add("km^2");
        list.add("miu");
        list.add("s");
        list.add("h");
        list.add("mm^3");
        list.add("cm^3");
        list.add("m^3");



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        s1.setAdapter(adapter);
        s1.setPrompt("请选择换算单位");
        //下拉事件监听器

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                op = list.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.ling:
                editText1.append("0");
                break;
            case R.id.yi:
                editText1.append("1");
                break;
            case R.id.er:
                editText1.append("2");
                break;
            case R.id.san:
                editText1.append("3");
                break;
            case R.id.si:
                editText1.append("4");
                break;
            case R.id.wu:
                editText1.append("5");
                break;
            case R.id.liu:
                editText1.append("6");
                break;
            case R.id.qi:
                editText1.append("7");
                break;
            case R.id.ba:
                editText1.append("8");
                break;
            case R.id.jiu:
                editText1.append("9");
                break;
            case R.id.ce:
                editText1.setText("");
                break;
            case R.id.kg:
                editText1.append("K");
                break;
            case R.id.g:
                editText1.append("G");
                break;
            case R.id.t:
                editText1.append("T");
                break;
            case R.id.cm:
                editText1.append("厘米");
                break;
            case R.id.mi:
                editText1.append("米");
                break;
            case R.id.qm:
                editText1.append("千米");
                break;




            case R.id.deng:


                try {
                    getConversion();
                    break;
                } catch (Exception e) {
                    Toast.makeText(Weight.this, "输入有误！", Toast.LENGTH_SHORT).show();
                }
        }


    }




    //取输入值   计算结果
    public  void getConversion(){
        String in1 = editText1.getText().toString();
//        String in2 = op;
        WeightConversion c = new WeightConversion();
        double  Din = c.compute(in1,op);
        editText2.setText(Din+"");

    }


}











