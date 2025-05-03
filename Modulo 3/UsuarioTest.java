import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    Usuario usuario = new Usuario("Gabriel", 21);
    Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
    Emprestimo emprestimo = new Emprestimo(livro, usuario, new Date(), new Date());

    @Test
    void testGetIdade() {
        assertEquals(21, usuario.getIdade());
    }

    @Test
    void testGetHistoricoEmprestimo() {
        assertEquals(1, usuario.getHistoricoEmprestimo().size());
        assertTrue(usuario.getHistoricoEmprestimo().contains(emprestimo));
    }

    @Test
    void testAdicionarEmprestimo() {
        int tamanhoInicial = usuario.getHistoricoEmprestimo().size();
        Livro novoLivro = new Livro("Python Basics", new Autor("Guido", "Holandês"), "Tecnologia", true);
        Emprestimo novoEmprestimo = new Emprestimo(novoLivro, usuario, new Date(), new Date());
        
        assertEquals(tamanhoInicial + 1, usuario.getHistoricoEmprestimo().size());
        assertTrue(usuario.getHistoricoEmprestimo().contains(novoEmprestimo));
    }
}