import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PublicacaoStrategyTest {
    @Test
    void testEstrategiaLivro() {
        Autor autor = new Autor("J.K. Rowling", "Britânica", false);
        Livro livro = new Livro("Harry Potter", autor, "Fantasia", true);
        Usuario usuario = new Usuario(autor.getNome(), 55);
        
        AutorDecorator autorDecorator = new AutorDecorator(usuario);
        autorDecorator.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro(livro));
        
        assertDoesNotThrow(() -> autorDecorator.publicar());
    }

    @Test
    void testEstrategiaArtigo() {
        Autor autor = new Autor("Alan Turing", "Britânico", true);
        Artigo artigo = new Artigo("On Computable Numbers", autor, "Ciência", true);
        Usuario usuario = new Usuario(autor.getNome(), 30);
        
        AutorDecorator autorDecorator = new AutorDecorator(usuario);
        autorDecorator.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo(artigo));
        
        assertDoesNotThrow(() -> autorDecorator.publicar());
    }

    @Test
    void testMudancaEstrategia() {
        Autor autor = new Autor("Autor Teste", "Nacional", true);
        Livro livro = new Livro("Livro Teste", autor, "Gênero", true);
        Artigo artigo = new Artigo("Artigo Teste", autor, "Gênero", true);
        Usuario usuario = new Usuario(autor.getNome(), 40);
        
        AutorDecorator autorDecorator = new AutorDecorator(usuario);
        
        // Primeiro com livro
        autorDecorator.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro(livro));
        assertDoesNotThrow(() -> autorDecorator.publicar());
        
        // Depois com artigo
        autorDecorator.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo(artigo));
        assertDoesNotThrow(() -> autorDecorator.publicar());
    }
}