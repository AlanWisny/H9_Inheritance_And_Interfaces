
// P9.1

public class numericQuestion extends Question{



    @Override
    public boolean checkAnswer(String response) {
        double expectedAnswer = Double.parseDouble(this.getAnswer());
        double responseAnswer = Double.parseDouble(response);

    return Math.abs(expectedAnswer - responseAnswer) <=0.01;
    }

//    public numericQuestion() {
//       nchoices = new ArrayList<Integer>();
//    }
//
//
//
//
//
//        public void addChoice(int choice, boolean correct) {
//            nchoices.add(choice);
//            if(correct) {
//               String choiceString =  "" + nchoices.size();
//                setAnswer(choiceString);
//            }
//        }
//
//    public void display() {
//        super.display();
//        for (int i = 0; i < nchoices.size(); i++) {
//            int choiceNumber = i + 1;
//            System.out.println(choiceNumber + ": " + nchoices.get(i));
//        }
//    }
//
//    public boolean checkAnswer(String response){
//        response = "" + nchoices;
//    }
//    public void setAnswer(int correctResponse) {
//        response = correctResponse;
//    }

}
