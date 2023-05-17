import java.util.*;
class patern{
    public static void main(String args[]){
        int r,c;
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(r=1;r<=n;r++,System.out.printf("\n")){
            for(c=1;c<=n;c++){
                System.out.print(r%2);
            }
        }
        }}