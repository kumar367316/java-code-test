package com.core.program;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Example {

    public static void main(String[] args) {
        //List<Integer> list = Arrays.asList(5, 3, 4,9, 1, 3, 7, 2, 9, 9, 4);

        List<String> list = Arrays.asList("I", "Love", "India", "I", "Like", "India");

        List<String> result = list.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()))    // create a map {1=1, 2=1, 3=2, 4=2, 5=1, 7=1, 9=2}
                .entrySet().stream()                 // Map -> Stream
                .filter(m -> m.getValue() > 1)       // if map value > 1, duplicate element
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        Employee e1 = new Employee(100, "AB", 19000);
        Employee e2 = new Employee(101, "CD", 76000);
        Employee e3 = new Employee(104, "PQ", 65000);
        Employee e4 = new Employee(103, "YH", 40000);
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        List<Employee> employeeSalaryList = employeeList.stream().filter(employee -> employee.getEmpSalary() > 50000).
                collect(Collectors.toList());
        System.out.println("Employee Salary Sorting:"+employeeSalaryList);

        employeeList.stream().map(Employee::getEmpName).collect(Collectors.toList()).forEach(System.out::println);



    }
}
