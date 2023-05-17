#include<stdio.h>
void main()
{
    int n,i,count=0;
    printf("Enter the length of array : ");
    scanf("%d",&n);
    int a[n];
    printf("Enter array elements : ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n-1;i+=a[i])
    {
        if(a[i]!="\0")
        {
            count++;
        }
        else
        {
            break;
        }
    }
    printf("%d",count);
}
