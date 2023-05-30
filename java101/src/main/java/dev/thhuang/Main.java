package dev.thhuang;

import java.lang.Math;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        Dog dog1 = new Dog();
        dog1.info();
        dog1.barking();

        Dog dog2 = new Dog("dog", 5, "black");
        dog2.info();
        dog2.barking();

        Dog dog3 = new BrownDog();
        dog3.info();
        dog3.barking();

        Employee.run();
        System.out.println(Employee.Id);

        Number x = 10.123;
        System.out.println(Math.abs(x.byteValue()));

        int y = 180;
        System.out.println(Math.toRadians(y));
    }
}

class Dog {
    protected String name;
    protected int age;
    protected String color;

    Dog() {
        name = "default";
        age = 123;
        color = "white";
    }

    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void barking() {
        System.out.println("bark!");
    }

    void info() {
        System.out.println(name + ' ' + age + ' ' + color);
    }
}

class BrownDog extends Dog {
    BrownDog() {
        this.color = "Brown";
    }

    void barking() {
        System.out.println("yo!");
    }
}

class Employee {

    static int Id = 137;

    // this instance variable is visible for any child class.
    public String name;

    // salary  variable is visible in Employee class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public Employee(String empName) {
        name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp() {
        System.out.println("name  : " + name);
        System.out.println("salary :" + salary);
    }

    public static void run() {
        Employee empOne = new Employee("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}