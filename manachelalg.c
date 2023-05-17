// class alg{
//     public static void main(String args[]){
//         String a = "abaabc";
//         char org[]=a.toCharArray();
//         char[] ash= new char[org.length*2];
//         for(int i=0;i<ash.length;i++){
//             if(i%2==0){
//                 ash[i]=org[i];
//             }
//             else{
//                 ash[i]='#';
//             }
//         }
//     }
// }



#include <stdio.h>
#include<string.h>
int  check(int i,int new[])
{
    int ct=1;
    if(new[i-1]==new[i+1])
    {
        ct++;
        check(i+1,new[]);
    }
    return ct;

}
int main()
{
    int j=0,count=0;
    char og[]="abaabc";
    int m=2*strlen(og);
    int arr[100];
    char new[100];
    for(int i=0;i<(strlen(og));i++)
    {
new[j]='#';
new[j+1]=og[i];
j=j+2;
arr[i]=0;
// printf("\n%d value of i",i);

arr[m]=0;
// printf("\n%d value of i",m);

m=m-1;
}
// printf("\n%d value of i",m);
arr[m]=0;
//print the array
// for(int i=0;i<=12;i++)
// {
//     printf("%d",arr[i]);
//    // count++;
// }
    
    int c=0;
   // printf("%d",count);
   int check=new[0];
     for(int i=0;i<(strlen(new));i++)
     {
        if(new[i-1]==new[i+1])
        {
            c++;
                arr[i]=c;
                
            break;
        }
        else
        {
               arr[i]=c;
            c=0;
        }
    
     }
     for(int i=0;i<=12;i++)
{
    printf("%d",arr[i]);
   // count++;
}


}