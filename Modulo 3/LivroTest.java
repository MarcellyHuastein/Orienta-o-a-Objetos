import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    Autor autor = new Autor("Jess", "Brasileira");
    Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
    Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

    @Test
    void testGetTitulo() {
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals("Java Avançado", livro2.getTitulo());
    }

    @Test
    void testGetAutor() {
        assertEquals(autor, livro1.getAutor());
        assertEquals(autor, livro2.getAutor());
    }

    @Test
    void testGetGenero() {
        assertEquals("tecnologia", livro1.getGenero());
        assertEquals("tecnologia", livro2.getGenero());
    }

    @Test
    void testIsDisponivel() {
        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }

    @Test
    void testValidarDisponibilidade() {
        assertDoesNotThrow(() -> livro1.validarDisponibilidade());
        assertThrows(IllegalStateException.class, () -> livro2.validarDisponibilidade());
    }

    @Test
    void testSetDisponivel() {
        livro1.setDisponivel(false);
        assertFalse(livro1.isDisponivel());
        
        livro2.setDisponivel(true);
        assertTrue(livro2.isDisponivel());
    }
}