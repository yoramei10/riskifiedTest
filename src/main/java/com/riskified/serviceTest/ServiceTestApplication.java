package com.riskified.serviceTest;

import com.riskified.serviceTest.services.MainServiceApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceTestApplication implements CommandLineRunner {

	@Autowired
	private MainServiceApplicationService mainServiceApplicationService;

	public static void main(String[] args) {
		SpringApplication.run(ServiceTestApplication.class, args);
	}


	@Override
	public void run(final String... s) {

		System.out.println("the rule verification: " + mainServiceApplicationService.exeService());

	}
}
