package com.example.demo.approval;

import com.example.demo.models.Cliente;

public class AgeProcessor implements ApprovalManager{
	
	@Override
	public boolean processCliente(Cliente cliente) {
		if (cliente.getIdade() >= 18) {
			return true;
		} else {	
			System.out.println(ProcessorException.MENOR_IDADE.getMessageError());
			return false;
		}	
	}

}
