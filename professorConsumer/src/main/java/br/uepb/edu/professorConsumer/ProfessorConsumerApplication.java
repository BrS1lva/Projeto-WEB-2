package br.uepb.edu.professorConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ProfessorConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfessorConsumerApplication.class, args);
	}

}
