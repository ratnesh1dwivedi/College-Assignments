//Program to find palindrome

#include<stdio.h>
#include<conio.h>
void main()
{ int num1,num,r,rev=0,count=0;
clrscr();
printf("Enter a five digit number:");
scanf("%d",&num);
num1=num;
while(num>0)
{r=num%10;
rev=rev*10+r;
num=num/10;
count++;}
if(count==5)
{if(num1==rev)
{printf("It is a palindrome number");}
else
{printf("It is not a palindrome number");}
getch();}}