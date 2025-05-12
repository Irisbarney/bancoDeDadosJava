package bancoDeDadosJava;

public class Cliente {
	private int id;
	private String nome;
	private double saldo;
	
	//construtor novos clientes
	public Cliente(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	//construtor clientes já registrados.
	public Cliente(int id, String nome, double saldo) {
		this.id = id;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	//getters
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//setters
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
