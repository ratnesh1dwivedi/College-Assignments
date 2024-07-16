#Write a program that will check whether the entered number is odd or even.

def check_odd_even(number):
    if number % 2 == 0:
        print(number, "is even.")
    else:
        print(number, "is odd.")

# Example usage:
num = int(input("Enter a number: "))
check_odd_even(num)

