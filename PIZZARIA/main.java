package PIZZARIA;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int op1;
        int op2;
        Scanner d = new Scanner(System.in);
        System.out.println("qual pizza voce quer?\n1 pizza americano\n2 pizza indiano");
        op1 = d.nextInt();
        switch (op1) {
            case 1:
            System.out.println("pizza americana");
            System.out.println("pizza 1-vegana ou 2-nao vegana?");
            op2 = d.nextInt();
            switch (op2) {
                case 1:
                uspizzafactory u1 = new uspizzafactory();
                u1.pizzavegana();
                System.out.println(u1.pizzavegana());
                break;
                case 2:
                uspizzafactory u2 = new uspizzafactory();
                u2.pizzanaovegana();
                System.out.println(u2.pizzavegana());
                break;
            }
            break;
            case 2:
            System.out.println("pizza indiana");
            System.out.println("pizza 1-vegana ou 2-nao vegana?");
            op2 = d.nextInt();
            switch (op2) {
                case 1:
                indianpizzafactory u1 = new indianpizzafactory();
                System.out.println(u1.pizzavegana());
                break;
                case 2:
                uspizzafactory u2 = new uspizzafactory();
                u2.pizzanaovegana();
                System.out.println(u2.pizzavegana());
                break;
            }
            break;
        }
    }
}
