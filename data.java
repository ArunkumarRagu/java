import java.util.*;
class data{
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);
        int n1 = obj.nextInt();
        float n2 = obj.nextFloat();
        // String n3 = obj.nextLine();
        char n4 = obj.next().charAt(0);
        System.out.printf("%d\n%f\n%c",n1,n2,n4);
    }
}
