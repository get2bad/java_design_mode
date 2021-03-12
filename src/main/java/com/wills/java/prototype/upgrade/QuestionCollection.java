package com.wills.java.prototype.upgrade;

import com.wills.java.prototype.common.ChoiceQuestion;
import com.wills.java.prototype.common.FieldQuestion;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 王帅
 * @date 2021-03-12 13:05:46
 * @description:
 */
@Setter
@Getter
public class QuestionCollection implements Cloneable{

    private String username;
    private String number;

    private ArrayList<ChoiceQuestion> choiceQuestions = new ArrayList<>();
    private ArrayList<FieldQuestion> fieldQuestions = new ArrayList<>();

    public QuestionCollection append(ChoiceQuestion choiceQuestion){
        choiceQuestions.add(choiceQuestion);
        return this;
    }

    public QuestionCollection append(FieldQuestion fieldQuestion){
        fieldQuestions.add(fieldQuestion);
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        QuestionCollection questionCollection = (QuestionCollection) super.clone();
        questionCollection.choiceQuestions = (ArrayList<ChoiceQuestion>) choiceQuestions.clone();
        questionCollection.fieldQuestions = (ArrayList<FieldQuestion>) fieldQuestions.clone();

        // 题目乱序
        Collections.shuffle(questionCollection.choiceQuestions);
        Collections.shuffle(questionCollection.fieldQuestions);

        return questionCollection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("学生：" + username);
        sb.append("\r\n学号：" + number);
        sb.append("\r\n选择题：：");
        choiceQuestions.forEach(data -> {
            sb.append("\r\n" + data.getName());
            for (String s : data.getOption().keySet()) {
                sb.append("\r\n" + s + ":" + data.getOption().get(s));
            }
        });

        sb.append("填空题：");
        for (FieldQuestion question : fieldQuestions) {
            sb.append("\r\n" + question.getName());
        }

        return sb.toString();
    }
}
