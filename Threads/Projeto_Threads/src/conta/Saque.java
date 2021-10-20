package conta;

public class Saque {

//    Object monitor = new Object();

    private double saldo = 0.0;

    private double valor = 200.0;

    public synchronized void sacar(){
        saldo -= valor;

//        synchronized (monitor){
//            saldo -= valor;
//        }
//
//        synchronized (this){
//            saldo -= valor;
//        }
    }
    public double getSaldo() {
        return saldo;
    }
}
