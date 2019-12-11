package com.example.hhhhh;

import java.util.StringTokenizer;

public class WeightConversion {

    public  double compute(String ex1,String ex2){
//        StringTokenizer s1 = new StringTokenizer(ex1, "KGT", true);
        Double d1=null;
        if(!"".equals(ex1) ){
            //转换成吨
            if (ex2.equals("t")) {
                  if(ex1.contains("T")){
                      String str1=ex1.substring(0, ex1.indexOf("T"));
                      d1 = Double.parseDouble(str1);

                  }
                if(ex1.contains("K")){
                    String str1=ex1.substring(0, ex1.indexOf("K"));
                    d1 = Double.parseDouble(str1);
                    d1 = d1/1000;

                }
                if(ex1.contains("G")){
                    String str1=ex1.substring(0, ex1.indexOf("G"));
                    d1 = Double.parseDouble(str1);
                    d1 = (Double) d1/1000000;

                }

            }
            //转换成千克
            if (ex2.equals("kg")) {
                if(ex1.contains("T")){
                    String str1=ex1.substring(0, ex1.indexOf("T"));
                    d1 = Double.parseDouble(str1);
                    d1 =(Double) d1*1000;

                }
                if(ex1.contains("K")){
                    String str1=ex1.substring(0, ex1.indexOf("K"));
                    d1 = Double.parseDouble(str1);


                }
                if(ex1.contains("G")){
                    String str1=ex1.substring(0, ex1.indexOf("K"));
                    d1 = Double.parseDouble(str1);
                    d1 = (Double) d1/1000;
                }

            }

            //转换成克
            if (ex2.equals("g")) {
                if(ex1.contains("T")){
                    String str1=ex1.substring(0, ex1.indexOf("T"));
                    d1 = Double.parseDouble(str1);
                    d1 = (Double) d1*1000000;

                }
                if(ex1.contains("K")){
                    String str1=ex1.substring(0, ex1.indexOf("K"));
                    d1 = Double.parseDouble(str1);
                    d1 = (Double) d1*1000;

                }
                if(ex1.contains("G")){
                    String str1=ex1.substring(0, ex1.indexOf("K"));
                    d1 = Double.parseDouble(str1);

                }

            }
            if(ex2.equals("cm")){
                if(ex1.contains("厘")){
                    String str1 = ex1.substring(0,ex1.indexOf("厘"));
                    d1 = Double.parseDouble(str1);
                }
                if(ex1.contains("米")){
                    String str1 = ex1.substring(0,ex1.indexOf("米"));
                    d1 = Double.parseDouble(str1);
                    d1 = (Double)d1*0.01;
                }
                if(ex1.contains("千米")){
                    String str1 = ex1.substring(0,ex1.indexOf("千"));
                    d1 = Double.parseDouble(str1);
                    d1 = (Double)d1*0.00001;
                }
            }
            if(ex2.equals("m")){
                if(ex1.contains("厘米")){
                    String str1 = ex1.substring(0,ex1.indexOf("厘"));
                    d1 = Double.parseDouble(str1);
                    d1 = d1*0.01;
                }
                if(ex1.contains("米")){
                    String str1 = ex1.substring(0,ex1.indexOf("米"));
                    d1 = Double.parseDouble(str1);

                }
                if(ex1.contains("千米")){
                    String str1 = ex1.substring(0,ex1.indexOf("千"));
                    d1 = Double.parseDouble(str1);
                    d1 = (Double)d1*1000;
                }
            }
            if(ex2.equals("km")){
                if(ex1.contains("厘米")){
                    String str1 = ex1.substring(0,ex1.indexOf("厘"));
                    d1 = Double.parseDouble(str1);
                    d1 = (Double) d1*0.00001;
                }
                if(ex1.contains("米")){
                    String str1 = ex1.substring(0,ex1.indexOf("米"));
                    d1 = Double.parseDouble(str1);
                    d1 = (Double)d1*0.001;
                }
                if(ex1.contains("千米")){
                    String str1 = ex1.substring(0,ex1.indexOf("千"));
                    d1 = Double.parseDouble(str1);
                }
            }



        }
        return d1;
    }

}
