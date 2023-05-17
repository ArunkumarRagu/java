import java.util.Scanner;  
class RightPascalTrianglePattern  
{  
public static void main(String[] args)  
{  
int num, row, col;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number : ");  
num = sc.nextInt();          
for (row= 1; row<=num; row++,System.out.println("") )  
{  
for (col=1; col<=row; col++)   
{  
System.out.print("*");
for(col=row+1;col<=num*2-2;col++)  {
    System.out.print(" ");
}


}   
 
}   
for (row=num-1; row>=1; row--,System.out.println(""))  
{  
for(col=1; col<= row;col++)  
{  
System.out.print("*"+(row*2-2)+"*");  
}  
  
}  
}  
}