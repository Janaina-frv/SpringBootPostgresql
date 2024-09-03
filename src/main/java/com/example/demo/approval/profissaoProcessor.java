package com.example.demo.approval;

import com.example.demo.models.Cliente;

public class profissaoProcessor implements ApprovalManager{
	

	@Override
	public boolean processCliente(Cliente cliente) {
		if (cliente.getProfissao() != "desempregado") {
			System.out.println("Aproved!");
			return true;
		} else {
			System.out.println("Not Aproved!");
			return false;
		}	
	}
}
