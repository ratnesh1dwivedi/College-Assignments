//Program to check character type

#include<stdio.h>
#include<conio.h>
void main()
{char c;
printf("Enter a Character:");
scanf("%c",&c);
if ((c>='a' && c<='z')||(c>='A' && c<='Z'))
{printf("It's an Alphabet");}
else if (c>='0' && c<='9')
{printf("It's a Number");}
else
{printf("It's a Special Character ");}
getch();}