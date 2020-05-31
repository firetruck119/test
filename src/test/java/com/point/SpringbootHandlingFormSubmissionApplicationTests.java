package com.point;

import com.point.newPDF.Service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHandlingFormSubmissionApplicationTests {
	@Autowired
	private MailService service;
	@Test
	public void contextLoads() {
	}
	@Test
	public void sendmail() {
		service.sendSimpleMail("smfx1314@163.com","主题：你好普通邮件","内容：第一封邮件");
	}
}
