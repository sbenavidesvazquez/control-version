package pracversiones;

import java.util.Scanner;

public class PracVersiones {

    public static void main(String[] args) {
        System.out.println("Practica de control de versiones ");
        System.out.println("version 1");
        System.out.println("Sergio benavides");

        System.out.println("¿Que version escoje?");
        Scanner dat = new Scanner(System.in);
        int num = dat.nextInt();
        do {
            if (num == 1) {
                System.out.println("version " + num);
            } else if (num == 2) {
                System.out.println("version " + num);
            } else {
                System.out.println("Version " + num + " no encontrada");
            }
        } while (num != 0);
    }

}
