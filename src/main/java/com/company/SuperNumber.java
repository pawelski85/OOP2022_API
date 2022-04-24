package com.company;

import java.util.function.BinaryOperator;

public class SuperNumber<T extends Number> {
    T value;

    public SuperNumber(T value) {
        this.value = value;
    }

    public void prinValue(T value){
        System.out.println(value.getClass().getName());
    }

    public double doubleValues(T value){
        return value.doubleValue();
    }
    public int intValues(T value){
        return value.intValue();
    }
    boolean isEqual(SuperNumber<?> ob){
        return value.doubleValue()==ob.value.intValue();
    }


}
