import java.util.*;
class area{
    static int sqr(int a){
        return a*a;
    }
    static int rec(int l,int b){
        return l*b;
    }
}

class diftype{
    static String concating(String a,String b){
        return a.concat(b);
    }
    static int sum(int x,int y){
        return x+y;
    }
}

class main{
    public static void main(String args[]){
        System.out.println(area.sqr(5));
        System.out.println(area.rec(5,4));
        System.out.println(diftype.concating("Arun","kumar"));
        System.out.println(diftype.sum(10,20));
    }
}