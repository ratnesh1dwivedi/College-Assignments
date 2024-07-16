//Program to input side and show triangle is valid or not

#include<stdio.h>
#include<conio.h>
void main()
{int s1,s2,s3;
clrscr();
printf("Enter First side:");
scanf("%d",&s1);
printf("Enter Second side:");
scanf("%d",&s2);
printf("Enter Third side:");
scanf("%d",&s3);
if ((s1+s2)>s3 && (s1+s3)>s2 && (s2+s3)>s1)
{printf("This triangle is valid");}
else
{printf("This triangle is not valid");}
getch();}
