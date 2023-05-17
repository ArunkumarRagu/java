import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String g = sc.nextLine();
        if(s.length()==g.length()){
            if((s+s).contains(g)){
                System.out.print("True");
            }
            else{
                System.out.print("False");
            }
        }
    }
}