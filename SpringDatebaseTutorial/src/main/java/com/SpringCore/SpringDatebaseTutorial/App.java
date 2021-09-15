package com.SpringCore.SpringDatebaseTutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringCore.SpringDatebaseTutorial.Entities.Student;
import com.SpringCore.SpringDatebaseTutorial.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("My Program started..............");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/SpringCore/SpringDatebaseTutorial/config.xml");
		System.out.println("date base connected");
		StudentDao studentdao = (StudentDao) context.getBean("studentdaoimpl");
//		Student student = new Student();
//		student.setCity("Dehradun");
//		student.setId(226);
//		student.setName("Manish");
//		int r = studentdao.insert(student);
//		System.out.println("number of students added :" + r);
		
		Student student=new Student();
		student.setId(226);
		student.setName("Sanjeeta");
		student.setCity("Delhi");
		int m=studentdao.change(student);
		System.out.println("number of data updated :"+m);

	}
}
