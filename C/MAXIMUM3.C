//Program to find maximum between three numbers

#include<stdio.h>
#include<conio.h>
void main()
{
int num1,num2,num3;
printf("Enter Number One:");
scanf("%d",&num1);
printf("Enter Number Two:");
scanf("%d",&num2);
printf("Enter Number Three:");
scanf("%d:",&num3);
if(num1>num2 && num1>num3)
{
printf("Number One is Maximum");
}
else if(num2>num1 && num2>num3)
{
printf("Number Two is Maximum");
}
else
{
printf("Number Three is Maximum");
}
getch();
}
