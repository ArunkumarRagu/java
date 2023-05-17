import java.util.*;
class main{
    public static void main(String args[]){
        int arr1[]={-1,-2,4,-6,5,7};
        int arr2[]={6,3,4,0};
        int x= 8;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]+arr2[j]==x){
                    System.out.println(arr1[i]+" "+arr2[j]);
                }
            }
        }

    }
}
