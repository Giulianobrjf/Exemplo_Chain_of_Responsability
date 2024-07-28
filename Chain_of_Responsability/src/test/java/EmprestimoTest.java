import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmprestimoTest {


        SistemaAutomatico sistemaAutomatico;
        Gerente gerente;
        Diretor diretor;

        @BeforeEach
        void setUp() {
            diretor = new Diretor(null);
            gerente = new Gerente(diretor);
            sistemaAutomatico = new SistemaAutomatico(gerente);
        }

        @Test
        void deveRetornarSistemaAutomaticoParaAprovacaoEmprestimoPequeno() {
            assertEquals("Sistema Automatico", sistemaAutomatico.aprovarEmprestimo(new Emprestimo(EmprestimoPequeno.getEmprestimoPequeno())));
        }

        @Test
        void deveRetornarGerenteParaAprovacaoEmprestimoMedio() {
            assertEquals("Gerente", sistemaAutomatico.aprovarEmprestimo(new Emprestimo(EmprestimoMedio.getEmprestimoMedio())));
        }

        @Test
        void deveRetornarDiretorParaAprovacaoEmprestimoGrande() {
            assertEquals("Diretor Financeiro", sistemaAutomatico.aprovarEmprestimo(new Emprestimo(EmprestimoGrande.getEmprestimoGrande())));
        }


        @Test
        void deveRetornarSemResponsavelParaAprovacaoEmprestimoExtraGrande() {
            assertEquals("Emprestimo nao aprovado", sistemaAutomatico.aprovarEmprestimo(new Emprestimo(EmprestimoExtraGrande.getEmprestimoExtraGrande())));
        }

    }

