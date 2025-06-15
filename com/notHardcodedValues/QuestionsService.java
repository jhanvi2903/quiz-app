package com.notHardcodedValues;

import java.util.Scanner;

public class QuestionsService {
    QuestionsPOJO[] questions = new QuestionsPOJO[5];
    String[] selectedAnswer = new String[5];

    public QuestionsService() {
        questions[0] = new QuestionsPOJO(1, "What is the output of: System.out.println(3 + 4 + \"Java\");", "7Java", "34Java", "Java7", "Java34", "7Java");
        questions[1] = new QuestionsPOJO(2, "Which of the following is not a Java keyword?", "final", "delete", "static", "throws", "delete");
        questions[2] = new QuestionsPOJO(3, "Which data type is used to create a variable that should store text?", "String", "char", "text", "int", "String");
        questions[3] = new QuestionsPOJO(4, "What does JVM stand for?", "Java Variable Method", "Java Virtual Machine", "Java Verified Manager", "Java Visual Model", "Java Virtual Machine");
        questions[4] = new QuestionsPOJO(5, "Which operator is used for comparison in Java?", "=", "==", "===", "<=>", "==");

    }

    // It is not hardcoded because the code takes questions and answers from the array and user input, instead of using fixed values written directly in the code.
    public void playQuiz() {
        int i = 0;
        for(QuestionsPOJO question : questions) {
            System.out.println(question.getId());
            System.out.println(question.getQuestion());
            System.out.println(question.getOption1());
            System.out.println(question.getOption2());
            System.out.println(question.getOption3());
            System.out.println(question.getOption4());

            Scanner scanner = new Scanner(System.in);
            selectedAnswer[i] = scanner.nextLine();
            i++;
        }

        int score = calculateScore();
        System.out.println("Your Score is: " + score);
    }

    private int calculateScore() {
        int scoreCount = 0;
        int j = 0;
        for(String answer : selectedAnswer) {
            if(answer.equals(questions[j].getAnswer())) {
                scoreCount++;
            }
            j++;
        }

        return scoreCount;
    }
}
