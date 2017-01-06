package com.util.mail;

/**
 * 用于邮件发送测试的主类
 */
public class Main {
    public static void main(String[] args){
        //这个类主要是设置邮件
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.163.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("zhoucheng05_13@163.com");
        mailInfo.setPassword("zhoucheng0513");//您的邮箱密码
        mailInfo.setFromAddress("zhoucheng05_13@163.com");
        mailInfo.setToAddress("1095121033@qq.com");
        mailInfo.setSubject("设置邮箱标题 Java Mail Test");
        mailInfo.setContent("设置邮箱内容 这是一个<a href='href://www.baidu.com'>javax Mail</a>测试");
        //这个类主要来发送邮件
        SimpleMailSender sms = new SimpleMailSender();
        //sms.sendTextMail(mailInfo);//发送文体格式
        SimpleMailSender.sendHtmlMail(mailInfo);//发送html格式
    }
}
