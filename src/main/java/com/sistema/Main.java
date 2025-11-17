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

                case 1:
                    System.out.println("Digite o nome do usuario");
                    var nome = scanner.next();
                    System.out.println("Digite o email do usuario");
                    var email = scanner.next();
                    System.out.println("Digite a senha do usuario");
                    var senha = scanner.next();
                    UsuarioDto usuarioDto = new UsuarioDto(nome, email, senha);
                    var usuario = usuarioService.criar(usuarioDto);
                    System.out.println("Usuario de email: " + usuario.getEmail() + " e id: "
                            + usuario.getId() + "criado com sucesso");
                    opcao = 0;
                    break;

                case 2:
                    System.out.println("Digite o id do usuario");
                    var idUsuarioBuscado = scanner.nextLong();
                    var usuarioBuscado = usuarioService.buscar(idUsuarioBuscado);
                    System.out.println(usuarioBuscado);
                    opcao = 0;
                    break;

                case 3:
                    System.out.println("Digite o id do usuario");
                    var idUsuarioEditar = scanner.nextLong();
                    System.out.println("Digite o nome do usuario");
                    var nomeEditar = scanner.next();
                    System.out.println("Digite o email do usuario");
                    var emailEditar = scanner.next();
                    System.out.println("Digite a senha do usuario");
                    var senhaEditar = scanner.next();
                    UsuarioDto usuarioDtoEditar = new UsuarioDto(nomeEditar, emailEditar, senhaEditar);
                    var usuarioEditado = usuarioService.editar(idUsuarioEditar, usuarioDtoEditar);
                    System.out.println(usuarioEditado);
                    opcao = 0;
                    break;

                case 4:
                    System.out.println("Digite o id do usuario para deletar");
                    var idUsuarioDeletar = scanner.nextLong();
                    usuarioService.deletar(idUsuarioDeletar);
                    System.out.println("Usuario deletado com sucesso");
                    opcao = 0;
                    break;

                case 5:
                    scanner.nextLine();
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
                    scanner.nextLine();
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
                    System.out.println("Notebook deletado.");
                    opcao = 0;
                    break;

                case 9:
                    System.out.println("Digite o nome do teclado");
                    var nomeTeclado = scanner.next();
                    System.out.println("Digite a marca do teclado");
                    var marcaTeclado = scanner.next();
                    System.out.println("Digite o tamanho do teclado");
                    var tamanhoTeclado = scanner.next();
                    TecladoDto tecladoDto = new TecladoDto(nomeTeclado,marcaTeclado,tamanhoTeclado);
                    var teclado = tecladoService.criar(tecladoDto);
                    System.out.println(teclado);
                    opcao = 0;
                    break;

                case 10:
                    System.out.println("Digite o id do teclado");
                    var idTecladoBusccar = scanner.nextLong();
                    var tecladoBuscado = tecladoService.buscar(idTecladoBusccar);
                    System.out.println(tecladoBuscado);
                    opcao=0;
                    break;

                case 11:
                    System.out.println("Digite o id do teclado ");
                    var idTecladoEditar = scanner.nextLong();
                    System.out.println("Digite o nome do teclado");
                    var nomeTecladoEditar = scanner.next();
                    System.out.println("Digite a marca do teclado");
                    var marcaTecladoEditar = scanner.next();
                    System.out.println("Digite o tamanho do teclado");
                    var tamanhoTecladoEditar = scanner.next();
                    TecladoDto tecladoDtoEditar = new TecladoDto(nomeTecladoEditar,marcaTecladoEditar,tamanhoTecladoEditar);
                    var tecladoEditado = tecladoService.editar(idTecladoEditar,tecladoDtoEditar);
                    System.out.println(tecladoEditado);
                    opcao=0;
                    break;

                case 12:
                    System.out.println("Digite o id od teclado para deletar");
                    var tecladoDeletar = scanner.nextLong();
                    tecladoService.deletar(tecladoDeletar);
                    System.out.println("Teclado deletado com sucesso");
                    opcao=0;
                    break;

                case 17:
                    System.out.println("Digite o nome do mouse");
                    String nomeMouse = scanner.next();
                    System.out.println("Digite a marca do mouse");
                    String marcaMouse = scanner.next();
                    System.out.println("Digite a cor do mouse");
                    String corMouse = scanner.next();
                    MouseDto mouseDtoCriar = new MouseDto(nomeMouse, marcaMouse, corMouse);
                    var mouseCriado = mouseService.criar(mouseDtoCriar);
                    System.out.println("Mouse criado com sucesso: " + mouseCriado);
                    opcao = 0;
                    break;

                case 18:
                    System.out.println("Digite o id do mouse");
                    long idMouseEditar = scanner.nextLong();
                    System.out.println("Digite o nome do mouse");
                    String nomeMouseEditar = scanner.next();
                    System.out.println("Digite a marca do mouse");
                    String marcaMouseEditar = scanner.next();
                    System.out.println("Digite a cor do mouse");
                    String corMouseEditar = scanner.next();
                    MouseDto mouseDtoEditar = new MouseDto(nomeMouseEditar, marcaMouseEditar, corMouseEditar);
                    var mouseEditado = mouseService.editar(idMouseEditar, mouseDtoEditar);
                    System.out.println("Mouse editado com sucesso: " + mouseEditado);
                    opcao = 0;
                    break;

                case 19:
                    System.out.println("Digite o id do mouse");
                    long idMouseBuscar = scanner.nextLong();
                    var mouseBuscado = mouseService.buscar(idMouseBuscar);
                    System.out.println("Encontrado: " + mouseBuscado);
                    opcao = 0;
                    break;

                case 20:
                    System.out.println("Digite o id do mouse para deletar");
                    long idMouseDeletar = scanner.nextLong();
                    mouseService.deletar(idMouseDeletar);
                    System.out.println("Mouse deletado com sucesso");
                    opcao = 0;
                    break;

                case 25:
                    System.out.println("Digite o nome da cadeira");
                    String nomeCadeira = scanner.next();
                    System.out.println("Digite a marca da cadeira");
                    String marcaCadeira = scanner.next();
                    System.out.println("Digite a altura da cadeira");
                    double alturaCadeira = scanner.nextDouble();
                    CadeiraDto cadeiraDtoCriar = new CadeiraDto(nomeCadeira, marcaCadeira, alturaCadeira);
                    var cadeiraCriada = cadeiraService.criar(cadeiraDtoCriar);
                    System.out.println("Cadeira criada: " + cadeiraCriada);
                    opcao = 0;
                    break;

                case 26:
                    System.out.println("Digite o id da cadeira");
                    long idCadeiraBuscar = scanner.nextLong();
                    var cadeiraBuscada = cadeiraService.buscar(idCadeiraBuscar);
                    System.out.println("Encontrada: " + cadeiraBuscada);
                    opcao = 0;
                    break;

                case 27:
                    System.out.println("Digite o id da cadeira para deletar");
                    long idCadeiraDeletar = scanner.nextLong();
                    cadeiraService.deletar(idCadeiraDeletar);
                    System.out.println("Cadeira deletada com sucesso!");
                    opcao = 0;
                    break;

                case 28:
                    System.out.println("Digite o id da cadeira");
                    long idCadeiraEditar = scanner.nextLong();
                    System.out.println("Digite o nome da cadeira");
                    String nomeCadeiraEditar = scanner.next();
                    System.out.println("Digite a marca da cadeira");
                    String marcaCadeiraEditar = scanner.next();
                    System.out.println("Digite a altura da cadeira");
                    double alturaCadeiraEditar = scanner.nextDouble();
                    CadeiraDto cadeiraDtoEditar =
                            new CadeiraDto(nomeCadeiraEditar, marcaCadeiraEditar, alturaCadeiraEditar);
                    var cadeiraEditada = cadeiraService.editar(idCadeiraEditar, cadeiraDtoEditar);
                    System.out.println("Editado: " + cadeiraEditada);
                    opcao = 0;
                    break;
            }
        }
        System.out.println("\nPrograma encerrado.");
    }
}
