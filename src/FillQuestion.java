
// P9.2 Add a class that contains the answer surrounded by _ _.

import java.util.Scanner;

public class FillQuestion extends Question{
    public FillQuestion() {
        super();
    }

    public void constructQuestionAndAnswer(String questionText) {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        parser.close();

        question += " ";
        for (int i = 0; i < answer.length(); i++) {
            question += "_";
        }

        this.setText(question);
        this.setAnswer(answer);
    }



}
