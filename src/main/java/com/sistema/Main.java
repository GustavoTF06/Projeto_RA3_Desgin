package com.sistema;

import com.sistema.model.Cadeira.*;
import com.sistema.model.Fone.*;
import com.sistema.model.Mouse.*;
import com.sistema.model.Mousepad.*;
import com.sistema.model.Notebook.*;
import com.sistema.model.Teclado.*;
import com.sistema.model.Usuario.*;

import javax.persistence.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioService usuarioService = new UsuarioService(usuarioDAO);
        NotebookDAO notebookDAO = new NotebookDAO();
        NotebookService notebookService= new NotebookService(notebookDAO);
        TecladoDAO tecladoDAO = new TecladoDAO();
        TecladoService tecladoService = new TecladoService(tecladoDAO);
        MousepadDAO mousepadDAO = new MousepadDAO();
        MousepadService mousepadService = new MousepadService(mousepadDAO);
        MouseDAO mouseDAO = new MouseDAO();
        MouseService mouseService = new MouseService(mouseDAO);
        FoneDAO foneDAO = new FoneDAO();
        FoneService foneService = new FoneService(foneDAO);
        CadeiraDAO cadeiraDAO = new CadeiraDAO();
        CadeiraService cadeiraService = new CadeiraService(cadeiraDAO);
        int opcao = 0 ;
        while (opcao != 29){
            switch (opcao){
                case 0:
                    System.out.println("\n=====================");
                    System.out.println("1- Criar Usuário");
                    System.out.println("2- Buscar Usuário");
                    System.out.println("3- Editar Usuário");
                    System.out.println("4- Deletar Usuário");
                    System.out.println("5- Criar Notebook");
                    System.out.println("6- Buscar Notebook");
                    System.out.println("7- Editar Notebook");
                    System.out.println("8- Deletar Notebook");
                    System.out.println("9- Criar Teclado");
                    System.out.println("10- Buscar Teclado");
                    System.out.println("11- Editar Teclado");
                    System.out.println("12- Deletar Teclado");
                    System.out.println("13- Criar Mousepad");
                    System.out.println("14- Editar Mousepad");
                    System.out.println("15- Buscar Mousepad");
                    System.out.println("16- Deletar Mousepad");
                    System.out.println("17- Criar Mouse");
                    System.out.println("18- Editar Mouse");
                    System.out.println("19- Buscar Mouse");
                    System.out.println("20- Deletar Mouse");
                    System.out.println("21- Criar Fone");
                    System.out.println("22- Buscar Fone");
                    System.out.println("23- Editar Fone");
                    System.out.println("24- Deletar Fone");
                    System.out.println("25- Criar Cadeira");
                    System.out.println("26- Buscar Cadeira");
                    System.out.println("27- Deletar Cadeira");
                    System.out.println("28- Editar Cadeira");
                    System.out.println("29 - Sair");
                    System.out.print("Escolha: ");
                    opcao = scanner.nextInt();
                    break;

                case 5:
                    scanner.nextLine();
                    System.out.println("\n==== Criar Notebook ====");
                    System.out.print("Nome: ");
                    String nomeNotebook = scanner.nextLine();
                    System.out.print("Processador: ");
                    String processadorNotebook = scanner.nextLine();
                    System.out.print("Memória RAM: ");
                    String memoriaRamNotebook = scanner.nextLine();
                    System.out.print("Memória interna: ");
                    String memoriaNotebook = scanner.nextLine();
                    NotebookDto notebookDto = new NotebookDto(
                            nomeNotebook,
                            processadorNotebook,
                            memoriaRamNotebook,
                            memoriaNotebook
                    );
                    Notebook notebookCriado = notebookService.criar(notebookDto);
                    System.out.println("Notebook criado com ID: " + notebookCriado.getId());
                    opcao = 0;
                    break;

                case 6:
                    System.out.println("\n==== Buscar Notebook ====");
                    System.out.print("ID: ");
                    Long idBuscarNotebook = scanner.nextLong();
                    Notebook notebookEncontrado = notebookService.buscar(idBuscarNotebook);
                    if (notebookEncontrado != null) {
                        System.out.println("Encontrado: " + notebookEncontrado);
                    } else {
                        System.out.println("Notebook não encontrado.");
                    }
                    opcao = 0;
                    break;

                case 7:
                    System.out.println("\n==== Editar Notebook ====");
                    System.out.print("ID do Notebook: ");
                    Long idEditarNotebook = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String nomeNovo = scanner.nextLine();
                    System.out.print("Novo processador: ");
                    String processadorNovo = scanner.nextLine();
                    System.out.print("Nova memória RAM: ");
                    String memoriaRamNova = scanner.nextLine();
                    System.out.print("Nova memória: ");
                    String memoriaNova = scanner.nextLine();
                    NotebookDto notebookAtualizar = new NotebookDto(
                            nomeNovo,
                            processadorNovo,
                            memoriaRamNova,
                            memoriaNova
                    );
                    Notebook notebookEditado = notebookService.editar(idEditarNotebook, notebookAtualizar);
                    System.out.println("Notebook atualizado: " + notebookEditado);
                    opcao = 0;
                    break;

                case 8:
                    System.out.println("\n==== Deletar Notebook ====");
                    System.out.print("ID: ");
                    Long idDeletarNotebook = scanner.nextLong();
                    notebookService.deletar(idDeletarNotebook);
                    opcao = 0;
                    break;
            }
        }
        System.out.println("\nPrograma encerrado.");
    }
}
