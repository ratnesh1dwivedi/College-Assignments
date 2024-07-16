#include<stdio.h>
#include<conio.h>
void main()
{int a,b,c,d,e,f,percentage;
clrscr();
printf("enter marks in physics:");
scanf("%d",&a);
printf("enter marks in chemistry:");
scanf("%d",&b);
printf("enter marks in biology:");
scanf("%d",&c);
printf("enter marks in mathematics:");
scanf("%d",&d);
printf("enter marks in computer:");
scanf("%d",&e);
f=(a+b+c+d+e)*100;
percentage=f/500;
if(percentage>100)
{printf("Enter valid marks");}
else if(percentage>=100)
{printf("you got %d %c and grade A",percentage,37);}
else if(percentage>=90)
{printf("you got %d %c and grade B",percentage,37);}
else if(percentage>=80)
{printf("you got %d %c and grade C",percentage,37);}
else if(percentage>=70)
{printf("you got %d %c and grade D",percentage,37);}
else if(percentage>=60)
{printf("you got %d %c and grade E",percentage,37);}
else if(percentage>=50)
{printf("you got %d %c and grade F",percentage,37);}
else
{printf("Study hard your marks are very low");  }
getch();}