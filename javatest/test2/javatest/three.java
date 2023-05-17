import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int i=1;
        int j=1;
        // int c = sc.nextInt();
        // int arr[][] = new int[r][c];
        for( i=1;i<=r;i++){
            for( j=1;j<=r;j++){
                if(i==j){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(i=r-1;i<1;i--){
            for(j=r+;j>=1;j--){
                if(i==j){
                    System.out.print(i+r);
                }
            }
        }
    }
}