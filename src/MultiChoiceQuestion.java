

// P9.5 Add a class with multiple correct answers, and give all correct responses with spaces in between.
import java.util.Scanner;
public class MultiChoiceQuestion extends Question{
    private String answer;
    public MultiChoiceQuestion() {
        super();
    }

    public void constructQuestionAndAnswer(String choice) {

        Scanner parser = new Scanner(choice);
        parser.useDelimiter("_");
        String question = parser.next();
        this.answer = parser.next() + " ";

        while (parser.hasNext()) {

            answer += parser.next() + " ";
        }
        parser.close();
        this.setText(question);
        this.setAnswer(answer);
    }

}
