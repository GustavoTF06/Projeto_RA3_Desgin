package com.sistema;

import com.sistema.model.Cadeira.Cadeira;
import com.sistema.model.Cadeira.CadeiraDAO;
import com.sistema.model.Cadeira.CadeiraService;
import com.sistema.model.Fone.FoneDAO;
import com.sistema.model.Fone.FoneService;
import com.sistema.model.Mouse.MouseDAO;
import com.sistema.model.Mouse.MouseService;
import com.sistema.model.Mousepad.Mousepad;
import com.sistema.model.Mousepad.MousepadDAO;
import com.sistema.model.Mousepad.MousepadService;
import com.sistema.model.Notebook.NotebookDAO;
import com.sistema.model.Notebook.NotebookService;
import com.sistema.model.Teclado.TecladoDAO;
import com.sistema.model.Teclado.TecladoService;
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
        while (opcao != -1){
            switch (opcao){
                case 0:
                    System.out.println("1-criar usuario");
                    System.out.println("2-buscar usuario");
                    System.out.println("3-editar usuario");
                    System.out.println("4-deletar usuario");
                    System.out.println("5-criar notebook");
                    System.out.println("6-buscar notebook");
                    System.out.println("7-editar notebook");
                    System.out.println("8-deletar notebook");
                    System.out.println("9-criar teclado");
                    System.out.println("10-buscar teclado");
                    System.out.println("11-editar teclado");
                    System.out.println("12-deletar teclado");
                    System.out.println("13-criar Mousepad ");
                    System.out.println("14-editar Mousepad ");
                    System.out.println("15-buscar Mousepad ");
                    System.out.println("16-deletar Mousepad ");
                    System.out.println("17-criar Mouse ");
                    System.out.println("18-editar Mouse ");
                    System.out.println("19-buscar Mouse ");
                    System.out.println("20-deletar Mouse ");
                    System.out.println("21-criar Fone ");
                    System.out.println("22-buscar Fone ");
                    System.out.println("23-editar Fone ");
                    System.out.println("24-deletar Fone ");
                    System.out.println("25-criar Cadeira ");
                    System.out.println("26-buscar Cadeira ");
                    System.out.println("27-deletar Cadeira ");
                    System.out.println("28-editar Cadeira ");
                    opcao = scanner.nextInt();
                    break;

                case 1:
                    System.out.println("digite o nome do usuario");
                    var nome = scanner.next();
                    System.out.println("digite o email do usuario");
                    var email = scanner.next();
                    System.out.println("digite a senha do usuario");
                    var senha = scanner.next();
                    UsuarioDto usuarioDto = new UsuarioDto(nome,email,senha);
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
                    var emailEditar  = scanner.next();
                    System.out.println("digite a senha do usuario");
                    var senhaEditar  = scanner.next();
                    UsuarioDto usuarioDtoEditar  = new UsuarioDto(nomeEditar ,emailEditar ,senhaEditar );
                    var usuarioEditado = usuarioService.editar(idUsuarioEditar,usuarioDtoEditar);
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
            }
        }
    }
}
