#Program to find the sum of natural number using recursion
def function(n):
    if n<=0:
        return n
    else:
        return n + function(n-1)
num=int(input("Enter a number:"))
if num<0:
    print("Enter a positive number:")
else:
    print("The sum is :",function(num))