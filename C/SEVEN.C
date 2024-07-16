//program to find factorial

#include<stdio.h>
#include<conio.h>
void main()
{ int num,i,fact;
clrscr();
printf("Enter an interger number");
scanf("%d",&num);
fact=1
for(i=num;i>=1;i--)
{fact=fact*i;}
{printf("\n Factoral of %d is %d",num,fact);  }
getch();}