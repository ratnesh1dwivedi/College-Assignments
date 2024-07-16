// Program for checking the Triangle

#include<stdio.h>
#include<conio.h>
void main()
{int a1,a2,a3;
printf("Enter three Angles of Triangle:\n");
scanf("%d %d %d" ,&a1,&a2,&a3);
if (a1+a2+a3==180)
{printf("It's a valid Triangle");}
else
{printf("It's not a Triangle");}
getch();}