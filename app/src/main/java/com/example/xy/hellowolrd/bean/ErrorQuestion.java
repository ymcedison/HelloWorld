//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.xy.hellowolrd.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class ErrorQuestion implements Parcelable {
    public int questionId;
    public String questionName;
    public String questionType;
    public String questionAnswer;
    public String questionSelect;
    public String isRight;
    public String Analysis;
    public String optionA;
    public String optionB;
    public String optionC;
    public String optionD;
    public String optionE;
    public String optionType;

    public ErrorQuestion() {
    }

    public int getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionName() {
        return this.questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getQuestionType() {
        return this.questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionAnswer() {
        return this.questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionSelect() {
        return this.questionSelect;
    }

    public void setQuestionSelect(String questionSelect) {
        this.questionSelect = questionSelect;
    }

    public String getIsRight() {
        return this.isRight;
    }

    public void setIsRight(String isRight) {
        this.isRight = isRight;
    }

    public String getAnalysis() {
        return this.Analysis;
    }

    public void setAnalysis(String analysis) {
        this.Analysis = analysis;
    }

    public String getOptionA() {
        return this.optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return this.optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return this.optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return this.optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getOptionE() {
        return this.optionE;
    }

    public void setOptionE(String optionE) {
        this.optionE = optionE;
    }

    public String getOptionType() {
        return this.optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int arg1) {
        dest.writeString(this.questionName);
        dest.writeString(this.questionType);
        dest.writeString(this.questionAnswer);
        dest.writeString(this.questionSelect);
        dest.writeString(this.isRight);
        dest.writeString(this.Analysis);
        dest.writeString(this.optionA);
        dest.writeString(this.optionB);
        dest.writeString(this.optionC);
        dest.writeString(this.optionD);
        dest.writeString(this.optionE);
        dest.writeString(this.optionType);
    }
}
