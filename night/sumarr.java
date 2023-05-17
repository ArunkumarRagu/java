import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.printf("Pair found: (%d,%d)",arr[i],arr[j]);
                    
                }  
            }
        }
    }
}