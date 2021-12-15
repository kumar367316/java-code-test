package com.core.object;

public class ObjectClassCloneMethodTest implements Cloneable{

    int i = 10;
    int j = 20;
    public static void main(String[] args) throws CloneNotSupportedException{
        ObjectClassCloneMethodTest t1 = new ObjectClassCloneMethodTest();
        System.out.println(t1.i + "  "+t1.j);

        ObjectClassCloneMethodTest t2 = (ObjectClassCloneMethodTest) t1.clone();
        t2.i = 30;
        t2.j = 40;
        System.out.println(t2.i + "  "+t2.j);

        System.out.println(t1.i + "  "+t1.j);

    }
}
