def arithmetic_operators_menu():
    print("\nArithmetic Operators:")
    print("1. Addition (+)")
    print("2. Subtraction (-)")
    print("3. Multiplication (*)")
    print("4. Division (/)")
    print("5. Floor Division (//)")
    print("6. Modulus (%)")

def relational_operators_menu():
    print("\nRelational Operators:")
    print("1. Equal to (==)")
    print("2. Not equal to (!=)")
    print("3. Greater than (>)")
    print("4. Less than (<)")
    print("5. Greater than or equal to (>=)")
    print("6. Less than or equal to (<=)")

def logical_operators_menu():
    print("\nLogical Operators:")
    print("1. AND (and)")
    print("2. OR (or)")
    print("3. NOT (not)")

def menu():
    print("Select the type of operators:")
    print("1. Arithmetic Operators")
    print("2. Relational Operators")
    print("3. Logical Operators")
    print("4. Quit")

def get_numbers():
    num1 = float(input("Enter the first number: "))
    num2 = float(input("Enter the second number: "))
    return num1, num2

def arithmetic_operators(choice, num1, num2):
    if choice == 1:
        return num1 + num2
    elif choice == 2:
        return num1 - num2
    elif choice == 3:
        return num1 * num2
    elif choice == 4:
        return num1 / num2
    elif choice == 5:
        return num1 // num2
    elif choice == 6:
        return num1 % num2

def relational_operators(choice, num1, num2):
    if choice == 1:
        return num1 == num2
    elif choice == 2:
        return num1 != num2
    elif choice == 3:
        return num1 > num2
    elif choice == 4:
        return num1 < num2
    elif choice == 5:
        return num1 >= num2
    elif choice == 6:
        return num1 <= num2

def logical_operators(choice, num1, num2):
    if choice == 1:
        return num1 and num2
    elif choice == 2:
        return num1 or num2
    elif choice == 3:
        return not num1, not num2

def main():
    while True:
        menu()
        choice = int(input("Enter your choice: "))

        if choice == 4:
            print("Exiting...")
            break

        if choice == 1:
            arithmetic_operators_menu()
            operator_choice = int(input("Enter your choice: "))
            num1, num2 = get_numbers()
            result = arithmetic_operators(operator_choice, num1, num2)
            print("Result:", result)
        elif choice == 2:
            relational_operators_menu()
            operator_choice = int(input("Enter your choice: "))
            num1, num2 = get_numbers()
            result = relational_operators(operator_choice, num1, num2)
            print("Result:", result)
        elif choice == 3:
            logical_operators_menu()
            operator_choice = int(input("Enter your choice: "))
            num1, num2 = get_numbers()
            result = logical_operators(operator_choice, num1, num2)
            print("Result:", result)
        else:
            print("Invalid choice. Please enter a valid option.")

if __name__ == "__main__":
    main()
