public class instagramAdapter implements gerenciadorMidiaSocial {
    private instagramApi api;
    private String plataformaNome = "Instagram";

    public instagramAdapter(instagramApi api) {
        this.api = api;
    }

    @Override
    public respostaUnificada agendarPublicacao(conteudo conteudo, String horarioISO) {
        String msg = "Agendado no Instagram para " + horarioISO + " -> " + conteudo;
        System.out.println("[Adapter Instagram] " + msg);
        return new respostaUnificada(true, plataformaNome, msg, null);
    }

    @Override
    public respostaUnificada publicarAgora(conteudo conteudo) {
        String postId = this.api.publishPhoto(conteudo.texto, conteudo.imagemUrl);
        publicacao p = new publicacao(plataformaNome, postId, conteudo.id);
        return new respostaUnificada(true, plataformaNome, "Publicado no Instagram com id " + postId, p);
    }

    @Override
    public respostaUnificada obterEstatisticas(String plataformaPostId) {
        java.util.Map<String, Integer> raw = this.api.insights(plataformaPostId);
        estatisticas e = new estatisticas(plataformaNome, plataformaPostId,
                raw.getOrDefault("likes", 0),
                raw.getOrDefault("shares", 0),
                raw.getOrDefault("comments", 0));
        return new respostaUnificada(true, plataformaNome, "Estatísticas obtidas", e);
    }
}

