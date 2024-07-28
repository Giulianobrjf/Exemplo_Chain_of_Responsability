package org.example;


public class EmprestimoPequeno implements TipoEmprestimo {

    private static EmprestimoPequeno emprestimoPequeno = new EmprestimoPequeno();

    private EmprestimoPequeno() {}

    public static EmprestimoPequeno getEmprestimoPequeno() {
        return emprestimoPequeno;
    }
}
