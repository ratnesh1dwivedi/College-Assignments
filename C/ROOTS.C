#include<stdio.h>
#include<conio.h>
void main()
{int a,b,c,d;
clrscr();
printf("Enter the coefficient A,B,C of Equation: \n");
scanf("%d %d %d",&a, &b,&c);
d=b*b-4*a*c;
if (d>=0)
{printf("Roots are Real");}
else
{printf("Roots are Complex");}
getch();}