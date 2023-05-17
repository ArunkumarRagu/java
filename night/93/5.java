import java.util.*;
class main{
    public static void main(String args[]){
        int arr[]={1,9,6,4,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i<j)&&(arr[i]>arr[j])){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}