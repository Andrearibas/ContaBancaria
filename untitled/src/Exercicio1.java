import java.util.concurrent.Callable;

public class Exercicio1 {
    public static void main (String[]args){

        Cliente clienteUm = new Cliente();
        clienteUm.setNome("Andrea");
        clienteUm.setSobrenome("Ribas");

        Conta contaUm = new Conta();
        contaUm.setNumeroConta("12344-5");
        contaUm.setSaldo(300.5F);
        contaUm.setTitular(clienteUm);

        contaUm.depositar(500F);
        contaUm.sacar(100000.0F);
        contaUm.sacar(90F);

        Cliente clienteDois = new Cliente();
        clienteDois.setNome("Maria");
        clienteDois.setSobrenome("da Silva");

        Conta contaDois = new Conta();
        contaDois.setNumeroConta("55432-1");
        contaDois.setSaldo(550.2F);
        contaDois.setTitular(clienteDois);


    }
}
