import java.util.HashMap;
import java.util.Map;

public class sistemaAgendamento {
    public static void main(String[] args) {
        // Simula leitura de configuração por ambiente (variável de ambiente ou arquivo)
        // Aqui usamos um mapa simples para cada plataforma
        Map<String, String> confTwitter = new HashMap<>();
        confTwitter.put("token", "TW_TOKEN_123");

        Map<String, String> confInstagram = new HashMap<>();
        confInstagram.put("clientId", "IG_ID");
        confInstagram.put("clientSecret", "IG_SECRET");

        Map<String, String> confLinkedin = new HashMap<>();
        confLinkedin.put("apiKey", "LI_KEY");

        Map<String, String> confTiktok = new HashMap<>();
        confTiktok.put("secret", "TT_SECRET");

        // Criar gerenciadores dinamicamente via factory
        gerenciadorMidiaSocial gmTwitter = socialMediaFactory.criar("twitter", confTwitter);
        gerenciadorMidiaSocial gmInstagram = socialMediaFactory.criar("instagram", confInstagram);
        gerenciadorMidiaSocial gmLinkedin = socialMediaFactory.criar("linkedin", confLinkedin);
        gerenciadorMidiaSocial gmTiktok = socialMediaFactory.criar("tiktok", confTiktok);

        // Conteúdos de exemplo
        conteudo c1 = new conteudo("c001", "Promoção: 50% OFF neste final de semana!");
        c1.imagemUrl = "http://imagens/exemplo1.jpg";

        conteudo c2 = new conteudo("c002", "Novo vídeo mostrando os bastidores.");
        c2.videoUrl = "http://videos/exemplo2.mp4";

        // Publicar agora em Twitter
        respostaUnificada r1 = gmTwitter.publicarAgora(c1);
        System.out.println(r1);

        // Agendar no Instagram
        respostaUnificada r2 = gmInstagram.agendarPublicacao(c1, "2025-11-01T10:00:00Z");
        System.out.println(r2);

        // Publicar vídeo no TikTok
        respostaUnificada r3 = gmTiktok.publicarAgora(c2);
        System.out.println(r3);

        // Publicar no LinkedIn
        respostaUnificada r4 = gmLinkedin.publicarAgora(c1);
        System.out.println(r4);

        // Obter estatísticas - demonstração de resposta unificada
        // Usamos os postIds retornados (quando disponíveis)
        if (r1.dados instanceof publicacao) {
            publicacao p = (publicacao) r1.dados;
            respostaUnificada stats = gmTwitter.obterEstatisticas(p.plataformaPostId);
            System.out.println(stats);
        }

        // Listagem simples das plataformas ativas (mostra que a factory configurável criou tudo)
        System.out.println("\nPlataformas ativas: Twitter, Instagram, LinkedIn, TikTok");
        System.out.println("Configuração dinâmica simulada via mapas de configuração.");
    }
}

