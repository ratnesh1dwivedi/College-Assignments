//program to print sum of even numbers.

#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,sum=0;
clrscr();
printf("Enter any Even Number:");
scanf("%d",&n);
i=1;
{
while(i<=n)
if(i%2==0)
{sum += i;}
i++;
}
printf("Sum of even numbers:1-%d:%d",n,sum);
getch();
}