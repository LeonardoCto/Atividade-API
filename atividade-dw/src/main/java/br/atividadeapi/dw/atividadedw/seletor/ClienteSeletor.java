package br.atividadeapi.dw.atividadedw.seletor;

import java.time.LocalDate;

public class ClienteSeletor extends BaseSeletor {

	private String nome;
	private String cpf;
	private String telefone;
	private LocalDate dataCadastroInicial;
	private LocalDate dataCadastroFinal;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataCadastroInicial() {
		return dataCadastroInicial;
	}

	public void setDataCadastroInicial(LocalDate dataCadastroInicial) {
		this.dataCadastroInicial = dataCadastroInicial;
	}

	public LocalDate getDataCadastroFinal() {
		return dataCadastroFinal;
	}

	public void setDataCadastroFinal(LocalDate dataCadastroFinal) {
		this.dataCadastroFinal = dataCadastroFinal;
	}

}
