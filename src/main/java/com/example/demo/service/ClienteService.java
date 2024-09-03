package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		return clienteRepository.save(cliente);
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
