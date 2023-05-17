import java.util.*;
class min_moves {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();        }
        System.out.println(minMoves(arr));
    }
    public static int minMoves(int[] arr) {
        if(arr.length == 0)
            return 0;
        int mn = arr[0];
        for(int i = 0 ; i < arr.length ; i++) {
            mn = Math.min(mn , arr[i]);
        }
        int moves = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            moves = moves + arr[i] - mn;
        }
        return moves;
    }
}