package br.ufc.crateus.web.loja.model;

public class Usuario {

	private String login;
	private String senha;
	
	public Usuario() {
	}
	
	public Usuario(String login, String senha) {
		setLogin(login);
		setSenha(senha);
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String password) {
		this.senha = password;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", password=" + senha + "]";
	}
}
