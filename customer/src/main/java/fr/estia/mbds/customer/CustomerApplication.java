package fr.estia.mbds.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository)
	{
		return args -> {
			List<Customer> customers = List.of(
					Customer.builder()
							.firstName("Alice")
							.lastName("Tata")
							.email("alice.tata@uca.fr")
							.build(),
					Customer.builder()
							.firstName("Bob")
							.lastName("Dylan")
							.email("bob@uca.fr")
							.build(),
					Customer.builder()
							.firstName("Charles")
							.lastName("Toto")
							.email("charles@uca.fr")
							.build(),
					Customer.builder()
							.firstName("Denis")
							.lastName("Palez")
							.email("denis@uca.fr")
							.build()
			);
			customerRepository.saveAll(customers);
		};
	}
}
