package com.core.program;

import java.util.*;

public class ShowRepeatedString {

    public static void main(String[] args) {
        String value = "I Love India I Like India";
        String values[] = value.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String input: values){
            if(Objects.nonNull(map.get(input))) {
                map.put(input,map.get(input)+1);
            }else{
                map.put(input,1);
            }
        }
        Set<String> set = map.keySet();
        for (String repeatedValue:set){
            if(map.get(repeatedValue) > 1)
                System.out.println(repeatedValue);
        }

        //second approach
        List<String> list = Arrays.asList(value);
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }

    }
}
