def is_prime(num):
    if num <= 1:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def print_first_n_primes(n):
    print("First", n, "prime numbers:")
    count = 0
    num = 2
    while count < n:
        if is_prime(num):
            print(num)
            count += 1
        num += 1

# Accepting the value of 'n' from the user
n = int(input("Enter the value of 'n': "))
print_first_n_primes(n)
