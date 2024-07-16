// program to print prime numbers to n

#include<stdio.h>
#include<conio.h>
 void main()
 {int n,j,i,count;
 clrscr();
 printf("Enter the limit:");
 scanf("%d",&n);
 printf("Prime numbers till %d:",n);
 for(i=1;i<=n;i++)
 {count=0;
 for (j=1;j<=i;j++)
 {if (i%j==0)
 {count++;}

 else
 {printf("%d",i);}
 }}
 getch();}