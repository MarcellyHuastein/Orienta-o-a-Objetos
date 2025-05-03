import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando autor
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        
        // Criando livro
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");
        livro.validarDisponibilidade();
        
        // Criando usuário
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        
        // Criando empréstimo
        Date agora = new Date();
        Emprestimo emprestimo = new Emprestimo(
            Arrays.asList(livro),
            usuario,
            agora,
            agora
        );
        
        // Exibindo informações
        System.out.println("\nLivro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}