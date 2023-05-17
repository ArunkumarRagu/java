import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len= s.length();
        int ans=0,j;
        for (int i = 0; i < len; i = j) {
        j = i;
        Character c1 = s.charAt(i);
        Character c2 = s.charAt(j);
        while (j < len && c1.equals(c2)) {
            j++;
        }
 
        // Update the answer
        ans += ((j - i) * (j - i - 1)) / 2;
        System.out.print(ans);
    }
    }
}