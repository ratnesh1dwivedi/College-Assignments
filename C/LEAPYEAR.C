/*Program to find Leap Year */


#include<stdio.h>
#include<conio.h>
void main()
{int year;
clrscr();
printf("Enter the year:");
scanf("%d",&year);
if(year%4==0)
{printf("It is a leap year");}
else
{printf("It is not a leap year");}
getch();}