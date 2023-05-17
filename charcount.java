import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine().toLowerCase();
        char[] Arr = A.toCharArray();
        System.out.println(Arr.length);
        int count=0;
        for(int i=0;i<Arr.length;i++){
        if((Arr[i]=='a')||(Arr[i]=='e')||(Arr[i]=='i')||(Arr[i]=='o')||(Arr[i]=='u')){
          count++;
        }
        }
System.out.print(count);
    }
}