import java.util.*;
class user{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        char get = obj.next().charAt(0);
        if(Character.isUpperCase(get)){
            System.out.print("Uppercase");
        }
        else if(Character.isLowerCase(get)){
            System.out.print("Lowercase");}
        else
        System.out.print("Give valid character");    
    }
}