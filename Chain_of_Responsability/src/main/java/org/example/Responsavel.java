package org.example;
import java.util.ArrayList;

public abstract class Responsavel {

    protected ArrayList<TipoEmprestimo> listaEmprestimos = new ArrayList<>();
    private Responsavel responsavelSuperior;

    public Responsavel getResponsavelSuperior() {
        return responsavelSuperior;
    }

    public void setResponsavelSuperior(Responsavel responsavelSuperior) {
        this.responsavelSuperior = responsavelSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarEmprestimo(Emprestimo emprestimo) {
        if (listaEmprestimos.contains(emprestimo.getTipoEmprestimo())) {
            return getDescricaoCargo();
        } else {
            if (responsavelSuperior != null) {
                return responsavelSuperior.aprovarEmprestimo(emprestimo);
            } else {
                return "Emprestimo nao aprovado";
            }
        }
    }
}
