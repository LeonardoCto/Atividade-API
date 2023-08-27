package br.atividadeapi.dw.atividadedw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.atividadeapi.dw.atividadedw.entidade.Cliente;
import br.atividadeapi.dw.atividadedw.service.ClienteService;
import lombok.Delegate;

@RestController
@RequestMapping(path = "/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/todos")
	public List<Cliente> listarTodos() {
		return clienteService.listarTodos();
	}

	@GetMapping(path = "/detalhe/{id}")
	public Cliente pesquisarPorId(@PathVariable Integer id) {
		return clienteService.consultarPorId(id.longValue());
	}

	@PostMapping
	public Cliente salvar(@RequestBody Cliente novoCliente){
		return clienteService.inserir(novoCliente);
	}
	
	@PutMapping
	public boolean atualizar(@RequestBody Cliente clienteAtualizar ) {
		return clienteService.atualizar(clienteAtualizar) != null;
	}
	
	@DeleteMapping("/{id}")
	public boolean excluir(@PathVariable Integer id) {
		return clienteService.excluir(id);
	}
}
