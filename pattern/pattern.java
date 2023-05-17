import java.util.*;
class patern{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n%2==0){
                    for (int r=1;r<=n;r++,System.out.print("\n")){
            for (int c=1;c<=n;c++){
            System.out.printf("%d", c);}
        }
        }
        else{
            for (int r=n;r>=1;r--,System.out.print("\n")){
            for (int c=n;c>=1;c--){
            System.out.printf("%d", c);}
        }
        }







    }
}