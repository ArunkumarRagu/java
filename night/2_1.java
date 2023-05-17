import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans=0;
        while(a-->0){
            int b = sc.nextInt();
            ans += (b/3)-2;
        }
            System.out.println(ans);
        
    }
}