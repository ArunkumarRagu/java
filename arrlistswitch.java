import java.util.*;
class main{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("1.Add\n2.Remove\n3.Size\n4.Sort\n5.display");
        System.out.println("Enter Your Choice:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
        switch(n){
            case 1:{
                System.out.println("Enter the number of element to add:");
                int x = sc.nextInt();
                while(x-->0){
                    System.out.println("Enter the number to add:");
                    int z = sc.nextInt();
                    al.add(z);
                }
                break;
            }
            case 2:{
                System.out.println("Enter the position of element to remove:");
                int y = sc.nextInt();
                al.remove(y);
                break;
            }
            case 3:{
                System.out.println("The size of the arraylist is:" + al.size());
                break;
            }
            case 4:{
                System.out.println("The sorted Arraylist is:");
                al.sort(Comparator.naturalOrder());
                System.out.println(al);
                break;
            }
            case 5:{
                System.out.println(al);
                break;
            }
            default:{
                System.out.println("Enter a valid option");
                break; 
            }
        }
        System.out.println("1.Add\n2.Remove\n3.Size\n4.Sort\n5.display");
        System.out.println("Enter Your Choice:");
        n= sc.nextInt();
        }
    }
}
