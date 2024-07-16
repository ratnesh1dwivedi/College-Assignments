//program to print square,square root and cube to n

#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{ float n,i;
printf("Enter the limit:");
scanf("%f",&n);
for(i=1;i<=n;i++)
{
printf("Square, Cube and square root of %f \n",i);
printf("Square:%of\n",i*i);
printf("Cube:%of \n",i*i*i);
printf("Square Root:%2f\n\n:",sqr(i));
}
getch();
}