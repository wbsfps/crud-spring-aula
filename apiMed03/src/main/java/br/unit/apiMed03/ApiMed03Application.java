package br.unit.apiMed03;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiMed03Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiMed03Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
	}
}
