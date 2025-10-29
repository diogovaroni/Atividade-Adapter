public class tiktokApi {
    public tiktokApi(String secret) {}

    public String uploadVideo(String descricao, String videoUrl) {
        System.out.println("[TikTokAPI] uploadVideo: " + descricao + " video: " + videoUrl);
        return "tt_" + System.currentTimeMillis();
    }

    public java.util.Map<String, Integer> statsFor(String videoId) {
        java.util.Map<String, Integer> s = new java.util.HashMap<>();
        s.put("likes", 100);
        s.put("shares", 10);
        s.put("comments", 8);
        return s;
    }
}

