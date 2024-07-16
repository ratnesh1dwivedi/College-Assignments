class SmallPythonQuiz:
    def __init__(self):
        self.questions = [
            {
                'question': 'What is the capital of Italy?',
                'correct_answer': 'Rome'
            },
            {
                'question': 'How many continents are there?',
                'correct_answer': '7'
            },
            {
                'question': 'What is the result of 3 squared?',
                'correct_answer': '9'
            }
        ]
        self.score = 0

    def run_quiz(self):
        print("Welcome to the Small Quiz!")
        for i, question in enumerate(self.questions, 1):
            print(f"\nQuestion {i}: {question['question']}")

            user_answer = input("Your answer: ")

            if user_answer.strip().lower() == question['correct_answer'].lower():
                print("Correct!\n")
                self.score += 1
            else:
                print(f"Wrong! The correct answer is {question['correct_answer']}\n")

        print(f"You've completed the quiz! Your score is {self.score}/{len(self.questions)}")

if __name__ == "__main__":
    small_quiz = SmallPythonQuiz()
    small_quiz.run_quiz()