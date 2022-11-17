package com.app.nagu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.nagu.Dao.ReportDao;
import com.app.nagu.service.MessageService;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		MessageService message = new MessageService();
		message.getWelcomeMsg();
		message.getGreetMsg();
		
		ReportDao dao = new ReportDao();
		dao.getName(101);
	}

}
