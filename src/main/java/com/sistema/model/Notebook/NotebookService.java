package com.sistema.model.Notebook;

public class NotebookService {
    private final NotebookDAO notebookDAO ;

    public NotebookService(NotebookDAO notebookDAO) {
        this.notebookDAO = notebookDAO;
    }
    public Notebook criar(NotebookDto dto) {
        Notebook notebook = new Notebook(dto.getNome(), dto.getProcessor(), dto.getMemoriaRam(), dto.getMemoria());
        notebookDAO.salvar(notebook);
        return notebook;
    }
    public Notebook editar(Long id, NotebookDto dto){
        var notebook = notebookDAO.buscarPorId(id);
        notebook.setNome(dto.getNome());
        notebook.setMemoria(dto.getMemoria());
        notebook.setProcessador(dto.getProcessor());
        notebook.setMemoriaRam(dto.getMemoriaRam());
        notebookDAO.atualizar(notebook);
        return notebook;
    }
    public Notebook buscar(Long id){
        var notebook = notebookDAO.buscarPorId(id);
        return notebook;
    }
    public void deletar(Long id){
        notebookDAO.deletar(id);
    }
}
