package com.sistema;

import com.sistema.model.Cadeira.*;
import com.sistema.model.Fone.*;
import com.sistema.model.Mouse.*;
import com.sistema.model.Mousepad.*;
import com.sistema.model.Notebook.*;
import com.sistema.model.Teclado.*;
import com.sistema.model.Usuario.*;
import javax.persistence.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService(new UsuarioDAO());
        NotebookService notebookService = new NotebookService(new NotebookDAO());
        TecladoService tecladoService = new TecladoService(new TecladoDAO());
        MousepadService mousepadService = new MousepadService(new MousepadDAO());
        MouseService mouseService = new MouseService(new MouseDAO());
        FoneService foneService = new FoneService(new FoneDAO());
        CadeiraService cadeiraService = new CadeiraService(new CadeiraDAO());
        int opcao = -1;
        while (opcao != 8) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Usuário");
            System.out.println("2 - Cadeira");
            System.out.println("3 - Fone");
            System.out.println("4 - Mouse");
            System.out.println("5 - Mousepad");
            System.out.println("6 - Notebook");
            System.out.println("7 - Teclado");
            System.out.println("8 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\n--- Usuário ---");
                    System.out.println("1 - Criar");
                    System.out.println("2 - Buscar");
                    System.out.println("3 - Editar");
                    System.out.println("4 - Deletar");
                    System.out.print("Escolha: ");
                    int u = scanner.nextInt();
                    switch (u) {
                        case 1:
                            System.out.print("Nome:");
                            String nome = scanner.next();
                            System.out.print("Email:");
                            String email = scanner.next();
                            System.out.print("Senha:");
                            String senha = scanner.next();
                            UsuarioDto dto = new UsuarioDto(nome, email, senha);
                            var criado = usuarioService.criar(dto);
                            System.out.println("Criado: " + criado);
                            break;
                        case 2:
                            System.out.print("ID: ");
                            long id = scanner.nextLong();
                            System.out.println(usuarioService.buscar(id));
                            break;
                        case 3:
                            System.out.print("ID: ");
                            long idEd = scanner.nextLong();
                            System.out.print("Nome: ");
                            String nEd = scanner.next();
                            System.out.print("Email: ");
                            String eEd = scanner.next();
                            System.out.print("Senha: ");
                            String sEd = scanner.next();
                            UsuarioDto dtoEd = new UsuarioDto(nEd, eEd, sEd);
                            System.out.println(usuarioService.editar(idEd, dtoEd));
                            break;
                        case 4:
                            System.out.print("ID: ");
                            long idDel = scanner.nextLong();
                            usuarioService.deletar(idDel);
                            System.out.println("Deletado!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\n--- Cadeira ---");
                    System.out.println("1 - Criar");
                    System.out.println("2 - Buscar");
                    System.out.println("3 - Editar");
                    System.out.println("4 - Deletar");
                    System.out.print("Escolha: ");
                    int c = scanner.nextInt();
                    switch (c) {
                        case 1:
                            System.out.print("Nome:");
                            String nomeC = scanner.next();
                            System.out.print("Marca:");
                            String marcaC = scanner.next();
                            System.out.print("Altura:");
                            double altC = scanner.nextDouble();
                            CadeiraDto cdto = new CadeiraDto(nomeC, marcaC, altC);
                            System.out.println("Criado: " + cadeiraService.criar(cdto));
                            break;
                        case 2:
                            System.out.print("ID:");
                            long idCB = scanner.nextLong();
                            System.out.println(cadeiraService.buscar(idCB));
                            break;
                        case 3:
                            System.out.print("ID:");
                            long idCE = scanner.nextLong();
                            System.out.print("Nome:");
                            String nCE = scanner.next();
                            System.out.print("Marca:");
                            String mCE = scanner.next();
                            System.out.print("Altura:");
                            double aCE = scanner.nextDouble();
                            CadeiraDto cdtoE = new CadeiraDto(nCE, mCE, aCE);
                            System.out.println("Editado: " + cadeiraService.editar(idCE, cdtoE));
                            break;
                        case 4:
                            System.out.print("ID:");
                            long idCD = scanner.nextLong();
                            cadeiraService.deletar(idCD);
                            System.out.println("Deletado!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Fone ---");
                    System.out.println("1 - Criar");
                    System.out.println("2 - Buscar");
                    System.out.println("3 - Editar");
                    System.out.println("4 - Deletar");
                    System.out.print("Escolha: ");
                    int f = scanner.nextInt();
                    switch (f) {
                        case 1:
                            System.out.print("Nome: ");
                            String nf = scanner.next();
                            System.out.print("Marca: ");
                            String mf = scanner.next();
                            System.out.print("Tem microfone (true/false): ");
                            boolean mic = scanner.nextBoolean();
                            FoneDto fd = new FoneDto(nf, mf, mic);
                            System.out.println("Criado: " + foneService.criar(fd));
                            break;
                        case 2:
                            System.out.print("ID: ");
                            long idf = scanner.nextLong();
                            System.out.println(foneService.buscar(idf));
                            break;
                        case 3:
                            System.out.print("ID: ");
                            long idFe = scanner.nextLong();
                            System.out.print("Nome: ");
                            String nFe = scanner.next();
                            System.out.print("Marca: ");
                            String mFe = scanner.next();
                            System.out.print("Microfone: ");
                            boolean micE = scanner.nextBoolean();
                            FoneDto fdE = new FoneDto(nFe, mFe, micE);
                            System.out.println(foneService.editar(idFe, fdE));
                            break;
                        case 4:
                            System.out.print("ID: ");
                            long idFd = scanner.nextLong();
                            foneService.deletar(idFd);
                            System.out.println("Deletado!");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("\n--- Mouse ---");
                    System.out.println("1 - Criar");
                    System.out.println("2 - Buscar");
                    System.out.println("3 - Editar");
                    System.out.println("4 - Deletar");
                    System.out.print("Escolha: ");
                    int m = scanner.nextInt();
                    switch (m) {
                        case 1:
                            System.out.print("Nome: ");
                            String nm = scanner.next();
                            System.out.print("Marca: ");
                            String mm = scanner.next();
                            System.out.print("Cor: ");
                            String cm = scanner.next();
                            MouseDto md = new MouseDto(nm, mm, cm);
                            System.out.println(mouseService.criar(md));
                            break;
                        case 2:
                            System.out.print("ID: ");
                            long idm = scanner.nextLong();
                            System.out.println(mouseService.buscar(idm));
                            break;
                        case 3:
                            System.out.print("ID: ");
                            long idMe = scanner.nextLong();
                            System.out.print("Nome: ");
                            String nMe = scanner.next();
                            System.out.print("Marca: ");
                            String mMe = scanner.next();
                            System.out.print("Cor: ");
                            String cMe = scanner.next();
                            MouseDto mdE = new MouseDto(nMe, mMe, cMe);
                            System.out.println(mouseService.editar(idMe, mdE));
                            break;
                        case 4:
                            System.out.print("ID: ");
                            long idMd = scanner.nextLong();
                            mouseService.deletar(idMd);
                            System.out.println("Deletado!");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Mousepad ---");
                    System.out.println("1 - Criar");
                    System.out.println("2 - Buscar");
                    System.out.println("3 - Editar");
                    System.out.println("4 - Deletar");
                    System.out.print("Escolha: ");
                    int mp = scanner.nextInt();
                    switch (mp) {
                        case 1:
                            System.out.print("Nome: ");
                            String nmp = scanner.next();
                            System.out.print("Marca: ");
                            String mmp = scanner.next();
                            System.out.print("Altura: ");
                            double amp = scanner.nextDouble();
                            System.out.print("Comprimento: ");
                            double cmp = scanner.nextDouble();
                            MousepadDto mpd = new MousepadDto(nmp, mmp, amp, cmp);
                            System.out.println(mousepadService.criar(mpd));
                            break;
                        case 2:
                            System.out.print("ID: ");
                            long idmp = scanner.nextLong();
                            System.out.println(mousepadService.buscar(idmp));
                            break;
                        case 3:
                            System.out.print("ID: ");
                            long idMPE = scanner.nextLong();
                            System.out.print("Nome: ");
                            String nMPE = scanner.next();
                            System.out.print("Marca: ");
                            String mMPE = scanner.next();
                            System.out.print("Altura: ");
                            double aMPE = scanner.nextDouble();
                            System.out.print("Comprimento: ");
                            double cMPE = scanner.nextDouble();
                            MousepadDto mpdE = new MousepadDto(nMPE, mMPE, aMPE, cMPE);
                            System.out.println(mousepadService.editar(idMPE, mpdE));
                            break;
                        case 4:
                            System.out.print("ID: ");
                            long idMPD = scanner.nextLong();
                            mousepadService.deletar(idMPD);
                            System.out.println("Deletado!");
                    }
                    break;

                case 6:
                    System.out.println("\n--- Notebook ---");
                    System.out.println("1 - Criar");
                    System.out.println("2 - Buscar");
                    System.out.println("3 - Editar");
                    System.out.println("4 - Deletar");
                    System.out.print("Escolha: ");
                    int nt = scanner.nextInt();
                    switch (nt) {
                        case 1:
                            scanner.nextLine();
                            System.out.print("Nome: ");
                            String nn = scanner.nextLine();
                            System.out.print("Processador: ");
                            String pn = scanner.nextLine();
                            System.out.print("RAM: ");
                            String rn = scanner.nextLine();
                            System.out.print("Memória: ");
                            String mn = scanner.nextLine();
                            NotebookDto nd = new NotebookDto(nn, pn, rn, mn);
                            System.out.println(notebookService.criar(nd));
                            break;
                        case 2:
                            System.out.print("ID: ");
                            long idN = scanner.nextLong();
                            System.out.println(notebookService.buscar(idN));
                            break;
                        case 3:
                            scanner.nextLine();
                            System.out.print("ID: ");
                            long idNE = scanner.nextLong();
                            scanner.nextLine();
                            System.out.print("Nome: ");
                            String nNE = scanner.nextLine();
                            System.out.print("Processador: ");
                            String pNE = scanner.nextLine();
                            System.out.print("RAM: ");
                            String rNE = scanner.nextLine();
                            System.out.print("Memória: ");
                            String mNE = scanner.nextLine();
                            NotebookDto ndE = new NotebookDto(nNE, pNE, rNE, mNE);
                            System.out.println(notebookService.editar(idNE, ndE));
                            break;
                        case 4:
                            System.out.print("ID: ");
                            long idND = scanner.nextLong();
                            notebookService.deletar(idND);
                            System.out.println("Deletado!");
                    }
                    break;

                case 7:
                    System.out.println("\n--- Teclado ---");
                    System.out.println("1 - Criar");
                    System.out.println("2 - Buscar");
                    System.out.println("3 - Editar");
                    System.out.println("4 - Deletar");
                    System.out.print("Escolha: ");
                    int t = scanner.nextInt();
                    switch (t) {
                        case 1:
                            System.out.print("Nome: ");
                            String ntc = scanner.next();
                            System.out.print("Marca: ");
                            String mtc = scanner.next();
                            System.out.print("Tamanho: ");
                            String ttc = scanner.next();
                            TecladoDto td = new TecladoDto(ntc, mtc, ttc);
                            System.out.println(tecladoService.criar(td));
                            break;
                        case 2:
                            System.out.print("ID: ");
                            long idT = scanner.nextLong();
                            System.out.println(tecladoService.buscar(idT));
                            break;
                        case 3:
                            System.out.print("ID: ");
                            long idTE = scanner.nextLong();
                            System.out.print("Nome: ");
                            String nTE = scanner.next();
                            System.out.print("Marca: ");
                            String mTE = scanner.next();
                            System.out.print("Tamanho: ");
                            String tTE = scanner.next();
                            TecladoDto tdE = new TecladoDto(nTE, mTE, tTE);
                            System.out.println(tecladoService.editar(idTE, tdE));
                            break;
                        case 4:
                            System.out.print("ID: ");
                            long idTD = scanner.nextLong();
                            tecladoService.deletar(idTD);
                            System.out.println("Deletado!");
                    }
                    break;

                case 8:
                    System.out.println("\nPrograma encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
