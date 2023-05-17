import java.util.*;
class main{
    public static void main(String args[]){
        ArrayList<Integer> arrlst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=80;
        int sum=0;
        // arrlst.add(3);
        // arrlst.add(4);
        // arrlst.add(3);
        // arrlst.add(1);
        // arrlst.add(2);
        for(int i=0;i<n;i++){
            arrlst.add(i);
        }
        while(k-->0){
        for(int i=0;i<arrlst.size();i++){
            arrlst.set(arrlst.get(i),arrlst.get(i)+1);
            if(arrlst.get(i)=='0'){
                arrlst.set(i,6);
                arrlst.add(8);
            }
            sum += arrlst.get(i) ;
        }
            
        }
        System.out.print(sum);
    }
}