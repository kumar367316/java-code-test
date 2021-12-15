package com.core.program;

import java.util.HashMap;

public class ListStringObjTest {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        String str1 = "abc";
        String str2 = new String("abc");

        map.put(str1,1);
        map.put(str2,2);
        String str3 = new String("abc");
        System.out.println(map.get(str3));
        System.out.println(map.entrySet().size());

        Object obj = new Object();


    }
}
