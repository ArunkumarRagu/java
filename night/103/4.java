import java.util.*;
class main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n] ;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
          int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>0;j--){
                sum=arr[i]+arr[j];
               if(i==j){
                break;
               }
               for(int k=0;k<arr.length;k++){
                if(sum==arr[k]){
                    count++;
                }
               }
            }
        }
        System.out.print(count);
    }
}