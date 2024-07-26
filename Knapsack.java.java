import java.util.*;
class Main
{
    public static int knapsack(int val[],int wt[],int W,int n)
    {
        int k[][] = new int[n+1][W+1];

        for(int i=0;i<=n;i++)
        {
            for(int w=0;w<=W;w++)
            {
                if(i==0||w==0)
                {
                    k[i][w] = 0;
                }
                else if(wt[i-1]<=w)
                {
                    k[i][w] = Math.max(val[i-1] + k[i-1][w-wt[i-1]] ,k[i+1][w]);
                }
                else
                {
                    k[i][w] = k[i-1][w]; 
                }
            }
        }
        return k[n][W];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int val[] = {100,200,300};
        int wt[] = {1,2,3};
        int w = 5;
        int n = val.length;
        System.out.print(knapsack(val,wt,w,n));
    }
}