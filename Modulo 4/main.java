import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando autores (agora com o novo parâmetro)
        Autor autorTradicional = new Autor("Jessica Felix", "Brasileira", false);
        Autor autorUsuario = new Autor("Alan Turing", "Inglês", true);
        
        // Criando artigo
        Artigo artigo = new Artigo("Entendendo Compiladores", autorTradicional, "tecnologia", true);
        
        // Restante do código existente...
        System.out.println("Autor é usuário? " + autorUsuario.isUsuario());
        System.out.println("Artigo publicado? " + artigo.isPublicado());
    }
}