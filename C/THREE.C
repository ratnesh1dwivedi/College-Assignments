// program to find prime number

#include<stdio.h>
#include<conio.h>
void main()
{ int n,i,count=0;
clrscr();
printf("Enter the any number:");
scanf("%d",&n);
for(i=1;i<=n;i++)
{if(n%i==0)
{count++;}
if(count==2)
{printf("Prime Number");}
else
{printf("Not a Prime Number");}
getch();}                       }
