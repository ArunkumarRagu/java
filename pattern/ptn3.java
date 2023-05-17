import java.util.*;
class num{
    public static void main(String args[]){
        int num=6,row,col;
        for(row=1;row<=num;row++,System.out.print("\n")){
            for(col=1;col<=num;col++){
                if((num%2==0)&&(row==num/2+1)&&col==num/2+1){
                    System.out.print("0 ");
                }
                else if((row==num/2||row==num/2+1)&&(col==num/2||col==num/2+1))
                    System.out.print("0 ");
                else
                    System.out.print("1 ");  
            }
        }
    }
}