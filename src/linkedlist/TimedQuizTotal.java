package linkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TimedQuizTotal {
    private static final int TOTAL_QUESTIONS = 10;
    private static final int TOTAL_TIME_SECONDS = 600; // 10 minutes

    public static void main(String[] args) throws Exception {
        String[] questionPool = {
                "What is the capital of India?",
                "What is 5 + 7?",
                "Who is the President of the USA?",
                "What is the boiling point of water in Celsius?",
                "Name a programming language that starts with 'J'.",
                "What color is the sky on a clear day?",
                "What year did World War II end?",
                "Who wrote 'Romeo and Juliet'?",
                "What is the square root of 64?",
                "What is the largest planet in our solar system?",
                "How many days are there in a leap year?",
                "Which organ pumps blood through the body?",
                "Who discovered gravity?",
                "What is the chemical symbol for water?",
                "Name the smallest prime number."
        };

        List<String> questionList = new ArrayList<>(Arrays.asList(questionPool));
        Collections.shuffle(questionList);
        List<String> selectedQuestions = questionList.subList(0, TOTAL_QUESTIONS);
        String[] answers = new String[TOTAL_QUESTIONS];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.currentTimeMillis();
        long endTime = startTime + TOTAL_TIME_SECONDS * 1000L;

        for (int i = 0; i < TOTAL_QUESTIONS; i++) {
            long currentTime = System.currentTimeMillis();
            if (currentTime >= endTime) {
                System.out.println("\n⏱️ Time's up! Remaining questions will be marked as 'Not answered'.");
                Arrays.fill(answers, i, TOTAL_QUESTIONS, "Not answered");
                break;
            }

            String question = selectedQuestions.get(i);
            System.out.println("Q" + (i + 1) + ": " + question);
            System.out.print("Answer: ");

            // Check remaining time for this answer
            long timeLeft = endTime - System.currentTimeMillis();

            // Set timeout for each question to the remaining total time
            long inputStart = System.currentTimeMillis();
            while ((System.currentTimeMillis() - inputStart) < timeLeft && System.in.available() == 0) {
                Thread.sleep(100); // Wait for input
            }

            if (System.in.available() > 0) {
                answers[i] = reader.readLine();
            } else {
                System.out.println("\n⏱️ Time's up during answer input!");
                answers[i] = "Not answered";
                Arrays.fill(answers, i + 1, TOTAL_QUESTIONS, "Not answered");
                break;
            }

            System.out.println();
        }

        // Display results
        System.out.println("\n--- Quiz Results ---");
        for (int i = 0; i < TOTAL_QUESTIONS; i++) {
            System.out.println("Q" + (i + 1) + ": " + selectedQuestions.get(i));
            System.out.println("Answer: " + answers[i]);
            System.out.println();
        }
    }
}


