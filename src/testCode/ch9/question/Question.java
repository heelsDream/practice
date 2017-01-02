package testCode.ch9.question;

/**
 * Created by flyboy on 1/1/2017.
 */
public class Question {

    private String text;
    private String answer;

    /**
     * set the question
     * @param questionText the text of this question
     */
    public void setText(String questionText){
        this.text = questionText;
    }

    /**
     * set the answer for this question
     * @param correctAnswer the answer to this question
     */
    public void setAnswer(String correctAnswer){
        this.answer = correctAnswer;
    }

    public boolean checkAnswer(String response){
        return this.answer.equals(response);
    }

    // display the question text
    public void display(){
        System.out.println("the question is: ");
        System.out.println(text);
    }
}
