package quizApp.quizGame;

public class Question {
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
