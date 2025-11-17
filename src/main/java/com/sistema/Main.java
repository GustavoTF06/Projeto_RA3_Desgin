package com.sistema;

import com.sistema.model.Usuario.*;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
       UsuarioService usuarioService = new UsuarioService(usuarioDAO);
       UsuarioDto usuarioDto = new UsuarioDto("test","test10uu-9u9-@gmail.com","test");
       var usuario = usuarioService.criar(usuarioDto);
        System.out.println(usuario.getId());
        System.out.println(usuario.getNome());
        UsuarioDto usuarioAtualizar = new UsuarioDto("test 2","test@gmail.com","test");
        var usuarioAtualizado = usuarioService.editar(usuario.getId(),usuarioAtualizar);
        System.out.println(usuarioAtualizado.getId());
        System.out.println(usuarioAtualizado.getNome());
        usuarioService.deletar(4l);
        var usuariobuscado = usuarioService.buscar(2l);
        System.out.println(usuariobuscado.getNome());


    }
}
