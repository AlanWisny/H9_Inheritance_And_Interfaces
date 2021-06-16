
// P9.6 Add a method addText to the Question superclass and provide a different implementation of ChoiceQuestion.



public class QuestionChoice extends Question{

        public QuestionChoice() {


        }


        public void addChoice(String choice, boolean correct) {

            if(correct) {
                String choiceString = "" + choice;
                setAnswer(choiceString);
            }
        }


        public void display() {
            super.display();
        }

}
