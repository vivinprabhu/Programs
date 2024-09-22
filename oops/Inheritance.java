import java.util.*;

class T {
    public void print() {
        System.out.println("Cat is walking");
    }
}

class V extends T {
    public void print1() {
        System.out.println("Dog is sleeping");
    }
}

class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V v = new V();
        v.print();    
        v.print1();    
    }
}