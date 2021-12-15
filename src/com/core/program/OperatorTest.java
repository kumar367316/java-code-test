package com.core.program;

public class OperatorTest {

    public static void main(String[] args) {
        int a=1,b=2,c=3;
        a|=4;
        System.out.println("a:"+a);
        b>>=1;
        System.out.println("b:"+b);
        c<<=1;
        System.out.println("c:"+c);
        a^=c;
        System.out.println("a:"+a);
        System.out.println(a+" "+b+" "+c);

    }
}
