// Program to print loop

#include<stdio.h>
#include<conio.h>
void main()
{
int n;
clrscr();
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
printf("*");
}
printf("\n");
}
getch();
}
