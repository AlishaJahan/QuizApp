package src;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What is the capital of France?\nA. Rome\nB. Paris\nC. Berlin\nD. Madrid",
            "2. Which planet is known as the Red Planet?\nA. Venus\nB. Mars\nC. Jupiter\nD. Saturn",
            "3. what is the chemical symbol of gold?\nA. Gd\nB. Af\nC. Ag\nD. Rq"
        };

        char[] answers = {'B', 'B', 'C'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Your answer: ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + answers[i]);
            }
        }

        System.out.println("\nQuiz Finished! Your score: " + score + "/" + questions.length);
        sc.close();
    }
}
