import java.util.*;

class main{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    findodd(n);
  }

public static void findodd(int n){
int r,max=0;
while(n>0)
{
r=n%1000;
if((r<max)&&(r%2!=0))
{
    max=r;
}
  n=n/10;
}
System.out.print(max);
}

}
