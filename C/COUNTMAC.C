// Program for Cash Counting Machine

#include<stdio.h>
#include<conio.h>
void main()
{int a,b,c;
printf("Enter which type of notes you have:");
scanf("%d",&a);
printf("Enter amount of money:");
scanf("%d",&b);
c=b/a;
printf("%d notes are there",c);
getch();}
