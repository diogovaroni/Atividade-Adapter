public class publicacao {
    public String plataforma;
    public String plataformaPostId;
    public String conteudoId;

    public publicacao(String plataforma, String plataformaPostId, String conteudoId) {
        this.plataforma = plataforma;
        this.plataformaPostId = plataformaPostId;
        this.conteudoId = conteudoId;
    }

    @Override
    public String toString() {
        return "Publicacao{plataforma=" + plataforma + ", postId=" + plataformaPostId + ", conteudoId=" + conteudoId + "}";
    }
}