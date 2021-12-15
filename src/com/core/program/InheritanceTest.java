package com.core.program;

class Parent {
  public void testMethod(){
      System.out.println("testMethod() of Parent class");
  }

  public void fun1(){
      System.out.println("fun1() of parent");
  }
}

class Child extends Parent{
    public void testMethod(){
        System.out.println("testMethod() of Child class");
    }
    public void fun2(){
        System.out.println("fun2() of child");
    }
}

public class InheritanceTest {

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.testMethod();
        obj.fun1();
        Child obj2 = (Child) new Parent();
        obj2.fun2();
        obj2.testMethod();
        obj2.fun2();
    }
}
