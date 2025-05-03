import java.util.Date;
import java.util.List;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private List<Livro> livros;
    private Usuario usuario;

    public Emprestimo(List<Livro> livros, Usuario usuario, Date dataRetirada, Date dataDevolucao) {
        this.livros = livros;
        this.usuario = usuario;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        livros.forEach(l -> l.setDisponivel(false));
        usuario.adicionarEmprestimo(this);
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}