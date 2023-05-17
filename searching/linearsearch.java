import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        int index=0;
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        }
        int key = sc.nextInt();
        for(int i=0;i<n;i++){
            if(key==arr[i]){
                flag=1;
                index=index+i;
                break;
            }

        }
        if(flag==0){
            System.out.println("Not Found");
        }
        else
            System.out.println("Found");
            System.out.println(index);
    }
}