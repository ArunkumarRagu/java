import java.util.*;
import java.math.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int sum=0;
        long pro=1;
        long modulo=1000000007;
        if(q==1){
            for(int i=1;i<=n;i++){
                sum=sum+i;
            }
            System.out.println(sum);
        }
        else if(q==2){

            for(int i=1;i<=n;i++){
                pro=(pro *i)%modulo;
            }
            System.out.println(pro);
        }
        
    }
}