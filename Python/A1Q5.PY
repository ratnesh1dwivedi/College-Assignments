#Using ‘while’ loop:
def print_name_with_while(name, times):
    count = 0
    while count < times:
        print(name)
        count += 1

name = "RATNESH RAJ DWIVEDI"
print("Printing name 5 times using while loop:")
print_name_with_while(name, 5)

#Using ‘for’ loop:
def print_name_with_for(name, times):
    for _ in range(times):
        print(name)

name = "RATNESH RAJ DWIVEDI"
print("\nPrinting name 5 times using for loop:")
print_name_with_for(name, 5)

