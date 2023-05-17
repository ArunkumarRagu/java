import  java.util.*;
class main{
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int count =0;
        for(int j =0;j<n-1;j+=arr[j]){
            if(arr[j] != 0){
                count++;
            }
            else{
                break;
            }
        }
        System.out.print(count);

    }
}