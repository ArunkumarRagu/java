import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max;
        int arr[]={1,2,5,10,20,50,100,200,500,2000};
        for(int i=arr.length-1;i>=0;i--){
            if(n>=arr[i]){
                // System.out.print(arr[i]+" ");
                max = arr[i];
                if(n>=max){
                    n=n-max;
                    i++;
                }
                System.out.print(max + " ");
            }
        }
    }
}