package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.approval.ApprovalManager;
import com.example.demo.approval.AgeProcessor;
import com.example.demo.approval.AllProcessors;
import com.example.demo.approval.PatrimonioProcessor;
import com.example.demo.approval.ProfissaoProcessor;
import com.example.demo.models.Cliente;
import com.example.demo.repository.ClienteRepository;


@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();	
	}
	
	@Transactional(readOnly=true)
	public Cliente findByID(int id){
		return clienteRepository.findById(id).orElseThrow();
	}
	
	public Cliente save(Cliente cliente) {
		
		List<ApprovalManager> processors = new ArrayList<>();
		new AllProcessors(processors);

		boolean result = true;
		for (ApprovalManager processor : processors) {
		    result = result && processor.processCliente(cliente);
		};
		if (result) {clienteRepository.save(cliente);} 
		
		return cliente;
	}
	
	public Cliente update(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public void delete(int id) {
		clienteRepository.deleteById(id);;
	}

	public Cliente updatePatch(int clienteId, String nome) {
		Cliente clienteRequest = findByID(clienteId);
		clienteRequest.setNome(nome);
		return clienteRepository.save(clienteRequest);
	}

}
