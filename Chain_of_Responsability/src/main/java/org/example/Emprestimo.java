package org.example;

public class Emprestimo {
    private TipoEmprestimo tipoEmprestimo;

    public Emprestimo(TipoEmprestimo tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }

    public TipoEmprestimo getTipoEmprestimo() {
        return tipoEmprestimo;
    }

    public void setTipoEmprestimo( TipoEmprestimo TipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }

}

