package com.code.ds.examples;

import java.util.List;

public class ArrayList {

    public static void main (String[] args) {

        List<Employee> employeeList = new java.util.ArrayList<>();
        employeeList.add( new Employee("jane", "jones", 123));
        employeeList.add(new Employee("mary" , "smith", 234));
        employeeList.add(new Employee("mike" , "wilson", 1123));
        employeeList.add(new Employee("john" , "Doe", 2298));

        for (Employee emp: employeeList
             ) {
            System.out.println("Employee = "+emp);

        }
        System.out.println(employeeList.size());
        System.out.println(employeeList.get(1));
        System.out.println(employeeList.get(3));
        System.out.println(employeeList.isEmpty());

        System.out.println(employeeList.contains(new Employee("john", "Doe", 2298)));

    }
}
