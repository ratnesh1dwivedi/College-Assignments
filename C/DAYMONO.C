// Program for checking the Days in a month

#include<stdio.h>
#include<conio.h>
void main()
{int x;
printf("Enter the number of month:");
scanf("%d",&x);
if(x==1||x==3||x==5||x==7||x==8||x==10||x==12)
{printf("This month has 31 Days");}
else if (x==4||x==6||x==9||x==11)
{printf("This month has 30 Days");}
else if(x==2)
{printf("The month has 29 Days ");}
else
{printf("Invalid Entry");}
getch();}