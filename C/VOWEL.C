//Program to check character is vowel or not

#include<stdio.h>
#include<conio.h>
void main()
{char c;
clrscr();
printf("Enter a Character: ");
scanf("%c",&c);
if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'|| c=='E'||c=='I'||c=='O'||c=='U')
{printf("The character is a Vowel");}
else
{printf("The character is not Vowel");}
getch();}