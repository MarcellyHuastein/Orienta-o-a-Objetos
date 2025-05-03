import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArtigoTest {
    Autor autor = new Autor("Alan Turing", "Inglês", false);
    Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

    @Test
    void testGetTitulo() {
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
    }

    @Test
    void testGetAutor() {
        assertEquals(autor, artigo.getAutor());
    }

    @Test
    void testGetGenero() {
        assertEquals("tecnologia", artigo.getGenero());
    }

    @Test
    void testIsPublicado() {
        assertTrue(artigo.isPublicado());
    }

    @Test
    void testSetPublicado() {
        artigo.setPublicado(false);
        assertFalse(artigo.isPublicado());
        artigo.setPublicado(true);
        assertTrue(artigo.isPublicado());
    }

    @Test
    void testRelacionamentoAutor() {
        assertEquals("Alan Turing", artigo.getAutor().getNome());
        assertEquals("Inglês", artigo.getAutor().getNacionalidade());
    }
}