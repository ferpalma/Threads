package myThreads;

import conta.Saque;

public class ThreadSacar extends Thread {

    Saque saque = new Saque();

    public ThreadSacar(Saque s){
        this.saque= s;
    }

    @Override
    public void run() {
        for (int i=0; i < 1000; i++) {
            saque.sacar();
        }
    }
}
