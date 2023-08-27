package br.atividadeapi.dw.atividadedw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.atividadeapi.dw.atividadedw.entidade.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
