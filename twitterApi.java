// Simulação de uma API externa (incompatível)
public class twitterApi {
    // Autenticação ou inicialização simplificada
    public twitterApi(String token) {
        // simulando token
    }

    // Retorna id do post criado (gerado aqui)
    public String postTweet(String texto) {
        System.out.println("[TwitterAPI] postTweet chamado com texto: " + texto);
        return "tw_" + System.currentTimeMillis();
    }

    // Método próprio para pegar métricas
    public int[] metrics(String postId) {
        // retorna: curtidas, retweets, respostas
        return new int[] { 10, 2, 1 };
    }
}
