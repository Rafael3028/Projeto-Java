package br.jdbc.dto;

public class clienteDTO {
	private int idCliente;
	private String nomeCliente;
	private String emailCliente;
	private String senhaCliente;
	private String enderecoCliente;
	private int telefoneCliente;
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getSenhaCliente() {
		return senhaCliente;
	}
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public int getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(int telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	public String toString() {
		return getIdCliente() + "" + getNomeCliente() + "" + getEmailCliente() + "" + getSenhaCliente() + "" + getEnderecoCliente() + "" + getTelefoneCliente();
	}
}
