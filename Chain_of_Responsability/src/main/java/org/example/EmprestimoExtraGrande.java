package org.example;

public class EmprestimoExtraGrande implements TipoEmprestimo{
    private static EmprestimoExtraGrande emprestimoExtraGrande = new EmprestimoExtraGrande();

    private EmprestimoExtraGrande() {}

    public static EmprestimoExtraGrande getEmprestimoExtraGrande() {
        return emprestimoExtraGrande;
    }
}
