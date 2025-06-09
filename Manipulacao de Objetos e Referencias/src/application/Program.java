package application;

import entities.Numero;
import entities.ValorContainer;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        System.out.print("Digite de 1 a 2 para ver as tarefas ou 0 para sair: ");
        int n = sc.nextInt();
        while(n != 0) {
            switch (n) {
                case 1:
                    System.out.print("Digite um valor x: ");
                    x = sc.nextInt();
                    Numero numero = new Numero(x);
                    numero.imprimirNumero();
                    break;
                case 2:
                    System.out.print("Digite um valor x: ");
                    x = sc.nextInt();
                    System.out.print("Digite um valor y: ");
                    y = sc.nextInt();
                    ValorContainer objA = new ValorContainer(x);
                    ValorContainer objB = new ValorContainer(y);
                    System.out.println("Valor 1: " + objA.getValor() + " Valor 2: " + objB.getValor());
                    ValorContainer.trocarValores(objA, objB);
                    System.out.println("Valor 1: " + objA.getValor() + " Valor 2: " + objB.getValor());
                    break;
            }
            System.out.print("Digite de 1 a 2 para ver as tarefas ou 0 para sair: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
