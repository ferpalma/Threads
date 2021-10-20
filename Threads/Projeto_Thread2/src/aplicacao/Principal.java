package aplicacao;

import conta.Deposito;
import conta.Saque;
import myThreads.ThreadDepositar;
import myThreads.ThreadSacar;

public class Principal {
    public static void main(String [] args) throws InterruptedException {

        Deposito deposito = new Deposito();
        Saque saque = new Saque();

        ThreadDepositar t1 = new ThreadDepositar(deposito);
        t1.start();

        ThreadDepositar t2  = new ThreadDepositar(deposito);
        t2.start();

        ThreadDepositar t3 = new ThreadDepositar(deposito);
        t3.start();

        ThreadSacar s1 = new ThreadSacar(saque);
        s1.start();

        ThreadSacar s2  = new ThreadSacar(saque);
        s2.start();

        ThreadSacar s3 = new ThreadSacar(saque);
        s3.start();

        t1.join();
        t2.join();
        t3.join();

        s1.join();
        s2.join();
        s3.join();

        double result =  saque.getSaldo() + deposito.getSaldo();
        System.out.println(result);
    }
}
