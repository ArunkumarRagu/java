import java.util.*;
public class mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String[] words = A.split(" ");
        for (int i = words.length - 1; i >= 0; i--) 
        {
            System.out.print(words[i] + " ");
        }
}
}