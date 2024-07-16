//Program to find Profit or Loss

#include<stdio.h>
#include<conio.h>
void main()
{int sp,cp;
clrscr();
printf("Enter selling price:");
scanf("%d",&sp);
printf("Enter cost price:");
scanf("%d",&cp);
if (sp>cp)
{printf("Profit");}
else
{printf("Loss");}
getch();}