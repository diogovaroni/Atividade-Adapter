public class respostaUnificada {
    public boolean sucesso;
    public String plataforma;
    public String mensagem;
    public Object dados; // pode ser publicacao, estatisticas, ou null

    public respostaUnificada(boolean sucesso, String plataforma, String mensagem, Object dados) {
        this.sucesso = sucesso;
        this.plataforma = plataforma;
        this.mensagem = mensagem;
        this.dados = dados;
    }

    @Override
    public String toString() {
        return "Resposta{sucesso=" + sucesso + ", plataforma=" + plataforma + ", mensagem=\"" + mensagem + "\", dados=" + dados + "}";
    }
}
