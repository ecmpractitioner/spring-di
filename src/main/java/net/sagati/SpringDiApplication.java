package net.sagati;

import net.sagati.controllers.*;
import net.sagati.services.ConstructorGreetingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringDiApplication.class, args);

		I18nController i18nController = (I18nController)applicationContext.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println(myController.sayGreetings());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());

		SetterInjectController setterInjectController = (SetterInjectController)applicationContext.getBean("setterInjectController");
		//setterInjectController.setGreetingService(new ConstructorGreetingServiceImpl());
		System.out.println(setterInjectController.getGreetings());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());

	}

}
