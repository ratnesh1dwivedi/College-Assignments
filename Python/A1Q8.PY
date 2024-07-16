def print_first_n_even_numbers(n):
    print("First", n, "even numbers:")
    count = 0
    num = 2  # Starting from 2, as 2 is the first even number
    while count < n:
        print(num)
        num += 2  # Increment by 2 to get the next even number
        count += 1
# Accepting the value of 'n' from the user
n = int(input("Enter the value of 'n': "))
print_first_n_even_numbers(n)
