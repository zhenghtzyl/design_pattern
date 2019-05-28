package com.imooc.design.pattern.creational.prototype.shallowclone;

/**
 * @author zht
 * @date 2019/4/19 18:59
 **/
public class Test {

    public static void main(String[] args) throws Exception {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail：" + mail);
        for (int i=0; i<10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@imooc.com");
            mailTemp.setContent("恭喜您中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp：" + mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);

    }
}
