//Program to find Even or Odd

#include<stdio.h>
#include<conio.h>
void main()
{
int num;
clrscr();
printf("Enter the Number:");
scanf("%d",&num);
if(num%2==0)
{
printf("Number is even");
}
else
{
printf("Number is odd");
}
getch();
}