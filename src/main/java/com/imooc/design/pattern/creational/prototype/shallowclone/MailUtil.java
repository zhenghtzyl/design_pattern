package com.imooc.design.pattern.creational.prototype.shallowclone;

import java.text.MessageFormat;

/**
 * @author zht
 * @date 2019/4/19 17:17
 **/
public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "姓名：{0}，邮件地址：{1},邮件内容：{2}";
        System.out.println(MessageFormat.format(
                outputContent,
                mail.getName(),
                mail.getEmailAddress(),
                mail.getContent()));
    }

    /**
     * 存储原始mail
     */
    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录，originMail:"+mail.getContent());
    }
}
