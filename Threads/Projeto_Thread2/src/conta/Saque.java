package conta;

import conta.Deposito;

public class Saque {

    Deposito d = new Deposito();
//    Object monitor = new Object();

    private double saldo = d.getSaldo();

    public synchronized void sacar(){
        saldo -= d.getValor();

//        synchronized (monitor){
//            saldo -= d.getValor();
//        }
//
//        synchronized (this){
//            saldo -= d.getValor();
//        }
    }
    public double getSaldo() {
        return saldo;
    }
}
