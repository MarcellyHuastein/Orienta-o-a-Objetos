import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private List<Livro> livros;

    public Pessoa(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return new ArrayList<>(livros); // Retorna cópia para encapsulamento
    }

    public void adicionarLivro(Livro livro) {
        if (!livros.contains(livro)) {
            livros.add(livro);
        }
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }
}