package testCode.ch9.question;

import java.util.ArrayList;

/**
 * Created by pingjiex on 1/2/17.
 */
public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;

    /**
     * initialize a choice question with empty choice
     */
    public ChoiceQuestion(){
        choices = new ArrayList<>();
    }

    /**
     * set choices for this choice question
     * @param choice text of choice
     * @param correctness if current choice is the answer
     */
    public void setChoice(String choice, boolean correctness){
        choices.add(choice);
        if (correctness){
            String answerAsString = "" + choices.size();
            super.setAnswer(answerAsString);
        }
    }

    public void display(){
        // display the question text
        super.display();
        // display the choices of the question
        for (int i=0; i<choices.size(); i++){
            System.out.printf("%d: %s\n", i+1, choices.get(i));
        }
    }
}
