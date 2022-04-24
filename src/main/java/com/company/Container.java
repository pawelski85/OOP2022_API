package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Container<T> {
    List<T> list;
    public static int counter=0;

    public Container(List<T> list) {
        this.list = list;

    }

    public void addToList(T ob){
        this.list.add(ob);
        counter++;
    }
}
