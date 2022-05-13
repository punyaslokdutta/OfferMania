package com.offerMania.maven;

import com.offerMania.maven.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
//This annotation makes it serve REST API
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
	//only GET endpoint
	@GetMapping
	public List<Customer> hello()
	{
		return  List.of(
				new Customer(
						1L,
						"fx",
						"fxHole@gmail.com",
						LocalDate.of(1990, Month.JANUARY, 5),
						32
				),
				new Customer(
						2L,
						"fx",
						"fxHffole@gmail.com",
						LocalDate.of(1990, Month.JANUARY, 5),
						32
				)

		);
	}

}
