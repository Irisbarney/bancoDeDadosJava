package bancoDeDadosJava;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Conexão Java + Banco de Dados:\n");
		
		 ClienteDAO dao = new ClienteDAO();
		 
		 String nome = JOptionPane.showInputDialog("Qual seu nome?");
		 
		 String saldostring = JOptionPane.showInputDialog("Qual seu saldo?");
		 
		 double saldo = Double.parseDouble(saldostring);
		 
	       // Inserir um cliente
	       Cliente novoCliente = new Cliente(nome, saldo);
	       dao.inserir(novoCliente);
	       
	       JOptionPane.showMessageDialog(null, "Cliente " + nome + " criado");

	       // Listar clientes
	       dao.listar();
	       
	       JOptionPane.showMessageDialog(null, "Clientes listados.");

	       //mensagem para atualização
	       JOptionPane.showMessageDialog(null, "Seu nome será mudado para Kelvin, e seu saldo será de 3000.00!");
	       
	       // Atualizar cliente com ID 1 
	       Cliente clienteAtualizado = new Cliente(1, "Kelvin", 3000.00);
	       dao.atualizar(clienteAtualizado);
	       
	       // Listar clientes
	       dao.listar();
	       
	       JOptionPane.showMessageDialog(null, "Clientes listados.");
	       
	       //mensagem para deletar
	       int resposta = JOptionPane.showConfirmDialog(null, "Quer deletar cliente?");
	       if (resposta == JOptionPane.YES_OPTION) {
	    	   //deletar cliente
		       dao.deletar(1);
		       JOptionPane.showMessageDialog(null, "Cliente deletado!");
	       } else if (resposta == JOptionPane.NO_OPTION) {
	    	   JOptionPane.showMessageDialog(null, "Cliente não deletado!");
	       }

	}

}
