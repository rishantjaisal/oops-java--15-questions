package Java_OOPS_Program;

abstract class Animal {
    abstract void sound();

    void display() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class OOPDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Addition of two integers = " + c.add(10, 20));
        System.out.println("Addition of three integers = " + c.add(10, 20, 30));
        System.out.println("Addition of two doubles = " + c.add(10.5, 20.5));

        Animal animal = new Dog();
        animal.display();
        animal.sound();
    }
}
