package com.prashant;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.prashant.domain.Reservation;
import com.prashant.service.ReservationRepository;

@SpringBootApplication
public class Application {

	@Bean
	CommandLineRunner commandLineRunner(ReservationRepository repository) {
		return string -> {
			Stream.of("Drake", "Eric", "Pattrick").forEach(name -> repository.save(new Reservation(name)));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
