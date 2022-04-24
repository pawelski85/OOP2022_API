package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
//        APIData connector = new APIData();
//        try {
//            String data = connector.getCurrencyData();
//            String[] array = data.split(",");
//
//            String numberValue;
//            Double plnValue;
//
//            for (String s : array) {
//                if (s.contains("PLN")) {
//                    numberValue = s.split(":")[1];
//                    plnValue = Double.parseDouble(numberValue);
//                    System.out.println(plnValue);
//                }
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }


        //TASK 15
        SuperNumber<Double> superNumber = new SuperNumber<>(3.0);
        SuperNumber<Integer> superNumber2 = new SuperNumber<>(3);

        superNumber.prinValue(superNumber.value);
        System.out.println(superNumber.doubleValues(superNumber.value));
        System.out.println(superNumber.intValues(superNumber.value));
        System.out.println(superNumber.isDoubleEqualInt());
        System.out.println(superNumber.isEqual(new SuperNumber<Integer>(4)));
        System.out.println(superNumber2.isEqual2(new SuperNumber<Double>(3.0)));


    }
}