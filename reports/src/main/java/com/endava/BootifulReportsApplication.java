package com.endava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@Import()
//@ImportResource("")

@EnableConfigurationProperties(ReportProperties.class)
//@PropertySource()
@EnableAsync
public class BootifulReportsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(new Class<?>[]{BootifulReportsApplication.class}, args);
//		ConfigurableApplicationContext context = SpringApplication.run(ApppConfig.class, args);
//		context.getBean(Foo.class).print();
		context.getBean(FooImpl.class).print();
	}

	@Bean
	public CommandLineRunner commandLineRunner(ReportProperties properties) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println(properties);
			}
		};
	}
}

interface Foo {
	void print();
}

@Component
class FooImpl /*implements Foo*/  {

	@Async
//	@Override
	public void print() {
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println();
	}
}

//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration
//class ApppConfig {
//
//}
