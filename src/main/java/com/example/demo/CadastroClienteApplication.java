package com.example.demo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.approval.*;
import com.example.demo.models.Cliente;

@SpringBootApplication
public class CadastroClienteApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(CadastroClienteApplication.class, args);
	}

}
