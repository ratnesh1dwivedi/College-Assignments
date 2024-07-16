#include<stdio.h>
#include<conio.h>
void main()
{float a,hra,da,gross;
clrscr();
printf("Enter you Salary:");
scanf("%f",&a);
if (a<=10000)
{hra=a*0.2;
da=a*0.8;}
else if (a<=20000)
{hra=a*0.25;
da=a*0.9;}
else if (a<=20000)
{hra=a*0.3;
da=a*0.95;}
else
{printf("Enter valid salary\n");}
gross=hra+da+a;
{printf("your gross salary is %2f",gross); }
getch();}
