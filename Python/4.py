file = open("content.txt",'r')
word_count = {}
for line in file:
 words = line.strip().lower().split()
 for word in words:
    if word in word_count:
        word_count[word] += 1
    else:
        word_count[word] = 1
print("mango:",word_count["mango"])
print("apple:",word_count["apple"])
print("banana:",word_count["banana"])
print("pear:",word_count["pear"])
file.close()