package com.sistema.model.Mousepad;

public class MousepadService {
    private final MousepadDAO mousepadDAO ;

    public MousepadService(MousepadDAO mousepadDAO) {
        this.mousepadDAO = mousepadDAO;
    }
    public Mousepad criar(MousepadDto dto){
        Mousepad mousepad = new Mousepad(dto.getNome(), dto.getMarca(), dto.getAltura(), dto.getComprimento());
        mousepadDAO.salvar(mousepad);
        return mousepad;
    }
    public Mousepad editar(Long id,MousepadDto dto){
        var mousepad = mousepadDAO.buscar(id);
        mousepad.setNome(dto.getNome());
        mousepad.setMarca(dto.getMarca());
        mousepad.setAltura(dto.getAltura());
        mousepad.setComprimento(mousepad.getComprimento());
        mousepadDAO.atualizar(mousepad);
        return mousepad;
    }
    public Mousepad buscar(Long id){
        var mousepad = mousepadDAO.buscar(id);
        return mousepad;
    }
    public void deletar(Long id){
        mousepadDAO.deletar(id);
    }

}
