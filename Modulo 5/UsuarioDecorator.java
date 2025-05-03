public abstract class UsuarioDecorator implements PublicavelInterface {
    protected Usuario usuario;
    protected EstrategiaPublicacao estrategiaPublicacao;

    public UsuarioDecorator(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    @Override
    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.executarPublicacao();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida");
        }
    }

    // Outros métodos decorator...
}