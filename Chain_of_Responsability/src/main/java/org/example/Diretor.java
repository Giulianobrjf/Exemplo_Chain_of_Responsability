package org.example;

public class Diretor extends Responsavel {

    public Diretor(Responsavel superior) {
        listaEmprestimos.add(EmprestimoGrande.getEmprestimoGrande());
    }

    @Override
    public String getDescricaoCargo() {
        return "Diretor Financeiro";
    }
}
