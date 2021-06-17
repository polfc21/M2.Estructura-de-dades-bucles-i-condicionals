package nivell2;

import java.util.Scanner;

public class Fase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix l'altura de la piràmide:");
        int alturaPiramide = sc.nextInt();
        for (int pis = 1; pis <= alturaPiramide ; pis++){
            for (int espais = 0; espais < pis ; espais++){
                System.out.print(" ");
            }
            for (int asteriscs = 2 * alturaPiramide - pis; asteriscs >= pis; asteriscs--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
