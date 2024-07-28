package org.example;
public class Gerente extends Responsavel {

    public Gerente(Responsavel superior) {
        listaEmprestimos.add(EmprestimoMedio.getEmprestimoMedio());
        setResponsavelSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Gerente";
    }
}
