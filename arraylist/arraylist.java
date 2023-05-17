import java.util.*;
class main{
    public static void main(String args[]){
        ArrayList<Integer> arrlst = new ArrayList<>();
        ArrayList<Integer> arrlst1 = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        // arrlst.add(0);//adding element in onject arrlist 
        // arrlst.add(9);
        // arrlst.add(4);
        // arrlst.add(6);
        // arrlst1.addAll(arrlst);//adding arrlst to arrlst1
        // System.out.println("ArrayList: " + arrlst);
        // arrlst.set(2,5); //setting index 2 as value 5
        // System.out.println("ArrayList: " + arrlst);
        // System.out.println("ArrayList: " + arrlst1);
        // arrlst1.remove(0);//removing index 0
        // System.out.println("ArrayList: " + arrlst1);
        // arrlst1.sort(Comparator.naturalOrder());//sorting arrlst1
        // System.out.println("ArrayList(Sorted): " + arrlst1);
        System.out.println("1.Add\n2.Remove\n3.Size\n4.Sort\n5.display");
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
        n= sc.nextInt();
        }
    }
}
