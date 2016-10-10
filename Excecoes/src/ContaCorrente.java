//2) Considere o código inicial a seguir:
public class ContaCorrente{

    private double saldo;

    public ContaCorrente(double saldoInicial){
        saldo = saldoInicial;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void retirada(double valor){
        saldo -= valor;
    }

    public double getSaldo(){ return(saldo);   }
}

//a) Considerando que o saldo nunca pode ser negativo, crie uma nova classe de exceção 'InvalidBalanceException'.

//b) Ajuste o código original para que esta nova exceção seja lançada nos casos de exceção

//c) Implemente uma outra classe que instancia a ContaCorrente e trata a exceção criada.