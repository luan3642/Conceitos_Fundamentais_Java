/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula45;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);

            if (opcao == 1) { //consultar contato
                consultarContato(scan, agenda);
            } else if (opcao == 2) { // adicionar contato
                adicionarContato(scan, agenda);
            }
        }

    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {

        try {
            System.out.println("Criando um contato, entre com as informações");
            String nome = lerInformacaoString(scan, "Entre com o nome do contato");
            String telefone = lerInformacaoString(scan, "Entre com o telefone ");
            String email = lerInformacaoString(scan, "Entre com o e-mail ");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }

    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = lerInformacaoString(scan, "Entre com nome do contato a ser pesquisado");

        try {
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }

        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerInformacaoString(Scanner scan, String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: consultar Contato ");
            System.out.println("2: adicionar contato ");
            System.out.println("3: sair ");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }

        }

        return opcao;
    }
}
