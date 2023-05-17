import java.util.*;
class ptn2{
    public static void main(String args[]){
        int n,r,c;
        Scanner obj=new Scanner(System.in);
        n =obj.nextInt();
        for(r=1;r<=n;r++,System.out.print("\n")){
        for(c=1;c<=n;c++){
            if((r==n/2+1)||(c==n/2+1)){
                System.out.print("0 ");
            }
            else{
                System.out.print("1 ");
            }
        }
        }
    }
}