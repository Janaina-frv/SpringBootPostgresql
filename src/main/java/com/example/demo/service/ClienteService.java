package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();	
	}
	
	public Optional<Cliente> findByID(int id){
		return clienteRepository.findById(id);
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

}
