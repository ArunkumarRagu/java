import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int t = sc.nextInt();
        int flag=0,index=0;
        for(int i=0;i<n;i++){
            if(nums[i]==t){
                flag=1;
                index=i;
            }
        }
        if(flag==1){
            System.out.println(index);
        }
        else{
            System.out.println("-1");
        }
    }
}