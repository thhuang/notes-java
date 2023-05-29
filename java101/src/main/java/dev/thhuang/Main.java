package dev.thhuang;

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
    }
}

class Dog {
    String name;
    int age;
    String color;

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