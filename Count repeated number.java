import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num[] = {1,2,3,4,5,6,1,3,5,6,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: num)
        {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        
        int max = 0;
        for(int count: map.values())
        {
            if(count>max)
            {
                max = count;
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == max)
            {
                System.out.print(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}