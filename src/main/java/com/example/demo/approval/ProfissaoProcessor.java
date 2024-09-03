package com.example.demo.approval;

import com.example.demo.models.Cliente;

public class ProfissaoProcessor implements ApprovalManager{

	@Override
	public boolean processCliente(Cliente cliente) {
		if (cliente.getProfissao() != null) {
			return true;
		} else {
			System.out.println(ProcessorException.DESEMPREGADO.getMessageError());
			return false;
		}	
	}
}
