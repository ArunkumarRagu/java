import java.util.*;
class main{
    public static void main(String args[]){
        String a = "and is  of the and  ";
        Scanner sc= new Scanner;
        // String a = sc.nextLine();
        // String arr[]=a.split(" ");
        int andc=0,isc=0,ofc=0,thec=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("and")){
                andc++;
            }
            else if(arr[i].equals("is")){
                isc++;
            }
            else if(arr[i].equals("of")){
                ofc++;
            }
            else if(arr[i].equals("the")){
                thec++;
            }
        }
        System.out.println(andc);
        System.out.println(isc);
        System.out.println(thec);
        System.out.println(ofc);
    }
}