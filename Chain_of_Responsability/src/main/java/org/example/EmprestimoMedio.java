package org.example;

public class EmprestimoMedio implements TipoEmprestimo{
    private static EmprestimoMedio emprestimoMedio = new EmprestimoMedio();

    private EmprestimoMedio() {}

    public static EmprestimoMedio getEmprestimoMedio() {
        return emprestimoMedio;
    }
}
