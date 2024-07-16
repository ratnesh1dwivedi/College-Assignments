# Write a program that will swap the value of two variables.
def swap_variables(a, b):
    print("Before Swapping:")
    print("a =", a)
    print("b =", b)
    
# Swapping the values
    a, b = b, a
    
    print("\nAfter Swapping:")
    print("a =", a)
    print("b =", b)

# Example usage:
x = 30
y = 70
swap_variables(x, y)
