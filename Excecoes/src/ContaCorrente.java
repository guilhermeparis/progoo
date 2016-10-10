public class ContaCorrente {

    private double saldo;

    public ContaCorrente(double saldoInicial){
        saldo = saldoInicial;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void retirada(double valor) throws InvalidBalanceException{
        saldo -= valor;
        if(saldo<0) throw new InvalidBalanceException();
    }

    public double getSaldo(){
    	return(saldo);
    }
}