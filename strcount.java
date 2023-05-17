import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int strcount=1;
        for(int i=0;i<A.length();i++){
            if((A.charAt(i) ==' ')&&(A.charAt(i+1) != ' ')){
                strcount++;
            }
        }
        System.out.println(strcount);
    }
}