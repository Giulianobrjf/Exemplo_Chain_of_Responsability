package org.example;

public class EmprestimoGrande implements TipoEmprestimo{
    private static EmprestimoGrande emprestimoGrande = new EmprestimoGrande();

    private EmprestimoGrande() {}

    public static EmprestimoGrande getEmprestimoGrande() {
        return emprestimoGrande;
    }
}
