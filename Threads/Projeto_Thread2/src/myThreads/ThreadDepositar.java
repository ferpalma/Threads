package myThreads;

import conta.Deposito;

public class ThreadDepositar extends Thread {

    Deposito deposito = new Deposito();

    public ThreadDepositar(Deposito d){
        this.deposito = d;
    }

    @Override
    public void run() {
        for (int i=0; i < 1000; i++) {
            deposito.depositar();
        }
    }
}
