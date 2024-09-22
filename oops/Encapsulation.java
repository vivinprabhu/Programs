import java.util.*;

class Login {
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

class Encapsulation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Login l = new Login();
        String name = sc.next();
        l.setName(name);
        System.out.println(l.getName());
    }
}