package com.example.demo.approval;

import com.example.demo.models.Cliente;

public class ageProcessor implements ApprovalManager{
	
	@Override
	public boolean processCliente(Cliente cliente) {
		if (cliente.getIdade() >= 18) {
			System.out.println("Cliente maior de idade!! Aproved!");
			return true;
		} else {
			//throw new ApplicationException(processorException.MENOR_IDADE);		
			System.out.println(processorException.MENOR_IDADE.getMessageError());
			return false;
		}	
	}

}
