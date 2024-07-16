#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,sum;
clrscr();
printf("Enter the range:");
scanf("%d",&n);
i=1;
while(i<=n)
{
if(i%2==0);
{
sum=sum+i;}
i++;}
printf("Sum is %d\n ",sum);
getch();
}