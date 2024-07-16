#include<stdio.h>
#include<conio.h>
void main()
{int s1,s2,s3;
clrscr();
printf("Enter three side of a triangle:\n");
scanf("%d %d %d" ,&s1, &s2, &s3);
if (s1==s2 && s2==s3)
{printf("Equilateral Triangle");}
else if (s1==s2||s2==s3||s3==s1)
{printf("Isosceles Triangle");}
else
{printf("Scaler Triangle");}
getch();}