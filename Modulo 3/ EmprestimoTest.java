import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {
    Date dataRetirada = new Date();
    Date dataDevolucao = new Date();
    Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
    Usuario usuario = new Usuario("Gabriel", 21);
    Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

    @Test
    void testGetDataRetirada() {
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }

    @Test
    void testGetDataDevolucao() {
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }

    @Test
    void testGetLivros() {
        assertEquals(1, emprestimo.getLivros().size());
        assertTrue(emprestimo.getLivros().contains(livro));
    }

    @Test
    void testGetUsuario() {
        assertEquals(usuario, emprestimo.getUsuario());
    }

    @Test
    void testLivroIndisponivelAposEmprestimo() {
        assertFalse(livro.isDisponivel());
    }

    @Test
    void testEmprestimoNoHistoricoUsuario() {
        assertTrue(usuario.getHistoricoEmprestimo().contains(emprestimo));
    }
}