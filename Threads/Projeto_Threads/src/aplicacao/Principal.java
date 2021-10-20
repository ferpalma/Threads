package aplicacao;

import conta.Deposito;
import myThreads.ThreadProject;

public class Principal {
    public static void main(String [] args) throws InterruptedException {

        Deposito deposito = new Deposito();
        ThreadProject t1 = new ThreadProject(deposito);
        t1.start();

        ThreadProject t2  = new ThreadProject(deposito);
        t2.start();

        ThreadProject t3 = new ThreadProject(deposito);
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(deposito.getSaldo());
    }
}
