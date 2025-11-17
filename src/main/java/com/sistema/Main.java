package com.sistema;

import com.sistema.model.Usuario.*;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
       UsuarioService usuarioService = new UsuarioService(usuarioDAO);
       UsuarioDto usuarioDto = new UsuarioDto("test","test1@test.com","test");
       var usuario = usuarioService.criar(usuarioDto);
        System.out.println(usuario.getId());
        System.out.println(usuario.getNome());
        UsuarioDto usuarioAtualizar = new UsuarioDto("test 2","test@tes1`.com","test");
        var usuarioAtualizado = usuarioService.editar(usuario.getId(),usuarioAtualizar);
        System.out.println(usuarioAtualizado.getId());
        System.out.println(usuarioAtualizado.getNome());

    }
}
