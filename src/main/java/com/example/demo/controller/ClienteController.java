package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Cliente;
import com.example.demo.service.ClienteService;

import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public List<Cliente> findAllCliente(){
		return clienteService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> findClienteById(@PathVariable("id") int clienteId){
		return clienteService.findByID(clienteId);
	}
	
	@PostMapping
	public Cliente save(@RequestBody Cliente cliente){
		return clienteService.save(cliente);
	}
	
	@PutMapping
	public Cliente update(@RequestBody Cliente cliente){
		return clienteService.update(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		clienteService.delete(id);
	}

 

}
