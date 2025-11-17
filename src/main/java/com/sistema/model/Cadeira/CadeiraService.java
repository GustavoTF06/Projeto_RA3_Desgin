package com.sistema.model.Cadeira;

public class CadeiraService {

    private final CadeiraDAO cadeiraDAO;

    public CadeiraService(CadeiraDAO cadeiraDAO) {
        this.cadeiraDAO = cadeiraDAO;
    }

    public Cadeira criar(CadeiraDto dto) {
        Cadeira cadeira = new Cadeira(dto);
        cadeiraDAO.salvar(cadeira);
        return cadeira;
    }

    public Cadeira editar(Long id, CadeiraDto dto) {
        Cadeira cadeira = cadeiraDAO.buscar(id);

        if (cadeira == null) {
            throw new IllegalArgumentException("Cadeira não encontrada para o ID: " + id);
        }

        cadeira.setNome(dto.getNome());
        cadeira.setMarca(dto.getMarca());
        cadeira.setAltura(dto.getAltura());

        cadeiraDAO.atualizar(cadeira);
        return cadeira;
    }

    public void deletar(Long id) {
        cadeiraDAO.deletar(id);
    }

    public Cadeira buscar(Long id) {
        return cadeiraDAO.buscar(id);
    }
}
