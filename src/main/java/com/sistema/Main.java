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
        while (opcao == 29){
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
                    System.out.println("digite o nome do usuario");
                    var nome = scanner.next();
                    System.out.println("digite o email do usuario");
                    var email = scanner.next();
                    System.out.println("digite a senha do usuario");
                    var senha = scanner.next();
                    UsuarioDto usuarioDto = new UsuarioDto(nome, email, senha);
                    var usuario = usuarioService.criar(usuarioDto);
                    System.out.println("usuario de email: " + usuario.getEmail() + " e id: "
                            + usuario.getId() + "criado com sucesso");
                    opcao = 0;
                    break;
                case 2:
                    System.out.println("digite o id do usuario");
                    var idUsuarioBuscado = scanner.nextLong();
                    var usuarioBuscado = usuarioService.buscar(idUsuarioBuscado);
                    System.out.println(usuarioBuscado);
                    opcao = 0;
                    break;
                case 3:
                    System.out.println("digite o id do usuario");
                    var idUsuarioEditar = scanner.nextLong();
                    System.out.println("digite o nome do usuario");
                    var nomeEditar = scanner.next();
                    System.out.println("digite o email do usuario");
                    var emailEditar = scanner.next();
                    System.out.println("digite a senha do usuario");
                    var senhaEditar = scanner.next();
                    UsuarioDto usuarioDtoEditar = new UsuarioDto(nomeEditar, emailEditar, senhaEditar);
                    var usuarioEditado = usuarioService.editar(idUsuarioEditar, usuarioDtoEditar);
                    System.out.println(usuarioEditado);
                    opcao = 0;
                    break;
                case 4:
                    System.out.println("digite o id do usuario para deletar");
                    var idUsuarioDeletar = scanner.nextLong();
                    usuarioService.deletar(idUsuarioDeletar);
                    System.out.println("Usuario deletado com sucesso");
                    opcao = 0;
                    break;

                case 9:
                    System.out.println("digite o nome do teclado");
                    var nomeTeclado = scanner.next();
                    System.out.println("digite a marca do teclado");
                    var marcaTeclado = scanner.next();
                    System.out.println("digite o tamanho do teclado");
                    var tamanhoTeclado = scanner.next();
                    TecladoDto tecladoDto = new TecladoDto(nomeTeclado,marcaTeclado,tamanhoTeclado);
                    var teclado = tecladoService.criar(tecladoDto);
                    System.out.println(teclado);
                    opcao = 0;
                    break;
                case 10:
                    System.out.println("digite o id do teclado");
                    var idTecladoBusccar = scanner.nextLong();
                    var tecladoBuscado = tecladoService.buscar(idTecladoBusccar);
                    System.out.println(tecladoBuscado);
                    opcao=0;
                    break;
                case 11:
                    System.out.println("digite o id do teclado ");
                    var idTecladoEditar = scanner.nextLong();
                    System.out.println("digite o nome do teclado");
                    var nomeTecladoEditar = scanner.next();
                    System.out.println("digite a marca do teclado");
                    var marcaTecladoEditar = scanner.next();
                    System.out.println("digite o tamanho do teclado");
                    var tamanhoTecladoEditar = scanner.next();
                    TecladoDto tecladoDtoEditar = new TecladoDto(nomeTecladoEditar,marcaTecladoEditar,tamanhoTecladoEditar);
                    var tecladoEditado = tecladoService.editar(idTecladoEditar,tecladoDtoEditar);
                    System.out.println(tecladoEditado);
                    opcao=0;
                    break;

                case 12:
                    System.out.println("digite o id od teclado para deletar");
                    var tecladoDeletar = scanner.nextLong();
                    tecladoService.deletar(tecladoDeletar);
                    System.out.println("teclado deletado com sucesso");
                    opcao=0;
                    break;


            }
        }
        System.out.println("\nPrograma encerrado.");
    }
}
