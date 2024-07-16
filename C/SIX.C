//program to check enterd number is zero , positiv and negative until exit

#include<stdio.h>
#include<conio.h>
void main()
{ int n;
char choice;
do
{printf("Enter an interger:");
scanf("%d",&n);}
{if (n=0)
{printf("It is zero");}
else if (n>0)
{printf("Number is positive");}
else
{printf("Number is negative");}    }
printf("Want to check again?(press Y for 'yes')":);
scanf("%c",&choice);}
while(choice=='Y' || choice=='y');
getch();}