import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
        // find data type
        float n = 10.05f;
        String s = String.valueOf(n);
        System.out.println(((Object)s).getClass().getName()); //java.lang.String
        
        //Date
        Date now = new Date();
        System.out.println(now); //Wed Sep 25 17:10:30 GMT 2024
        
        String s1 = "aabbb";
        String s2 = "aa";
        
        System.out.println(s1.compareTo(s2)); //3
    }
}