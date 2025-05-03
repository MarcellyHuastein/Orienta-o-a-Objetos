import java.util.List;
import java.util.stream.Collectors;

public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public List<Livro> getObrasPublicadas() {
        return getLivros();
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        return getLivros().stream()
                .filter(l -> l.getGenero().equalsIgnoreCase(genero))
                .collect(Collectors.toList());
    }
}