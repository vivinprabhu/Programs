// compile-time polymorphism
// same method name but different parameters - method overloading


// Run-Time Polymorphism
// Overriding - same method name, parameter, return type and same access modifier or public access modifier

import java.util.*;

class Animal { //parent class or super class
    public void print() {
        System.out.println("Animal");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal { //subclass
    @Override 
    public void print() {
        System.out.println("Dog");
    }
}

class Puppy extends Dog { 
    public void print() {
        System.out.println("Puppy");
    }
}

class Pig extends Animal {
    public void print() {
        System.out.println("Pig");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();
        Animal d = new Dog();
        Animal p = new Pig();
        Dog pu = new Puppy();
        p.print();
        a.print();
        d.print();
        pu.print();
        d.sleep();
    }
}