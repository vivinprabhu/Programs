import java.util.*;

abstract class Animal {
    public void print() {
        System.out.println("Abstraction");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void check(){};
}

interface i {
    public void yuvaraj();
}

class V implements i {
    public void yuvaraj() {
        System.out.print("Yuvaraj");
    }
}

class Dog extends Animal {
    // @Override
    // public void print() {
    //     System.out.println("Dog is barking");
    // }

    public void check() {
        System.out.print("check");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal d = new Dog();
        d.print();
        d.sleep();
        d.check();

        V v = new V();
        v.yuvaraj();
    }
}
