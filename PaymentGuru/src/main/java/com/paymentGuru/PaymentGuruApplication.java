package com.paymentGuru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PaymentGuruApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentGuruApplication.class, args);
	}

}
