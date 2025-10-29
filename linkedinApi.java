public class linkedinApi {
    public linkedinApi(String apiKey) {}

    public String criarPost(String texto) {
        System.out.println("[LinkedInAPI] criarPost: " + texto);
        return "li_" + System.currentTimeMillis();
    }

    public int[] getStats(String postId) {
        // curtidas, shares, comentarios
        return new int[] { 5, 1, 0 };
    }
}

