package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.demo.entity")
public class CadastroClienteApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(CadastroClienteApplication.class, args);
	}

}
