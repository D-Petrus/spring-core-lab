package com.training.inqoo.springcorelab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.training.inqoo.springcorelab")
@SpringBootApplication
public class SpringCoreLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreLabApplication.class, args);
	}
	@Autowired
	FirstBean_Parent bean;
	FirstBean_Parent thirdBean;
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
//			System.out.println("Let's inspect beans");
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName: beanNames) {
//				System.out.println(beanName);
//			}
			bean.callOtherBean();
			thirdBean.callThirdBean();
		};
	}

}