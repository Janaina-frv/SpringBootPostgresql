package com.example.demo.approval;

import com.example.demo.models.Cliente;

public class ageProcessor implements ApprovalManager{
	
	@Override
	public boolean processCliente(Cliente cliente) {
		if (cliente.getIdade() >= 18) {
			return true;
		} else {	
			System.out.println(processorException.MENOR_IDADE.getMessageError());
			return false;
		}	
	}

}
