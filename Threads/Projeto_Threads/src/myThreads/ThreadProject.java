package myThreads;

import conta.Deposito;

public class ThreadProject extends java.lang.Thread {

    Deposito deposito = new Deposito();

    public ThreadProject(Deposito d){
        this.deposito = d;
    }

    @Override
    public void run() {
        for (int i=0; i < 10000; i++) {
            deposito.depositar();
        }
    }
}
