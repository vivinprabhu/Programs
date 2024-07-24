import java.util.*;
class SprialMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = {
                    {1,2,3,4},
                    {14,14,16,5},
                    {13,20,17,6},
                    {12,19,18,7},
                    {11,10,9,8}
                };

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = a.length;
        int colEnd = a[0].length;
        
        while(rowStart<rowEnd)
        {
            for(int i=colStart;i<colEnd;i++)
            {
                System.out.print(a[rowStart][i]+" ");
            }
            rowStart+=1;

            for(int i=rowStart;i<rowEnd;i++)
            {
                System.out.print(a[i][colEnd-1] + " ");
            }
            colEnd-=1;

            for(int i=colEnd-1;i>=colStart;i--)
            {
                System.out.print(a[rowEnd-1][i] + " ");
            }
            rowEnd-=1;

            if(colStart<colEnd)
            {
                for(int i=rowEnd-1;i>=rowStart;i--)
                {
                    System.out.print(a[i][colStart] + " ");
                }
                colStart+=1;
            }
        }
    }
}