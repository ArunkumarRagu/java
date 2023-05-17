import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // String b = sc.nextLine();
        String word[] = ar.split(" "); 
        // String letter[]=word.tocharArray();
        for(int i=word.length-1;i>=0;i--){
        System.out.print(word[i] + " ");
        String  rev = word[i];
        for (int i=rev.length();i>=0;i--){
        System.out.print(rev.charAt(i));
        }
        }
        System.out.print("\n");

        a= a.replaceFirst(b,"");
        System.out.print(a);

    }
}