package com.sample.test.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sample.test.service.TestService;

@Component
public class TestAction {

	@Autowired
	private TestService testService;

	public static void main (String args[]) {

		// We can use either of the methods to load the spring configuration file.
		// ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/service.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:service.xml");
 
		/*
		Note:
		Create an object of TestAction using new operator and then calling the actionethod() won't work as this won't autowire 'testService'.
		This is because we are creating the object by ourself using new operator, rather than getting it from the Spring context.
		So Spring does not get a chance to autowire the dependencies (which causes the NullPointerException).
		*/
		//new TestAction().actionMethod();

		/*
		However after autowiring 'testAction' as @Component and accessing the same using the below line, we will get the bean from the Spring context.
		So Spring takes care of autowiring 'testService'.
		*/
		context.getBean(TestAction.class).actionMethod();
	}

	public void actionMethod() {
		System.out.println(testService.serviceMethod());
	}

}