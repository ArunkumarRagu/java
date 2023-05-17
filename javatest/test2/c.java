import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if((i>3)&&(i<8)){
                System.out.print('#');
            }
            else{
                System.out.print(' ');
            }
        }
                System.out.println();

        for(int i=0;i<n;i++){
            if(n==2|n==3|n==6|n==7){
                System.out.print("*");
            }
            else
            System.out.print(" ");
        }        
                System.out.println();

    for(int i=0;i<n;i++){
            if(n==3&&n==4&&n==7&&n==8){
                System.out.print("*");
            }
            else
            System.out.print(" ");
        } 
        for(int i=0;i<n-6;i++){
            
                System.out.println("##");
            
          
            
        }
    }
}