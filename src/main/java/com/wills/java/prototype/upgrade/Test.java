package com.wills.java.prototype.upgrade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王帅
 * @date 2021-03-12 16:40:09
 * @description:
 */
@Slf4j
public class Test {

    @org.junit.Test
    public void test() throws CloneNotSupportedException {
        QuestionPutUtil questionPutUtil = new QuestionPutUtil();
        log.info(questionPutUtil.createPaper("隔壁老王","123333"));
    }
}
