import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = "1";
        int a = 15;
        int b = 5;

        System.out.println(" [ \"\" ]"); //print "" inside ""

        //predefined methods
        System.out.println(Integer.parseInt(s)); //1 (string to int)
        System.out.println(Integer.toString(a)); //15 (int to string)

        System.out.println(Integer.toString(a , 16)); //output:f  integer to hexa-decimal form (16 is radix) 
        System.out.println(Integer.parseInt("f" , 16)); //output:15 hexa-decimal to integer form (16 is radix)
        System.out.println(Integer.toBinaryString(a)); //1111 (Binary Form)

        System.out.println(Integer.compare(a,a)); //0 (a<b)
        System.out.println(Integer.compare(a,b)); //1 (a<b) true
        System.out.println(Integer.compare(b,a)); //-1 (b<a) false
        
        System.out.println(Integer.bitCount(10)); //output:2 because binary form of 10 is 1010 where "1" is 2 
        System.out.println(Integer.bitCount(a)); //output:4 because binary form of 15 is 1111 where "1" is 4 
        
        System.out.println(Integer.signum(0)); //output:0
        System.out.println(Integer.signum(10)); //output:1
        System.out.println(Integer.signum(-10)); //output:-1

        //predefined constants
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.SIZE); //32
        System.out.println(Integer.BYTES); //4
    }
}
