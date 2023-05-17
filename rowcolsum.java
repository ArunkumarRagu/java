import java.util.*;
class matrix
{
    public static void main(String[] args)
    {
        int row,col;
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int sumrow,sumcol;
        row=arr.length;
        col=arr[0].length;
        for(int i=0;i<row;i++)
        {   
            sumrow=0;
            for(int j=0;j<col;j++)
            {
             sumrow=sumrow+arr[i][j]  ; 
            }
            System.out.print(sumrow+" ");
        }
            System.out.println();

        for(int i=0;i<row;i++)
        {   sumcol=0;
            for(int j=0;j<col;j++)
            {
              sumcol=sumcol+arr[j][i];  

            }
            System.out.print(sumcol+" ");

        }
    }
}