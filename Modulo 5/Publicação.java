// Interface estratégia
public interface EstrategiaPublicacao {
    void executarPublicacao();
}

// Estratégia para livros
public class EstrategiaPublicacaoLivro implements EstrategiaPublicacao {
    private Livro livro;

    public EstrategiaPublicacaoLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void executarPublicacao() {
        System.out.println("Publicando livro: " + livro.getTitulo());
        System.out.println("Processo específico para livros:");
        System.out.println("- Revisão editorial");
        System.out.println("- Design de capa");
        System.out.println("- ISBN registro");
    }
}

// Estratégia para artigos
public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao {
    private Artigo artigo;

    public EstrategiaPublicacaoArtigo(Artigo artigo) {
        this.artigo = artigo;
    }

    @Override
    public void executarPublicacao() {
        System.out.println("Publicando artigo: " + artigo.getTitulo());
        System.out.println("Processo específico para artigos:");
        System.out.println("- Revisão por pares");
        System.out.println("- Formatação acadêmica");
        System.out.println("- DOI registro");
    }
}