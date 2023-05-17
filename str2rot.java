import java.util.*;
class rot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String org= sc.nextLine();//original word
        String a = sc.nextLine();//left rotated word
        String b = sc.nextLine();//right rotated word
        int r= sc.nextInt();//number of rotation
        String lrot =a.substring(r)+a.substring(0,r);//left rotated
        String rrot =b.substring(b.length()-r)+b.substring(0,b.length()-r);//right rotated
        if(org.equals(lrot)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        if(org.equals(rrot)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}