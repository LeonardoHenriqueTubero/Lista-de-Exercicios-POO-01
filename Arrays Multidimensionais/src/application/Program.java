package application;

import servicies.Matriz;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o párametro x: ");
        int x = sc.nextInt();
        int[][] matriz = new int[x][x];
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j< matriz[i].length; j++) {
                System.out.print("Digite o valor da posição: " + i +", " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite entre 1 e 2 para ver as tarefas ou 0 para sair: ");
        int n = sc.nextInt();
        while(n != 0) {
            switch (n) {
                case 1:
                    Matriz.maiorMenor(matriz);
                    break;
                case 2:
                Matriz.diagonais(matriz);
                break;
            }
            System.out.print("Digite entre 1 e 2 para ver as tarefas ou 0 para sair: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
