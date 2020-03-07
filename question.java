package com.example.quizzapp1;

public class question {
    public    question(String question,String answer,String opt1,String opt2,String opt3,String opt4)
    {
        Question=question;
        Answer=answer;
        option1=opt1;
        option2=opt2;
        option3=opt3;
        option4=opt4;
    }
    private String Question;
    private String Answer;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }
}
