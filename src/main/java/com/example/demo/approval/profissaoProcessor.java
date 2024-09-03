package com.example.demo.approval;

import com.example.demo.models.Cliente;

public class profissaoProcessor implements ApprovalManager{

	@Override
	public boolean processCliente(Cliente cliente) {
		if (cliente.getProfissao() != null) {
			//System.out.println("Cliente empregado!! Aproved!");
			return true;
		} else {
			//System.out.println("Cliente desempregado!! Not Aproved!");
			return false;
		}	
	}
}
