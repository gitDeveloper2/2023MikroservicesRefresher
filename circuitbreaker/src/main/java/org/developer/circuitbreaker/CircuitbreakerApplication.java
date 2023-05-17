package org.developer.circuitbreaker;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircuitbreakerApplication {


	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(CircuitbreakerApplication.class, args);

		Tester tester=new Tester();
		String data=tester.getData();
		System.out.println(data);

	}

}
