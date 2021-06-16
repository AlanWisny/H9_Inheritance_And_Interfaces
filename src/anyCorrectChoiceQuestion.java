
// P9.4 Add a class with multiple correct answers to choose from. Display all correct answers afterwards.

import java.util.Scanner;

public class anyCorrectChoiceQuestion extends Question{
    private String answer;
    public anyCorrectChoiceQuestion() {
        super();
        answer = "";
    }

    public void constructQuestionAndAnswer(String choice) {

        Scanner parser = new Scanner(choice);
        parser.useDelimiter("_");
        String question = parser.next();
        this.answer = parser.next() + " ";

        while (parser.hasNext()) {

            answer +=  " " + parser.next();
//            System.out.println(answer);
        }

        parser.close();



        this.setText(question);
        this.setAnswer(answer);

    }

    @Override
    public boolean checkAnswer(String response) {
//        String[] answers = this.answer.split(" ");
//        int i = 0;
//        for(String temp: answers ) {
//            while (i < answers.length -1) {
//
//                    i++;
//                    System.out.println(answer);
//                }
//            }

        return this.getAnswer().trim().toLowerCase().contains(response.trim().toLowerCase());

    }





}
