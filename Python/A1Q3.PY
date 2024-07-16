def calculate_grade(subject_marks):
    total_marks = sum(subject_marks)
    percentage = (total_marks / (5 * 100)) * 100

    if percentage > 90:
        grade = 'A+'
    elif percentage > 80:
        grade = 'A'
    elif percentage > 70:
        grade = 'B'
    elif percentage > 50:
        grade = 'Pass'
    else:
        grade = 'Fail'

    return grade

def main():
    subject_marks = []
    for i in range(5):
        marks = int(input("Enter marks for subject {}: ".format(i+1)))
        subject_marks.append(marks)

    grade = calculate_grade(subject_marks)
    print("Grade:", grade)

if __name__ == "__main__":
    main()
