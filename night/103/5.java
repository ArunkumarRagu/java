import java.util.*;
class main{
    public static void main(String args[]){
        int arr[]={16,17,4,3,5,2};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
        int temp=1;
        for (int j = i+1; j < arr.length; j++) {
        if(arr[i] <= arr[j])
        { 
        temp=0;
        break;
        } 
        }
        if(temp!=0)
        System.out.print(arr[i]+" ");
        }

    }
}



 
 
