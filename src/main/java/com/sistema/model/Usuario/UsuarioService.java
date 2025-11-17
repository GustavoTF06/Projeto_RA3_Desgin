package com.sistema.model.Usuario;

public class UsuarioService {
    private final UsuarioDAO usuarioDAO;

    public UsuarioService(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
    public Usuario criar(UsuarioDto usuarioDto){
        Usuario usuario = new Usuario(usuarioDto);
        usuarioDAO.salvar(usuario);
        return  usuario;
    }
    public Usuario editar(Long id,UsuarioDto usuarioAtualizar){
        Usuario usuario = usuarioDAO.buscar(id);
        usuario.setEmail(usuarioAtualizar.getEmail());
        usuario.setNome(usuarioAtualizar.getNome());
        usuario.setSenha(usuarioAtualizar.getSenha());
        usuarioDAO.atualizar(usuario);
        return usuario;
    }
    public void deletar(Long id){
        usuarioDAO.deletar(id);

    }
    public Usuario buscar(Long id){
        Usuario usuario = usuarioDAO.buscar(id);
        return  usuario;
    }
}
