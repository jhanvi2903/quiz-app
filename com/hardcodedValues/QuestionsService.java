package com.hardcodedValues;

public class QuestionsService {
    QuestionsPOJO[] questions = new QuestionsPOJO[5];

// "Hardcoding" means:
//  1. The values (like questions, options, answers) are manually written directly in the source code.
//  2. They do not come from external sources like files, databases, or user input.
    public QuestionsService() {
        questions[0] = new QuestionsPOJO(1, "What is the output of: System.out.println(3 + 4 + \"Java\");", "7Java", "34Java", "Java7", "Java34", "7Java");
        questions[1] = new QuestionsPOJO(2, "Which of the following is not a Java keyword?", "final", "delete", "static", "throws", "delete");
        questions[2] = new QuestionsPOJO(3, "Which data type is used to create a variable that should store text?", "String", "char", "text", "int", "String");
        questions[3] = new QuestionsPOJO(4, "What does JVM stand for?", "Java Variable Method", "Java Virtual Machine", "Java Verified Manager", "Java Visual Model", "Java Virtual Machine");
        questions[4] = new QuestionsPOJO(5, "Which operator is used for comparison in Java?", "=", "==", "===", "<=>", "==");

    }

    public void displayQuestions() {
        for(QuestionsPOJO question : questions) {
            System.out.println(question.toString());
        }
    }
}
