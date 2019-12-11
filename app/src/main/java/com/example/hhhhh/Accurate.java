package com.example.hhhhh;

public class Accurate {

    /**
     * 正弦函数
     */
    public static double sin(String v) {
        Double str = Double.valueOf(v);
        double a = 0;
        a = Math.round(Math.sin(str*Math.PI/180)*100);
        return a/100;
    }


    /**
     * 余弦函数
     * @param v
     * @return
     */
    public static double cos(String v) {
        Double str = Double.valueOf(v);
        double a = 0;
        a = Math.round(Math.cos(str*Math.PI/180)*100);
        return a/100;
    }

    /**
     * 正切函数
     * @param v 要计算的字符串
     * @return 正切值
     */
}
