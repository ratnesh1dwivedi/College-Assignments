class calc():
 num1 = int(input("Enter first number:"))
 num2 = int(input("Enter second number:"))
 print("|Choose the operation you want to perform: |")
 print("|1. Addition |")
 print("|2. Substraction |")
 print("|3. Division |")
 print("|4. Multiplication |")
 operation = int(input("Enter your Choice:"))
 print("\n")
 if operation==1:
    print("Addition:",num1+num2)
 elif operation==2:
    print("Substraction:",num1-num2)
 elif operation==3:
    print("Division:",num1/num2)
 elif operation==4:
    print("Multiplication:",num1*num2)
 else:
    print("Enter a valid operation")
c1 = calc()