import java.util.*;

class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findLuckiestPerson(n));
       
    }
    public static int findLuckiestPerson(int N) {
    int L = Integer.highestOneBit(N);
    return 2 * (N - L) + 1;
}
}