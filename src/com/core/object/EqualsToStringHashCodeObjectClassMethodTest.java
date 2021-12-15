package com.core.object;

public class EqualsToStringHashCodeObjectClassMethodTest {

    public static void main(String[] args) {
        Student s1 = new Student("s201",45990.78,"bhubaneswar");
        Student s2 = new Student("s201",45990.78,"bhubaneswar");

        if(s1.equals(s2))
            System.out.println("s1 and s2 both are equal");
        else
            System.out.println("s1 and s2 both are not equal");
        System.out.println(s1.hashCode());
        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));
    }
}
