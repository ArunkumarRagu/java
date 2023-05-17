import java.util.*;
class main{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        } 
        System.out.println();


        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    
        int tdarr[][] ={{1,2},{3,4},{5,6}};
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(tdarr[i][j] + " ");
            }
            System.out.println();
            
        }
System.out.println();
        for( int[] a : tdarr){
            for(int b : a){
                System.out.print(b  + " ");
            }
            System.out.println();
        }
    }
}