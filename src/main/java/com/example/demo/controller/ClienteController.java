package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Cliente;
import com.example.demo.service.ClienteService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Cliente> findAllCliente(){
		return clienteService.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Cliente findClienteById(@PathVariable("id") int clienteId){
		return clienteService.findByID(clienteId);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
		Cliente clienteRequest = clienteService.save(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteRequest);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Cliente update(@PathVariable("id") int clienteId, @RequestBody Cliente cliente){
		return clienteService.update(cliente);
	}
	
	@PatchMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Cliente updateOne(@PathVariable("id") int clienteId, @RequestBody Cliente cliente){
		return clienteService.updatePatch(clienteId, cliente.getNome());
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") int id) {
		clienteService.delete(id);
	}

 

}
