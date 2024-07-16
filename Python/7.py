def count_adjacent_occurrences(lst):
 count = 0
 for i in range(len(lst) - 1):
    if lst[i] == lst[i + 1]:
        count += 1
    return count
input1 = [1, 2, 5, 10, -2, -5, 8, 0]
input2 = [1, 2, 3, 4, 3, 2, 1]
input3 = [10, 2, 3, 4, 4, 100]
output1 = count_adjacent_occurrences(input1)
output2 = count_adjacent_occurrences(input2)
output3 = count_adjacent_occurrences(input3)
print(f"Input: {input1}, Count of adjacent occurrences: {output1}")
print(f"Input: {input2}, Count of adjacent occurrences: {output2}")
print(f"Input: {input3}, Count of adjacent occurrences: {output3}")
