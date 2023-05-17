import java.util.*;
class main{
    public static void main(String args[]){
        String a = "abcd";
        String b = "cabd";
        String c = a+a;
        if(c.contains(b)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}