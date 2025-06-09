package application;

import services.Calculadora;
import services.ConversorTemperatura;
import services.Fatorial;
import services.PalindromoCheck;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite de 1 a 4 para ver as tarefas ou 0 para sair: ");
        int n = sc.nextInt();
        while(n != 0) {
            switch (n) {
                case 1:
                    System.out.print("Digite um numero x: ");
                    int x = sc.nextInt();
                    System.out.print("Digite um numero y: ");
                    int y = sc.nextInt();
                    System.out.print("Digite qual opção deseja(soma-1, subtração-2, multiplicação-3 ou divisão-4): ");
                    int op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println(Calculadora.soma(x, y));
                            break;
                        case 2:
                            System.out.println(Calculadora.subtracao(x, y));
                            break;
                        case 3:
                            System.out.println(Calculadora.multiplicacao(x, y));
                            break;
                        case 4:
                            System.out.println(Calculadora.divisao(x, y));
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Digite uma palavra: ");
                    String palavra = sc.next();
                    if(PalindromoCheck.verificarPalindromo(palavra)) {
                        System.out.println("A palavra: " + palavra + " é um palíndromo.");
                    }
                    else {
                        System.out.println("A palavra: " + palavra + " não é um palíndromo.");
                    }
                    break;
                case 3:
                    System.out.print("Digite um número inteiro não negativo: ");
                    x = sc.nextInt();
                    long resultado = Fatorial.fatorial(x);
                    System.out.println("O fatorial de " + x + " é: " + resultado);
                    break;
                case 4:
                    System.out.print("Digite a temperatura: ");
                    double temp = sc.nextDouble();
                    System.out.print("Digite qual a conversão (Celsius->Fahrenheit-1 e Fahrenheit->Celsius-2): ");
                    op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println(ConversorTemperatura.celsiusFahrenheit(temp));
                            break;
                        case 2:
                            System.out.println(ConversorTemperatura.fahrenheitCelsius(temp));
                            break;
                    }
                    break;
            }
            System.out.print("Digite de 1 a 4 para ver as tarefas ou 0 para sair: ");
            n = sc.nextInt();
        }

        sc.close();
    }
}
