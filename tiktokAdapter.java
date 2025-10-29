public class tiktokAdapter implements gerenciadorMidiaSocial {
    private tiktokApi api;
    private String plataformaNome = "TikTok";

    public tiktokAdapter(tiktokApi api) {
        this.api = api;
    }

    @Override
    public respostaUnificada agendarPublicacao(conteudo conteudo, String horarioISO) {
        String msg = "Agendado no TikTok para " + horarioISO + " -> " + conteudo;
        System.out.println("[Adapter TikTok] " + msg);
        return new respostaUnificada(true, plataformaNome, msg, null);
    }

    @Override
    public respostaUnificada publicarAgora(conteudo conteudo) {
        String postId = this.api.uploadVideo(conteudo.texto, conteudo.videoUrl);
        publicacao p = new publicacao(plataformaNome, postId, conteudo.id);
        return new respostaUnificada(true, plataformaNome, "Publicado no TikTok com id " + postId, p);
    }

    @Override
    public respostaUnificada obterEstatisticas(String plataformaPostId) {
        java.util.Map<String, Integer> raw = this.api.statsFor(plataformaPostId);
        estatisticas e = new estatisticas(plataformaNome, plataformaPostId,
                raw.getOrDefault("likes", 0),
                raw.getOrDefault("shares", 0),
                raw.getOrDefault("comments", 0));
        return new respostaUnificada(true, plataformaNome, "Estatísticas obtidas", e);
    }
}

