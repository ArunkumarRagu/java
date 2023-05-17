import java.util.*;
class main{
    public static void main(String args[]){
        int arr[]={4,8,2,6,0,3};
        int len = arr.length;
        bubblesort(arr,len);
    }
    public static void bubblesort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                int temp=arr[i];
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
}