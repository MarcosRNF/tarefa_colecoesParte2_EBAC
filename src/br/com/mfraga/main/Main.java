package br.com.mfraga.main;

import br.com.mfraga.pessoa.Pessoa;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "";

        Set<Pessoa> pessoasM = new TreeSet<>();
        Set<Pessoa> pessoasF = new TreeSet<>();
        do {
            System.out.println("Digite o nome e o sexo da pessoa, separados por espaço");
            String entrada = sc.nextLine();

            String[] partes = entrada.split(" ");
            if(partes.length < 2){
                System.out.println("entrada inválida. digite dois valores!");
                continue;
            }

            String nome = partes[0];
            String sexo = partes[1];

            if(sexo.equalsIgnoreCase("masculino")){
                Pessoa pessoa = new Pessoa(nome, sexo);
                pessoasM.add(pessoa);
            } else if (sexo.equalsIgnoreCase("feminino")){
                Pessoa pessoa = new Pessoa(nome, sexo);
                pessoasF.add(pessoa);
            } else {
                System.out.println("Sexo Inválido.");
            }

            System.out.println("Deseja adicionar mais pessoas? ");
            resposta = sc.nextLine();
        }while(resposta.equalsIgnoreCase("sim"));

        for(Pessoa pessoa : pessoasM){
            System.out.println("Pessoas do sexo Masculino: " + pessoa.getNome());
        }

        for(Pessoa pessoa : pessoasF ){
            System.out.println("Pessoas do sexo Feminino: " + pessoa.getNome());
        }


        sc.close();
    }
}
