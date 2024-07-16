// Program to print Natural Numbers from 1 to N using while

#include<stdio.h>
#include<conio.h>
void main()
{
int n,i;
clrscr();
printf("Enter the Range:");
scanf("%d",&n);
i=1;
while(i<=n)
{
printf("%d\n",i);
i++;
}
getch();
}