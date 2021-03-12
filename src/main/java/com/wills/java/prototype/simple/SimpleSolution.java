package com.wills.java.prototype.simple;

import com.wills.java.prototype.common.ChoiceQuestion;
import com.wills.java.prototype.common.FieldQuestion;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author 王帅
 * @date 2021-03-12 11:36:17
 * @description:
 */
public class SimpleSolution {

    /**
     *
     * @param number 学号
     * @param username 学生用户名
     * @return
     */
    public String examination(String number,String username){
        List<ChoiceQuestion> choiceQuestions = new LinkedList<>();
        List<FieldQuestion> fieldQuestions = new LinkedList<>();

        // 本来是数据库读取的内容，我们没有应用数据库，所以直接手动创建
        Map<String,String> q1 = new HashMap<>();
        q1.put("A","1");
        q1.put("B","2");
        q1.put("C","3");
        q1.put("D","4");

        Map<String,String> q2 = new HashMap<>();
        q2.put("A","STRING");
        q2.put("B","INTEGER");
        q2.put("C","CHAR");
        q2.put("D","LIST");

        Map<String,String> q3 = new HashMap<>();
        q3.put("A","Thread");
        q3.put("B","Excutors");
        q3.put("C","ThreadPool");
        q3.put("D","ThreadLocal");

        Map<String,String> q4 = new HashMap<>();
        q4.put("A","Binary");
        q4.put("B","Hex");
        q4.put("C","Hash");
        q4.put("D","VERBOSE");

        choiceQuestions.add(new ChoiceQuestion("1+1=?",q1));
        choiceQuestions.add(new ChoiceQuestion("字符串的数据类型是？",q2));
        choiceQuestions.add(new ChoiceQuestion("线程公用的数据存放对象是？",q3));
        choiceQuestions.add(new ChoiceQuestion("Java 反编译class文件，我们要使用哪个参数？",q4));

        fieldQuestions.add(new FieldQuestion("埋在地下一千年的酒，出来以后叫什么?","酒精"));
        fieldQuestions.add(new FieldQuestion("有一只猪，它走啊走啊，走到了英国,结果他变成了什么?","pig"));
        fieldQuestions.add(new FieldQuestion("上课老师抽查背课文,小猪,小狗,小猫都举手了,老师会叫谁?","小狗，因为旺旺仙贝"));
        fieldQuestions.add(new FieldQuestion("蝴蝶, 蚂蚁, 蜘蛛, 蜈蚣,他们一起工作,最后哪一个没有领到酬劳?","蜈蚣，因为无功不受禄"));

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
