import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();
        int Counta = A.length();
        int Countb = B.length();
        int Countc = C.length();


    for(int j=0;j<Counta-1;j++){
        System.out.print("*");
    }
    System.out.print(A);
    for(int j=0;j<Counta-1;j++){
        System.out.print("*");
    }
    System.out.println();

        for(int j=0;j<Countb-1;j++){
        System.out.print("*");

    }
    System.out.print(B);
    for(int j=0;j<Countb-1;j++){
        System.out.print("*");
    }
    System.out.println();
        for(int j=0;j<Countc-1;j++){
        System.out.print("*");
    }
    System.out.print(C);
    for(int j=0;j<Countc-1;j++){
        System.out.print("*");
    }

    }
}