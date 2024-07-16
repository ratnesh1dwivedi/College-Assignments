// Program to find the alphabet

#include<stdio.h>
#include<conio.h>
void main()
{char c;
printf("Enter the Character:");
scanf("%c",&c);
if ((c>='a' && c<='z') || (c>='A' && c<='Z'))
{printf("It's an Alphabet");}
else
{printf("It's not an Alphabet");}
getch();}