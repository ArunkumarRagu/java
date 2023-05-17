import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int l = a.length();
        int counto=0;
        int countz=0;
        char arr[]= new char[l];
        for(int i=0;i<l;i++){
            arr[i]=a.charAt(i);
        
        if(l<=20){
            if(arr[i]=='z'){
                countz++;
            }if(arr[i]=='o')
                counto++;
            } 
        }
        
        if(2*countz==counto){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans=9999;
        for(int i=0;i<t;i++){
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int j=0;j<n;j++){
            arr[i]=sc.nextInt();
        }  Arrays.sort(arr);

        for(int j=0;j<n-1;j++){
            ans = Math.min(ans,arr[i]^arr[i+1]);
        }
    System.out.print(ans);
    }
}
}
