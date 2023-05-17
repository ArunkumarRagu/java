import java.util.*;
class num{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a numbers:");
        int n1 = obj.nextInt();
        if(n1%3==0)
        System.out.println("HI");
        if(n1%5==0)
        System.out.println("HELLO");
    }
}