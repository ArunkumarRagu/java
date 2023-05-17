import java.util.*;
class main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        int count=0;
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                count++;
            }
        }
        System.out.print((count==2)?"YES":"NO");

    }
}