#include<stdio.h>
#include<conio.h>
void main()
{
int n=1,i,age,baby=0,school=0,adult=0;
clrscr();
printf("Age of 15 people:\n");
i=1;
while(n<=15)
{
printf("Age of persons %d:\n",n);
scanf("%d",&age);
if(age<=5)
{baby++; }
else if(age>=6 && age<=18)
{school++;}
else
{adult++;}
n++;}
printf("Baby age %d\n",baby);
printf("School age:%d\n",school);
printf("Adult age:%d\n",adult);
getch();}