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
                if(i<=j){
            System.out.print(arr[i][j]+ " ");}
            else
            System.out.print("0 ");
           
            }
        }
         System.out.println();

        for(int i=0;i<row;i++,System.out.println()){
            for(int j=0;j<col;j++){
                if(i>=j){
            System.out.print(arr[i][j]+ " ");}
            else
            System.out.print("0 ");
            }
        }

        
    }
}