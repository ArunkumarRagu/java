import java.util.*;
class main{
    public static void main(String args[]){
        int n=10;
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int x=11;
        int pos = 5;
        int arr1[] = new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i<pos-1){
                arr1[i]=arr[i];
            }
            else if(i==pos-1){
                arr1[i]=x;
            }
            else{
                arr1[i]=arr[i-1];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n+1;i++){
            System.out.print(arr1[i]+" ");
        }


    }
}