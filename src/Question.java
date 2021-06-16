
// Eerste voorbeeld uit het boek

import java.util.Scanner;

public class Question {
private String text;
private String answer;
private String question;

    public Question() {
        text = "";
        answer = "";
    }


    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public void addText(String QandA) {

        Scanner parser = new Scanner(QandA);
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


    public void setText(String questionText) {
        text = questionText;
    }

    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }

    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(answer);
    }   //P9.3 ignores lower and upper case answers

    public void display() {
        System.out.println(text);
    }

//    @Override
//    public String toString() {
//        return getClass().getName();
//    }

    @Override
    public String toString() {
        return "Question {" +
                "text = '" + text + '\'' +
                ", correct answers = '" + answer + '\'' +
                '}';
    }
}

