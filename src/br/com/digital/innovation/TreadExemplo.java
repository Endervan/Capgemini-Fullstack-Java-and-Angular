package br.com.digital.innovation;

public class TreadExemplo {

    public static void main(String[] args) {
        BarraCarregamento1 barraCarregamento1 = new BarraCarregamento1();
        // BarraCarregamento barraCarregamento = new BarraCarregamento();
        barraCarregamento1.start();
        // barraCarregamento.start();
    }
}

class GerarPDF implements Runnable {
    @Override
    public void run() {
        System.out.println("Gerar  PDF");
    }
}

class BarraCarregamento implements Runnable {
    @Override
    public void run() {
        System.out.println("Loading ....");
    }
}

class BarraCarregamento1 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Loading 1...." + this.getName());
    }
}
