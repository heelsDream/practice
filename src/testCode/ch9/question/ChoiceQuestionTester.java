package testCode.ch9.question;

import java.util.Scanner;

/**
 * Created by flyboy on 1/2/2017.
 */
public class ChoiceQuestionTester {
    public static void main(String[] args) {
        ChoiceQuestion cq1 = new ChoiceQuestion();
        cq1.setText("What's the first name of Java");
        cq1.setChoice("7", false);
        cq1.setChoice("Duke", false);
        cq1.setChoice("Oak", true);
        cq1.setChoice("Gosling", false);

        ChoiceQuestion cq2 = new ChoiceQuestion();
        cq2.setText("In which country was the inventor of Java born?");
        cq2.setChoice("Japan", false);
        cq2.setChoice("Canada", true);
        cq2.setChoice("America", false);
        cq2.setChoice("France", false);

        presentQuestion(cq1);
        System.out.println("");
        presentQuestion(cq2);
    }

    /**
     * a static function to present question to user
     * @param cq
     */
    public static void presentQuestion(ChoiceQuestion cq){
        cq.display();
        System.out.println("your answer is: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(cq.checkAnswer(response));
    }
}


