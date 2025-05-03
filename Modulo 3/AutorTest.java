import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {
    Autor autor = new Autor("Jess", "Brasileira");
    Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
    Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

    @Test
    void testGetNacionalidade() {
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    void testGetObrasPublicadas() {
        assertEquals(2, autor.getObrasPublicadas().size());
        assertTrue(autor.getObrasPublicadas().contains(livro1));
        assertTrue(autor.getObrasPublicadas().contains(livro2));
    }

    @Test
    void testGetObrasPublicadasPorGenero() {
        assertEquals(2, autor.getObrasPublicadasPorGenero("tecnologia").size());
        assertEquals(0, autor.getObrasPublicadasPorGenero("ficção").size());
    }
}