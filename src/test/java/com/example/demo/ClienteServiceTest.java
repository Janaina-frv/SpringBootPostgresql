package com.example.demo;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import com.example.demo.models.Cliente;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.service.ClienteService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Optional;

import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class ClienteServiceTest {
	
	private ClienteRepository repository;
	private ClienteService service;
	private Cliente cliente;
	private Optional<Cliente> optionalCliente;
	
	@Before
	void setup() {
		MockitoAnnotations.openMocks(this);
		startCliente();
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByID() {
		Mockito.when(repository.findById(Mockito.anyInt())).thenReturn(optionalCliente);
		
		Cliente response = service.findByID(1);
		
		Assertions.assertNotNull(response);
		Assertions.assertNotEquals(Cliente.class, response.getClass());
		Assertions.assertEquals("José",response.getNome());
		Assertions.assertEquals("111.222.333-44",response.getCpf());
		Assertions.assertEquals(24,response.getIdade());
		Assertions.assertEquals("M",response.getSexo());
		Assertions.assertEquals("balconista",response.getProfissao());
		Assertions.assertEquals(1500,response.getSalario());
		Assertions.assertEquals(11000,response.getPatrimonio());
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdatePatch() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}
	
	private void startCliente() {
		cliente = new Cliente(1, "José", "111.222.333-44", 24, "M", "balconista", 1500,11000);
//		Cliente cliente2 = new Cliente("Fabio", "213.222.313-45", 27, "M", "designer", 4000,15000);
//		Cliente cliente3 = new Cliente("Paula", "123.221.133-66", 35, "M", "manicure", 1200,11000);
//		Cliente cliente4 = new Cliente("Ana", "151.262.383-62", 70, "M", "aposentada", 12000,100000);
//		Cliente clientefail5 = new Cliente("Maria", "333.444.333-99", 15, "F", "babá", 600,400);
//		Cliente clientefail6 = new Cliente("João", "222.222.111-44", 34, "M", "professor", 3000,7000);
//		Cliente clientefail7 = new Cliente("Pedro", "777.222.213-45", 44, "F", null, 30000,70000);
	}

}
