input_string = "Program to count the frequency of the words appearing in a string using a dictionary."
word_count = {}
words = input_string.strip().lower().split()
for word in words:
 if word in word_count:
    word_count[word] += 1
 else:
    word_count[word] = 1
print(word_count)
