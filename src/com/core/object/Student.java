package com.core.object;

import java.util.Objects;

public class Student {

    private String sID;
    private double salary;
    private String address;

    public Student(String sID, double salary, String address) {
        this.sID = sID;
        this.salary = salary;
        this.address = address;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

 /*   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getsID(), student.getsID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getsID(), getSalary(), getAddress());
    }*/
}
