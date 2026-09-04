package exheranca;

import java.util.ArrayList;

public class Empresa {

    private Gerente gerente;
    private ArrayList<Projeto> projetos;

    public Empresa(Gerente gerente) {
        this.gerente = gerente;
        this.projetos = new ArrayList<>();
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}