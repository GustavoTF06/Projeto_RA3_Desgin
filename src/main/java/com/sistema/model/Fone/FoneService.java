package com.sistema.model.Fone;

public class FoneService {

    private final FoneDAO foneDAO;

    public FoneService(FoneDAO foneDAO) {
        this.foneDAO = foneDAO;
    }

    public Fone criar(FoneDto dto) {
        Fone fone = new Fone(dto);
        foneDAO.salvar(fone);
        return fone;
    }

    public Fone editar(Long id, FoneDto foneAtualizar) {
        Fone fone = foneDAO.buscar(id);

        fone.setNome(foneAtualizar.getNome());
        fone.setMarca(foneAtualizar.getMarca());
        fone.setMicrofone(foneAtualizar.isMicrofone());

        foneDAO.atualizar(fone);
        return fone;
    }

    public void deletar(Long id) {
        foneDAO.deletar(id);
    }

    public Fone buscar(Long id) {
        return foneDAO.buscar(id);
    }
}
