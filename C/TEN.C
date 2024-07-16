//18 the question of assignment 2

#include<stdio.h>
#include<conio.h>
void main()
{ int n,i;
clrscr();
printf("Enter the value of n(limit):");
scanf("%d",&n);
printf("Leap year from 1 to %d:\n",n);
for(i=1;i<=n;i++)
{
if ((i%400==0) || (i%4==0) && (i%100!=0))
{printf("%d\t",i);}
}
getch();}