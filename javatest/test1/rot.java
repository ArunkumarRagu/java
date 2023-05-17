import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr1[]={2,5,6,8,9,10};
        int arr2[] = new int[arr1.length];
        int count=0;
        for(int i=0;i<arr1.length;i++){
            arr2[i]= sc.nextInt();
            if(arr1[0]==arr2[i]){
                System.out.println("The Array is rotated " + i+ " times");
            }
            
        }
        
    }
}