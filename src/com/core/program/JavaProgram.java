package com.core.program;

import java.util.LinkedList;
import java.util.List;

public class JavaProgram {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<5;i++)
            list.add(i);
        list.remove(2);
        System.out.println(list);

    }
}
