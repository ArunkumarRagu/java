import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int temp=n;
        while(n!=0){
            n = n / 10; 
            count++; 
        }
         int rem,sum=0;;
        for(int i=0;i<=count;i++){
           
            rem = temp%10;
            sum=sum+rem;
             temp = temp / 10; 
        }
        System.out.println(sum);
    }
}