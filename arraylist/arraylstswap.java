import java.util.ArrayList;
import java.util.Scanner;

 class swap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("size of arraylist:");
        int size = scan.nextInt();
        // scan.nextLine();
        while(size-- > 0){
            list.add(scan.next());
        }
        System.out.println("Before:");
        System.out.println(list);

        System.out.println("Enter positions to swap: ");
        int pos1 = scan.nextInt();
        int pos2 = scan.nextInt();
        String temp = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, temp);
        System.out.println("After: ");
     System.out.println(list);
        scan.close();
    }
}