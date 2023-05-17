import java.util.*;
class main{
    public static void main(String args[]){
        int arr1[]={1,2,5};
        int arr2[]={2,4,15};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}