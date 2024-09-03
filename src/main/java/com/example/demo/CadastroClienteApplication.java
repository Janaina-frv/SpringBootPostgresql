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
		
		List<ApprovalManager> processors = new ArrayList<>();
		processors.add(new ageProcessor());
		processors.add(new patrimonioProcessor());
		processors.add(new profissaoProcessor());

		// Create a leave request
		Cliente request = new Cliente("John", "000.000.111-44", 20, "M", "desempregado", 1000, 1000);
		
		boolean result = false;
		for (ApprovalManager processor : processors) {
		    	result = processor.processCliente(request);
		    };
		System.out.println(result);
		
		

	}

}
