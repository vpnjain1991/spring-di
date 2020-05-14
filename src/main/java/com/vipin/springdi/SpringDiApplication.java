package com.vipin.springdi;

import com.vipin.springdi.controllers.*;
import com.vipin.springdi.exampleBeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("Profile");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-----Primary------");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("---Property-------------");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------Setter-------------------");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------Constructor--------------");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("----------FakeDataSource");
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean("fakeDataSource");
		System.out.println(fakeDataSource.getUsername() + "\t" +
				fakeDataSource.getPassword() + "\t" + fakeDataSource.getUrl());
	}

}
