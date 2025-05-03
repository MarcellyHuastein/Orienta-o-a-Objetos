import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {
    @Test
    void testNovoCampoIsUsuario() {
        Autor autorTradicional = new Autor("Jess", "Brasileira", false);
        Autor autorUsuario = new Autor("Gabriel", "Brasileira", true);
        
        assertFalse(autorTradicional.isUsuario());
        assertTrue(autorUsuario.isUsuario());
    }
}