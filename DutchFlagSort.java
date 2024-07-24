import java.util.*;
class DutchFlagSort
{
    private static void DutchFlag(int[] arr)
    {
        int start = 0;
        int mid = 0;
        int end = arr.length-1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,start);
                mid++;
                start++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(arr,mid,end);
                end--;
            }
        }
    }

    private static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        for(int i=0;i<s.length;i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        
        DutchFlag(arr);
        
        for(int i=0;i<s.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}