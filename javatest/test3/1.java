import java.util.*;
class main{
    public static void main(String args[]){
        int arr[]={16,1,2,0,4,2,7,1,2,14};
        int arr1[]=new int[arr.length];
        int sum=0,minus;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                minus = Math.abs(arr[j]-arr[i]);
                sum = sum + minus;
            }
            arr1[i]=sum;
             sum=0;
        }
        int min=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(min>=arr1[i]){
                min = arr1[i];
            }
        }
        System.out.print(min);

    }
}