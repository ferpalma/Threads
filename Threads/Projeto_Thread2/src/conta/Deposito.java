package conta;

public class Deposito {

//    Object monitor = new Object();

    private double saldo;

    private double valor = 200.0;

    public synchronized void depositar(){
        saldo += valor;

//        synchronized (monitor){
//            saldo += valor;
//        }

//        synchronized (this){
//            saldo += valor;
//        }
    }
    public double getSaldo() {
        return saldo;
    }
    public double getValor() {
        return valor;
    }
}
