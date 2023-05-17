import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int search = sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
        if(search==arr[i]){
            flag++;
        }
    }
    if(flag==0){
        System.out.print("Not Found");
    }
    else{
            System.out.print("Found");
        }
    
    }
}