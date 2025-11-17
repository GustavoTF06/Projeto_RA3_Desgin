package com.sistema.model.Mouse;

public class MouseService {

    private final MouseDAO mouseDAO;

    public MouseService(MouseDAO mouseDAO) {
        this.mouseDAO = mouseDAO;
    }

    public Mouse criar(MouseDto dto) {
        Mouse mouse = new Mouse(dto);
        mouseDAO.salvar(mouse);
        return mouse;
    }

    public Mouse editar(Long id, MouseDto mouseDto) {
        Mouse mouse = mouseDAO.buscar(id);

        mouse.setNome(mouseDto.getNome());
        mouse.setMarca(mouseDto.getMarca());
        mouse.setCor(mouseDto.getCor());

        mouseDAO.atualizar(mouse);
        return mouse;
    }

    public void deletar(Long id) {
        mouseDAO.deletar(id);
    }

    public Mouse buscar(Long id) {
        return mouseDAO.buscar(id);
    }
}
