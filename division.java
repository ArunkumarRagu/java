import java.util.*;
class num{
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter the number:");
        int n = obj.nextInt();
        if(n%3==0)
        System.out.println("The number is divisible by Three");
        else
        System.out.println("The number is not divisible by three and the Remainder is " +n%3);
    }
}