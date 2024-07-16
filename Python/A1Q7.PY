def print_series(start, end, step):
    print("Printing the series:")
    for i in range(start, end - 1, -step):
        print(i)

start = 100
end = 0  # Stop when reaching 1 (not including)
step = 5
print_series(start, end, step)