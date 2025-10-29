public class linkedinAdapter implements gerenciadorMidiaSocial {
    private linkedinApi api;
    private String plataformaNome = "LinkedIn";

    public linkedinAdapter(linkedinApi api) {
        this.api = api;
    }

    @Override
    public respostaUnificada agendarPublicacao(conteudo conteudo, String horarioISO) {
        String msg = "Agendado no LinkedIn para " + horarioISO + " -> " + conteudo;
        System.out.println("[Adapter LinkedIn] " + msg);
        return new respostaUnificada(true, plataformaNome, msg, null);
    }

    @Override
    public respostaUnificada publicarAgora(conteudo conteudo) {
        String postId = this.api.criarPost(conteudo.texto);
        publicacao p = new publicacao(plataformaNome, postId, conteudo.id);
        return new respostaUnificada(true, plataformaNome, "Publicado no LinkedIn com id " + postId, p);
    }

    @Override
    public respostaUnificada obterEstatisticas(String plataformaPostId) {
        int[] m = this.api.getStats(plataformaPostId);
        estatisticas e = new estatisticas(plataformaNome, plataformaPostId, m[0], m[1], m[2]);
        return new respostaUnificada(true, plataformaNome, "Estatísticas obtidas", e);
    }
}

