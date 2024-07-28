package org.example;



public class SistemaAutomatico extends Responsavel {

    public SistemaAutomatico(Responsavel superior) {
        listaEmprestimos.add(EmprestimoPequeno.getEmprestimoPequeno());
        setResponsavelSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Sistema Automatico";
    }
}
