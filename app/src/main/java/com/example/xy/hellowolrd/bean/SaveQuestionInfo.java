//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.xy.hellowolrd.bean;

public class SaveQuestionInfo {
    private String questionId;
    private String questionType;
    private String realAnswer;
    private String is_correct;
    private String score;

    public SaveQuestionInfo() {
    }

    public String getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionType() {
        return this.questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getRealAnswer() {
        return this.realAnswer;
    }

    public void setRealAnswer(String realAnswer) {
        this.realAnswer = realAnswer;
    }

    public String getIs_correct() {
        return this.is_correct;
    }

    public void setIs_correct(String is_correct) {
        this.is_correct = is_correct;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String toString() {
        return "{\'question_id\':\'" + this.getQuestionId() + "\',\'question_type\':\'" + this.getQuestionType() + "\',\'realAnswer\':\'" + this.getRealAnswer() + "\',\'is_correct\':\'" + this.getIs_correct() + "\',\'score\':\'" + this.getScore() + "\'}";
    }
}
