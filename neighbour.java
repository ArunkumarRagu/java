import java.util.*;
// import java.Math.*;
class greater{
    public static void main(String args[]){
        int arr[]= {20,5,10,15};//arr[]={20};
        int res1=0,res2=0,res=0, result=0;
        if(arr.length==1){
            result = arr[0];
        }else{
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]>arr[i+1]){
                    res = arr[i];
                }
            }

            else if(i==arr.length-1){
                if(arr[i]>arr[i-1]){
                    res2 = arr[i];                }
            }
            else{
                    if((arr[i]>arr[i+1])&&(arr[i]>arr[i-1])){
                    res1 = arr[i];
                    }
            }
        }
         result=Math.max(res,Math.max(res1,res2));
                    }
                    System.out.println(result);
    }
}