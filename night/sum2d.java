import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++,System.out.println()){
            for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();}
        }
        for(int i=0;i<row;i++,System.out.println()){
            for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+ " ");
            }
        }
        int sum=0;
        // for(int i=0;i<row;i++,System.out.println()){
        //     for(int j=0;j<col;j++){
        //     sum = sum+arr[i][j];
        //     }
        // }
        for(int i=0;i<row;i++,System.out.println()){
            for(int j=0;j<col;j++){
                
            sum = sum+arr[i][j];
            }
            System.out.print("sum of "+ (i+1) +"row = "+sum);
        }
    }
}