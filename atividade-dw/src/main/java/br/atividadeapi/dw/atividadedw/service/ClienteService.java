package br.atividadeapi.dw.atividadedw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.atividadeapi.dw.atividadedw.entidade.Cliente;
import br.atividadeapi.dw.atividadedw.repository.ClienteRepository;
import jakarta.transaction.Transactional;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Transactional
	public List<Cliente> listarTodos() {
		return clienteRepository.findAll();
	}

	public Cliente consultarPorId(Long id) {
		return clienteRepository.findById(id.longValue()).get();
	}

	public Cliente inserir(Cliente novoCliente) {
		return clienteRepository.save(novoCliente);
	}

	public Cliente atualizar(Cliente clienteAtualizar) {
		return clienteRepository.save(clienteAtualizar);

	}

	public boolean excluir(Integer id) {
		clienteRepository.deleteById(id.longValue());
		return true;
	}

}
