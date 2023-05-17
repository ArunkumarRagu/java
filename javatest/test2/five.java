import java.io.*;
 
class GFG {
 
// Returns factorial
// of the number
static int fact(int n)
{
    int fact = 1;
    for (int i = 2; i <= n; i++)
        fact *= i;
    return fact;
}
 
// Function to calculate ncr
static int ncr(int n, int r)
{
    int ncr = fact(n) / (fact(r) * fact(n - r));
    return ncr;
}
 
// Function to calculate
// the total possible ways
static int ways(int m, int w, int n, int k)
{
 
    int ans = 0;
    while (m >= k) {
        ans += ncr(m, k) * ncr(w, n - k);
        k += 1;
    }
 
    return ans;
}
 
// Driver code
    public static void main (String[] args) {
         
    int m, w, n, k;
    m = 7;
    w = 6;
    n = 5;
    k = 3;
    System.out.println( ways(m, w, n, k));
    }
}
