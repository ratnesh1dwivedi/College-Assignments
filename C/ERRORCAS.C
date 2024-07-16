// Program to find Lowecase OR Uppercase

#include<stdio.h>
#include<conio.h>
void main()
char ch;
{clrscr();
printf("Enter the Character:");
scanf("%c",&ch);
if (ch>='A' && ch<='Z')
{printf("The Character is Uppercase");}
else if (ch>='a' && ch<='z')
{printf("The character is Lowercase");}
else
{printf("It's not an Alphabet");}
getch();}