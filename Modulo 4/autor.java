public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean isUsuario;  // Novo campo

    // Construtor atualizado
    public Autor(String nome, String nacionalidade, boolean isUsuario) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.isUsuario = isUsuario;
    }

    // Novo getter
    public boolean isUsuario() {
        return isUsuario;
    }

    // Métodos existentes mantidos...
}