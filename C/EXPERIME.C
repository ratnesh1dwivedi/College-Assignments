#include<stdio.h>
#include<conio.h>
void main()
{
int n;
long sum=0,a;
clrscr();
printf("Enter the five digit no.:");
scanf("%d",&n);
original=n;
while(n>0)
{
a=n%10;
sum=sum*10+a;
n=n/10;
printf("%ld\n",sum);
if(original=sum)
printf("Palindrome");
else
printf("This is not Palindrome");}
getch();}