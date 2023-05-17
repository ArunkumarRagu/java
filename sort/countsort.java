import java .util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        int max =0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
             if(max<arr[i]){
             max=arr[i]; 
             }       
            }
         int carr[]=new int[max+1];
        //  System.out.print(max);

        for(int i=0;i<=max;i++){
            carr[i]=0;
        }
        for(int i=0;i<n;i++){
            carr[arr[i]]++;
            
        }
        for(int i=1;i<=max;i++){
            carr[i]+=carr[i-1];    
        }
        for(int i=1;i<=max;i++){
            System.out.print(carr[i]+" ");    
        }
    }
}