public class instagramApi {
    public instagramApi(String clientId, String clientSecret) {
        // simula credenciais
    }

    // Retorna mapa com id e status
    public String publishPhoto(String caption, String imageUrl) {
        System.out.println("[InstagramAPI] publishPhoto chamado com caption: " + caption + " image: " + imageUrl);
        return "ig_" + System.currentTimeMillis();
    }

    // Retorna estatísticas em formato diferente
    public java.util.Map<String, Integer> insights(String postId) {
        java.util.Map<String, Integer> m = new java.util.HashMap<>();
        m.put("likes", 20);
        m.put("shares", 3);
        m.put("comments", 5);
        return m;
    }
}
