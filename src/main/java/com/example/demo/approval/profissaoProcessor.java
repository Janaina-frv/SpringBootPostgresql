package com.example.demo.approval;

import com.example.demo.models.Cliente;

public class profissaoProcessor implements ApprovalManager{

	@Override
	public boolean processCliente(Cliente cliente) {
		if (cliente.getProfissao() != null) {
			return true;
		} else {
			System.out.println(processorException.DESEMPREGADO.getMessageError());
			return false;
		}	
	}
}
