package cn.com.brouseli.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.com.brouseli")
public class MainStat {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(MainStat.class);
		UserServiceImpl userService=context.getBean(UserServiceImpl.class);
		userService.sayHi();
	}
}
