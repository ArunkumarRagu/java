import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min=1;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            min=arr[0];
            if(min>=arr[i]){
                min=arr[i];
            }
        }

        System.out.print("output\n" +min);
    }
}
