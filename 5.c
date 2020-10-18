#include<stdio.h>
int main()
{
    int n,reverse=0,r;
    printf("enter the number:");
    scanf("%d",&n);
    while(n!=0)
    {
        r=n%10;
        reverse=reverse*10+r;
        n=n/10;
    }
    printf("reverse of number=%d",reverse);
    return 0;
}
