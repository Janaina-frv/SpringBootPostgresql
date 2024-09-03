package com.example.demo.approval;

import com.example.demo.models.Cliente;

public class patrimonioProcessor implements ApprovalManager{
	
	@Override
	public boolean processCliente(Cliente cliente) {
		if (cliente.getPatrimonio() >= 10000) {
			System.out.println("Aproved!");
			return true;
		} else {
			System.out.println("Not Aproved!");
			return false;
		}	
	}
}
