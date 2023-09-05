package br.jdbc.dto;

public class loginDTO {
	private int idCliente;
	private String emailCliente;
	private String senhaCliente;
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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
	
		
	public String toString() {
		return  getIdCliente() + "" + getEmailCliente() + "" + getSenhaCliente() ;
	}
}
