package quizApp.quizGame;

import java.util.Scanner;

class Question {
    private int questionId;
    private String questionText;
    private String answer;
    private String[] options = new String[4];

    public Question(String questionText, String[] options, String answer) {
        this.questionText = questionText;
        this.options = options;
        this.answer = answer;
    }
    public String getQuestionText() {
        return questionText;
    }
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public String getOptions() {
        String displayOptions = "";
        for (String option : options) {
            displayOptions += "Options are "+ option;  
        }
        return displayOptions;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    // @Override
    // public String toString() {
    //     return "Question [questionId=" + questionId + ", questionText=" + questionText + ", answer=" + answer
    //             + ", options=" + Arrays.toString(options) + "]";
    // }    

    public void getQuestion() {          
        System.out.println("Q-"+ questionId + "." + questionText + "?");
        System.out.println("Options are : " + getOptions());
    }
}



public class QuestionService {
    Question questions[] = new Question[5];

    public QuestionService (){
        // String[] options1  = {"1","2","4", "8"};
        questions[0] = new Question("range of int", new String[]{"1","2","4", "8"}, "4");
        questions[1] = new Question("range of short", new String[]{"1","2","4", "8"}, "2");
        questions[2] = new Question("range of byte", new String[]{"1","2","4", "8"}, "1");
        questions[3] = new Question("range of float", new String[]{"1","2","4", "8"}, "4");
        questions[4] = new Question("range of double", new String[]{"1","2","4", "8"}, "8");
    }

    @SuppressWarnings("resource")
    public void playQuiz() {
        int score = 0;
        if(questions.length>0){
            for (Question question : questions) {
                question.getQuestion();
                System.out.println(" Please enter your answer: ");
                Scanner sc = new Scanner(System.in);
                String ans = sc.nextLine();
                if(ans == question.getAnswer()) {
                    score = score+1;
                }
            }    
        }

        System.out.println("You scored "+ score);
    }    
}
