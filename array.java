import java.util.*;
class main{
    public static void main(String args[]){
        int arr[]={1,5,6,7,8,20,4};
        int arr1[]={1,5,8,7,8,20,4};
        int arr2[][]={{1,2},{2,3}};
        int arr3[][]={{1,2},{2,3}};
        Arrays.sort(arr);//sorting an array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        // Arrays.sort(arr,1,4); //1-->start index;4-->end index;
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println();
        System.out.println(Arrays.binarySearch(arr,6));//to perform binary search
        System.out.println(Arrays.equals(arr,arr1));//check 1d arrays are equal
        System.out.println(Arrays.toString(arr));// to convert array in to str
        System.out.println(Arrays.hashCode(arr1));// to get hash code
        // Arrays.fill(arr1,1);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println(Arrays.deepEquals(arr2,arr3));//used to check 2d array equal
    }
}