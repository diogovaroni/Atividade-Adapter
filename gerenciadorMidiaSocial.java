public interface gerenciadorMidiaSocial {
    // Agendar publicação (simples: retorna resposta unificada)
    public respostaUnificada agendarPublicacao(conteudo conteudo, String horarioISO);

    // Publicar imediatamente
    public respostaUnificada publicarAgora(conteudo conteudo);

    // Obter estatísticas de um post na plataforma
    public respostaUnificada obterEstatisticas(String plataformaPostId);
}
