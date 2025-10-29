public class estatisticas {
    public String plataforma;
    public String postId;
    public int curtidas;
    public int compartilhamentos;
    public int comentarios;

    public estatisticas(String plataforma, String postId, int curtidas, int compartilhamentos, int comentarios) {
        this.plataforma = plataforma;
        this.postId = postId;
        this.curtidas = curtidas;
        this.compartilhamentos = compartilhamentos;
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Estatisticas{plataforma=" + plataforma + ", postId=" + postId +
               ", curtidas=" + curtidas + ", compartilhamentos=" + compartilhamentos +
               ", comentarios=" + comentarios + "}";
    }
}
