
// class main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<n+2;i++){
//             System.out.print("@");
            
//         }
//         System.out.print("\n");
//         for(int i=0;i<n;i++){
//             for(int j=n-1;j>=0;j--){
//                 if(i==j-1){
//             System.out.print("##");

//                 }
//                 else{
//                     System.out.print(" ");
//                 }
                
//             }
//             System.out.print("\n");
//         }
//          for(int i=0;i<n+2;i++){
//             System.out.print("@");
//         }
//     }
// }
import java.util.*;
public class line {
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n+2;i++){
            System.out.print("@");
            
        }
System.out.print("\n");
        for(int i=1;i<=n-1;i++,System.out.println())
            {
                for(int j=1;j<=n;j++)
                {
                if (i+j==n+1)
                    System.out.print("##");
                else
                    System.out.print(" ");
                }
     
            }
        for(int i=0;i<n+2   ;i++){
            System.out.print("@");  
        }
    }

}