package application;

import entities.Contato;
import entities.Funcionario;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();
        List<Contato> contatos = new ArrayList<>();

        System.out.print("Digite quantos funcionarios cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            sc.nextLine();
            System.out.print("Departamento: ");
            String departamento = sc.nextLine();

            funcionarios.add(new Funcionario(nome, id, salario, departamento));
        }

        System.out.print("Digite quantos contatos cadastrar: ");
        n = sc.nextInt();
        while(n > 10) {
            System.out.println("Não pode ser maior do que 10.");
            System.out.println("Digite quantos contatos cadastrar: ");
            n = sc.nextInt();
        }
        sc.nextLine();
        for(int i=0; i<n; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Telefone: ");
            String telefone = sc.next();
            System.out.print("Email: ");
            String email = sc.next();
            sc.nextLine();

            contatos.add(new Contato(nome, telefone, email));
        }

        System.out.print("Digite de 1 a 2 para ver as tarefas ou 0 para sair: ");
        n = sc.nextInt();
        sc.nextLine();
        while(n !=0) {
            switch (n) {
                case 1:
                    System.out.print("Digite um departamento: ");
                    String departamento = sc.nextLine();
                    double soma = funcionarios.stream().filter(f -> f.getDepartamento().equalsIgnoreCase(departamento)).mapToDouble(Funcionario::getSalario).sum();
                    System.out.println("Soma do departamento " + departamento + ": " + soma);

                    for(Funcionario f : funcionarios) {
                        System.out.println(f);
                    }
                    break;
                case 2:
                    for(Contato c : contatos) {
                        System.out.println(c);
                    }
                    System.out.print("Digite um nome: ");
                    String nome = sc.nextLine();
                    Optional<Contato> contato = contatos.stream().filter(c -> c.getNome().equalsIgnoreCase(nome)).findFirst();

                    if(contato.isPresent()) {
                        Contato c = contato.get();
                        System.out.println("Telefone: " + c.getTelefone() + ", Email: " + c.getEmail());
                    }
                    else {
                        System.out.println("Contato não encontrdo.");
                    }
                    break;
            }
            System.out.print("Digite de 1 a 2 para ver as tarefas ou 0 para sair: ");
            n = sc.nextInt();
            sc.nextLine();
        }

        sc.close();
    }
}
