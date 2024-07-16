//Program to find no. of days in that month

#include<stdio.h>
#include<conio.h>
void main()
{int x;
printf("Enter the Number of Month");
scanf("%d",&x);
if (x==1||x==3||x==5||x==7||x==8||x==10||x==12)
{printf("This month has 31 days");}
else if (x==4||x==6||x==9||x==11)
{printf("The month has 30 days");}
else if (x==2)
{printf("The month has 29 or 28 days, it depends on the leap year");}
else
{printf("Invalid Entry");}
getch();}