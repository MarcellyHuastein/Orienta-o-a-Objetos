public class AutorDecorator extends UsuarioDecorator {
    public AutorDecorator(Usuario usuario) {
        super(usuario);
    }

    @Override
    public void publicar() {
        System.out.println("Autor " + usuario.getNome() + " iniciando publicação:");
        super.publicar();
    }
}