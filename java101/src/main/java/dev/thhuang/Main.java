package dev.thhuang;

import java.lang.*;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.*;
import java.util.regex.*;

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

        int[] array = new int[10];
        for (int i = 0; i < array.length; ++i) {
            array[i] = i * i;
        }
        for (int v : array) {
            System.out.printf("%d ", v);
        }
        System.out.println();

        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy-MM-dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(now));
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.println(utc.format(DateTimeFormatter.ISO_INSTANT));

        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
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

class OuterDemo {
    // private variable of the outer class
    private int num = 175;

    // inner class
    public class InnerDemo {
        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return num;
        }
    }
}

class NestedClassDemo {
    public static void main(String[] args) {
        // Instantiating the outer class
        OuterDemo outer = new OuterDemo();

        // Instantiating the inner class
        OuterDemo.InnerDemo inner = outer.new InnerDemo();
        System.out.println(inner.getNum());
    }
}

abstract class AnonymousInner {
    public abstract void myMethod();
}

class OuterDemo2 {
    public static void main(String[] args) {
        AnonymousInner inner = new AnonymousInner() {
            public void myMethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.myMethod();
    }
}

interface Message {
    String greet();
}

class AnonymousClassArg {
    // method which accepts the object of interface Message
    public void displayMessage(Message m) {
        System.out.println(m.greet() +
                ", This is an example of anonymous inner class as an argument");
    }

    public static void main(String args[]) {
        // Instantiating the class
        AnonymousClassArg obj = new AnonymousClassArg();

        // Passing an anonymous inner class as an argument
        obj.displayMessage(new Message() {
            public String greet() {
                return "Hello";
            }
        });
    }
}

class OuterDemo3 {
    static class NestedDemo {
        public void myMethod() {
            System.out.println("This is my nested class");
        }
    }

    public static void main(String[] args) {
        OuterDemo3.NestedDemo nested = new OuterDemo3.NestedDemo();
        nested.myMethod();
    }
}