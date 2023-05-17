import java.util.*;
class add{
    public static void main(String args[]){
        ArrayList<Integer> arrlst1 = new ArrayList<>();
        ArrayList<Integer> arrlst2 = new ArrayList<>();
        int n;
        // arrlst.add(1030);
        // arrlst.add(1020);
        // arrlst.add(1010);
        // arrlst.add(1000);

        // arrlst1.add(1040);
        // arrlst1.add(1050);
        // arrlst1.add(1060);\
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements in arraylist1:");
         n = sc.nextInt();
        System.out.println("Enter elements in arraylist1:");
        while(n-->0){
            arrlst1.add(sc.nextInt());
        }
        System.out.println("Number of elements in arraylist2:");
         n = sc.nextInt();
        System.out.println("Enter elements in arraylist2:");
        while(n-->0){
            arrlst2.add(sc.nextInt());

        }
        System.out.println("Before Joining:");
        System.out.println(arrlst1);
        System.out.println(arrlst2);
        arrlst1.addAll(arrlst2);
        System.out.println("After Joining:");
        System.out.println(arrlst1);

    }
}


