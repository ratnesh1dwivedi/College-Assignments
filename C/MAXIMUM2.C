//Program to find Maximum between Two Numbers

#include<stdio.h>
#include<conio.h>
void main()
{
int num1,num2;
clrscr();
printf("Enter Number 1 : ");
scanf("%d",&num1);
printf("Enter Number 2 : ");
scanf("%d",&num2);
if(num1<num2)
{
printf("Number 2 is maximum");
}
else
{
printf("Number 1 is maximum");
}
getch();
}
