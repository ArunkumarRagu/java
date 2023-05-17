import java.util.*;
class user{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.length() != str2.length()){
            System.out.print("No");
        }
        else{
        String str3=str1+str1;
        if(str3.contains(str1) && (str3.contains(str2))){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        }
    }

        }
    
