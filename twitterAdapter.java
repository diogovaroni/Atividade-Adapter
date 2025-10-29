public class twitterAdapter implements gerenciadorMidiaSocial {
    private twitterApi api;
    private String plataformaNome = "Twitter";

    public twitterAdapter(twitterApi api) {
        this.api = api;
    }

    @Override
    public respostaUnificada agendarPublicacao(conteudo conteudo, String horarioISO) {
        // Para o exemplo: vamos apenas registrar a intenção
        String msg = "Agendado no Twitter para " + horarioISO + " -> " + conteudo;
        System.out.println("[Adapter Twitter] " + msg);
        return new respostaUnificada(true, plataformaNome, msg, null);
    }

    @Override
    public respostaUnificada publicarAgora(conteudo conteudo) {
        String postId = this.api.postTweet(conteudo.texto);
        publicacao p = new publicacao(plataformaNome, postId, conteudo.id);
        String msg = "Publicado no Twitter com id " + postId;
        return new respostaUnificada(true, plataformaNome, msg, p);
    }

    @Override
    public respostaUnificada obterEstatisticas(String plataformaPostId) {
        int[] m = this.api.metrics(plataformaPostId);
        estatisticas e = new estatisticas(plataformaNome, plataformaPostId, m[0], m[1], m[2]);
        return new respostaUnificada(true, plataformaNome, "Estatísticas obtidas", e);
    }
}

