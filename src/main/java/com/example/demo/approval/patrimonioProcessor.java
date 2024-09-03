package com.example.demo.approval;

import com.example.demo.models.Cliente;

public class patrimonioProcessor implements ApprovalManager{
	
	@Override
	public boolean processCliente(Cliente cliente) {
		if (cliente.getPatrimonio() >= 10000) {
			return true;
		} else {
			System.out.println(processorException.PATRIMONIO_LIMITE.getMessageError());
			return false;
		}	
	}
}
