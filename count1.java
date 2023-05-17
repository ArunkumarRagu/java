import java.util.*;
 class main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count=0,temp;
    for(int i=1;i<=n;i++){
        temp=i;
        while(temp!=0){
            if(temp%10==1){
                count++;
            }
            temp=temp/10;
        }
    }  
    System.out.print(count);      
    }
}