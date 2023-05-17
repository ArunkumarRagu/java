import java.util.*;
class password{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String arr[]= new String[a.length()];
        String b = sc.nextLine();
        for(int i=0;i<arr.length;i++){
            if(arr.length>=8 && arr.length<=10){
                if(arr[i]>'A' || arr[i]<'Z'){
                    if(arr[i]>=0 ||arr[i]<=9){
                        System.out.print("VALId");
                    }
                }
            }
            else{
                System.out.print("INVALID");
            }
        }

        for
    }
}