




import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ChoiceQuestion q = new ChoiceQuestion();
//        q.setText("Which country won gold on curling?");
//        q.addChoice("Canada", true);
//        q.addChoice("UK", false);
//        q.setAnswer("Canada");
//        presentQ(q);


//        numericQuestion q1 = new numericQuestion();
//        q1.setText("2+2");
////        q1.addChoice(2, false);
////        q1.addChoice(4,true);
//        q1.setAnswer("4");
//
//        presentQ1(q1);


//        FillQuestion fq = new FillQuestion();
////        fq.setText("The inventor if Java was________");
////        fq.setAnswer("James Gosling");
//        fq.constructQuestionAndAnswer("The inventor of Java was_James Gosling_");
////        fq.addChoice("Ryan Gosling", false);
////        fq.addChoice("James Gosling", true);
//        presentFQ(fq);


        anyCorrectChoiceQuestion acc = new anyCorrectChoiceQuestion();
        acc.constructQuestionAndAnswer("What is 2 + 2?_2_4_quickmaths");
        System.out.println(acc.toString());
        presentACC(acc);
        System.out.println(acc.getAnswer());

//        MultiChoiceQuestion mc = new MultiChoiceQuestion();
//        mc.constructQuestionAndAnswer("What is 2 + 2?_2_4_quickmaths");
//        System.out.println(mc.toString());
//        presentMC(mc);
//        System.out.println(mc.getAnswer());


//        QuestionChoice q = new QuestionChoice();
//        q.setText("Which country won gold on curling?");
////        q.addChoice("Canada", true);
////        q.addChoice("UK", false);
//        q.setAnswer("Canada");
//        presentQC(q);



    }

        public static void presentQ(ChoiceQuestion q) {
            q.display();
            System.out.println("Your answer: ");
            Scanner in = new Scanner(System.in);
            String response = in.nextLine();
            System.out.println(q.checkAnswer(response));    // checkt of het overeenkomt
        }

//    public static void presentQ1(numericQuestion q1) {
//        q1.display();
//        System.out.println("Your answer: ");
//        Scanner in = new Scanner(System.in);
//        String response = in.nextLine();
//        System.out.println(q1.checkAnswer("" + response));
//    }

//    public static void presentFQ(FillQuestion fq) {
//        fq.display();
//        System.out.println("Your answer: ");
//        Scanner in = new Scanner(System.in);
//        String response = in.nextLine();
//        System.out.println(fq.checkAnswer(response));
//    }

//    public static void presentFQ(FillQuestion fq) {
//        fq.display();
//        System.out.println("Your answer: ");
//        Scanner in = new Scanner(System.in);
//        String response = in.nextLine();
//        System.out.println(fq.checkAnswer(response));
//    }

    public static void presentACC(anyCorrectChoiceQuestion acc) {
        acc.display();
        System.out.println("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(acc.checkAnswer(response));

//    public static void presentMC(MultiChoiceQuestion mc) {
//        mc.display();
//        System.out.println("Your answer: ");
//        Scanner in = new Scanner(System.in);
//        String response = in.nextLine();
//        System.out.println(mc.checkAnswer(response));


//            public static void presentQC(QuestionChoice q) {
//            q.display();
//            System.out.println("Your answer: ");
//            Scanner in = new Scanner(System.in);
//            String response = in.nextLine();
//            System.out.println(q.checkAnswer(response));    // checkt of het overeenkomt
        }



    }





