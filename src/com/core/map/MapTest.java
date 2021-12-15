package com.core.map;

import java.util.HashMap;

public class MapTest {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("A","first");
        map.put("B","second");
        map.put("C","third");

        if(map.get("B") != null){
            map.put("B","second-update");
        }
        System.out.println(map);
    }
}
