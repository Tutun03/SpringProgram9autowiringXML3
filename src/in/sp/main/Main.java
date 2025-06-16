package in.sp.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.student;


public class Main {
public static void main(String[] args) {
	String config_file="in/sp/resource/applicationContext.xml";
	ClassPathXmlApplicationContext contect=new ClassPathXmlApplicationContext(config_file);
	student std1=(student)contect.getBean("studentid");
	std1.display();
}
}
