import java.util.Queue;

public class Conta {

    private String numeroConta;
    private Float saldo;
    private Cliente titular;

    public void imprimirDados(){
        System.out.println("Nome do Cliente: "+titular.getNome()+" "+titular.getSobrenome());
        System.out.println("Saldo atual é: "+saldo);
    }


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(Float quantiaDinheiro) {
        this.saldo = saldo + quantiaDinheiro;
        System.out.println("Deposito efetuado.");
        System.out.println("O novo saldo é: "+saldo);
    }

    public void sacar(Float quantiaDinheiro) {

        if (saldo >= quantiaDinheiro) {
            saldo = saldo -quantiaDinheiro;
            System.out.println("Saque Efetuado");
            System.out.println("O novo saldo é: "+saldo);

        } else {
            System.out.println(titular.getNome()+"tentou sacar "+ quantiaDinheiro);
            System.out.println("Saldo insuficiente: "+saldo);

        }
    }
}