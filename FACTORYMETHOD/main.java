package FACTORYMETHOD;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int op;
        String marcav;
        Integer anov;
        String modelov;
        Scanner d = new Scanner(System.in);
        System.out.println("digite o veiculo que construir\n 1 para carro\n 2 para moto\n 3 para navio");
        op = d.nextInt();
        switch (op) {
            case 1:
            System.out.println("marca do carro:");
            marcav = d.next();
            System.out.println("ano do carro:");
            anov = d.nextInt();
            System.out.println("modelo do carro:");
            modelov = d.next();
            carro d1 = new carro(marcav, anov, modelov);
            System.out.println(d1.veiculo());
            break;
            case 2:
            System.out.println("marca da moto:");
            marcav = d.next();
            System.out.println("ano da moto:");
            anov = d.nextInt();
            System.out.println("modelo da moto:");
            modelov = d.next();
            moto d2 = new moto(marcav, anov, modelov);
            System.out.println(d2.veiculo());
            break;
            case 3:
            System.out.println("marca do navio:");
            marcav = d.next();
            System.out.println("ano do navio:");
            anov = d.nextInt();
            System.out.println("modelo do navio:");
            modelov = d.next();
            navio d3 = new navio(marcav, anov, modelov);
            System.out.println(d3.veiculo());
            break;
        }
    }
}
