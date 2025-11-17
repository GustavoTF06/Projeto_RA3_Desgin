package com.sistema.model.Teclado;

public class TecladoService {
    private final TecladoDAO tecladoDAO;


    public TecladoService(TecladoDAO tecladoDAO) {
        this.tecladoDAO = tecladoDAO;
    }
    public Teclado criar(TecladoDto dto) {
       Teclado teclado = new Teclado(dto.getNome(), dto.getMarca(), dto.getTamanho());
       tecladoDAO.salvar(teclado);
       return teclado;
    }
    public Teclado editar(Long id, TecladoDto dto){
        var teclado = tecladoDAO.buscar(id);
        teclado.setNome(dto.getNome());
        teclado.setMarca(dto.getMarca());
        teclado.setTamanho(dto.getTamanho());
        tecladoDAO.atualizar(teclado);
        return teclado;
    }
    public Teclado buscar(Long id){
        var teclado = tecladoDAO.buscar(id);
        return teclado;
    }
    public void deletar(Long id){
        tecladoDAO.deletar(id);
    }
}
