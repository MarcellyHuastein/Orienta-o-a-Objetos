public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Autor autor = new Autor("Clarice Lispector", "Brasileira", false);
        Usuario usuario = new Usuario(autor.getNome(), 56);
        Livro livro = new Livro("A Hora da Estrela", autor, "Literatura", true);
        Artigo artigo = new Artigo("Feminino e Literatura", autor, "Ensaio", false);

        // Configurando decorator
        AutorDecorator autorDecorator = new AutorDecorator(usuario);

        // Publicando livro
        System.out.println("=== PUBLICANDO LIVRO ===");
        autorDecorator.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro(livro));
        autorDecorator.publicar();

        // Publicando artigo
        System.out.println("\n=== PUBLICANDO ARTIGO ===");
        autorDecorator.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo(artigo));
        autorDecorator.publicar();
    }
}