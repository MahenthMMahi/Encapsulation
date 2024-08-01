package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setName("Tom");
        employee1.setSalary(100000);

        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());
    }
}