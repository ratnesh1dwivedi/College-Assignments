#include<stdio.h>
#include<conio.h>
void main()
{
int n,i,j;
clrscr();
for(i=49;i<=53;i++)
{
for(j=49;j<=i;j++)
{
printf("%c",i);
}
printf("\n");
}
getch();
}