import java.util.*;
class Trap{
    public static void main(String args[]){
        int arr[]={2,1,5,4,6,7};
        int size=arr.length;
        int n=size-2;
        if(arr[0]<arr[size-1]){
            System.out.println(arr[0]*n);
        }
        else{
            System.out.println(arr[size-1]*n);
        }

    }
}