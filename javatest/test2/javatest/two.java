import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        int E[]= new int[T];
        int L[]= new int[T];
        int temp[] =new int [T];
        for(int i=0;i<T;i++){
            E[i]= sc.nextInt();
        }
        for(int i=0;i<T;i++){
            L[i]= sc.nextInt();
        }
        temp[0]=E[0]-L[0];
        for(int i=0;i<T-1;i++){
            temp[i+1]=temp[i]+E[i+1]-L[i+1];
        }
        int max = temp[0];
            for (int i = 1; i < temp.length; i++){
            if (temp[i] > max)
                max = temp[i];
            }
            System.out.print(max);
    }
}