import java.util.*;
class main{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int arr[]= new int[n];
        int arr1[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr1[sum]=arr[i];
                sum++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                arr1[sum]=arr[i];
                sum++;
            }

        }
        for(int i=0;i<n;i++){
            
            System.out.print(arr1[i]+ " ");
        }
     }
}