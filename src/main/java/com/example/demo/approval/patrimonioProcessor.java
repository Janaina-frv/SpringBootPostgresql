package com.example.demo.approval;

import com.example.demo.models.Cliente;

public class patrimonioProcessor implements ApprovalManager{
	
	@Override
	public boolean processCliente(Cliente cliente) {
		if (cliente.getPatrimonio() >= 10000) {
			//System.out.println("Patrimônio maior que 10.000!! Aproved!");
			return true;
		} else {
			//System.out.println("Patrimônio não é maior que 10.000!! Not Aproved!");
			return false;
		}	
	}
}
