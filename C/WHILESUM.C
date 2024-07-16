//Program to find sum from 1 to N using while

#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,sum=0;
clrscr();
printf("Enter any natural number:");
scanf("%d",&n);
i=1;
while(i<=n)
{
sum += i;
i++;
}
printf("Sum of first natural nmbers = %d",sum);
getch();}
